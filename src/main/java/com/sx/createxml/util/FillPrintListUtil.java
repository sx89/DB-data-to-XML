package com.sx.createxml.util;

import com.sx.createxml.dao.repository.*;
import com.sx.createxml.dao.repository2.DtDocumentInfoRepository;
import com.sx.createxml.dao.repository3.DpsAllProjectVRepository;
import com.sx.createxml.dao.repository4.ProjectAndProcessRepository;
import com.sx.createxml.pojo.XMLDataStruct.PrintWithItem;
import com.sx.createxml.pojo.flowcore.ProjectAndProcess;
import com.sx.createxml.pojo.mysql.*;
import com.sx.createxml.pojo.oracle.DtDocumentInfo;
import com.sx.createxml.pojo.oracleEBM.DpsAllProjectV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


/**
 * @author sunxu93@163.com
 * @date 19/7/8/008 18:51
 */
@Component
public class FillPrintListUtil {
    @Autowired
    MetaItemRepository metaItemRepository;
    @Autowired
    MajorPlanningRepository majorPlanningRepository;
    @Autowired
    MajorDetailRepository majorDetailRepository;
    @Autowired
    ProjectApplyRepository projectApplyRepository;
    @Autowired
    SubProjectDetailRepository subProjectDetailRepository;
    @Autowired
    DtDocumentInfoRepository dtDocumentInfoRepository;
    @Autowired
    DpsAllProjectVRepository dpsAllProjectVRepository;
    @Autowired
    ProjectAndProcessRepository projectAndProcessRepository;
    @Autowired
    DwgFrameInformationRepository dwgFrameInformationRepository;
    @Autowired
    FillMetaItemsUtil fillMetaItemsUtil;
    public ArrayList<PrintWithItem> createPrint4XMLList() {
        //构造所有print的数组

        ArrayList<PrintWithItem> prints = new ArrayList<>();
        List<Integer> printIds = new ArrayList<>();
//            int[] printIds =OraclePrintID.printIds;
        List<DtDocumentInfo> all = dtDocumentInfoRepository.findAll();
        all.forEach(dtDocumentInfo -> {
            printIds.add(Integer.parseInt(dtDocumentInfo.getMainid()));
        });
        for (int i = 0; i < printIds.size(); i++) {
        //对print数组进行遍历,然后返回一个printList供生成xml的函数调用

            //对每一个oracle中的图纸id都从mysql三个表里找数剧
            Integer idInt = printIds.get(i);
            Long idL = Long.parseLong(idInt.toString());

            //把数据填入print4XML,用于生成XML
            PrintWithItem printWithItem = new PrintWithItem();
            printWithItem.setPrintId(idInt);

            //从majorplaning拿到mysql三个表的id
            MajorPlanning majorPlanning = majorPlanningRepository.getById(idL);
            Long subProjectId = majorPlanning.getSubProjectId();
            Long projectId = majorPlanning.getProjectId();
            Long majorId = majorPlanning.getMajorId();


            //从majorDetail表找数据
            MajorDetail majorDetail = majorDetailRepository.getById(majorId);

            //从projectApply表找数据
            ProjectApply projectApply = projectApplyRepository.getById(projectId);

            //从subProjectDetail表找数据
            SubProjectDetail subProjectDetail = subProjectDetailRepository.getById(subProjectId);

            //从EBM表找数据
            DpsAllProjectV dpsAllProjectV = dpsAllProjectVRepository.findByProjectId(projectId.intValue());

            String processId = majorPlanning.getProcessId();

            String dwgFrame = majorPlanning.getDwgFrame();

            String groupName = majorPlanning.getGroupName();

            //从flowcore表找数据
            ProjectAndProcess projectAndProcess = projectAndProcessRepository.getByProcessId(processId);

            DwgFrameInformation dwgFrameInformation =
                    dwgFrameInformationRepository.findByNameAndGroupName(dwgFrame,groupName);

            fillMetaItemsUtil.fillMetaItems(majorPlanning, majorDetail, subProjectDetail, projectApply,
                    dpsAllProjectV, projectAndProcess,dwgFrameInformation,printWithItem);
            //把填好的print放进prints(list)
            prints.add(printWithItem);


        }
        return prints;
    }


}
