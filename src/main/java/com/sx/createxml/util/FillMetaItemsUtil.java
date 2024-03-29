package com.sx.createxml.util;

import com.sx.createxml.dao.repository.MetaItemRepository;
import com.sx.createxml.dao.repository4.ActHiActInstRepository;
import com.sx.createxml.pojo.XMLDataStruct.ActionMetaItem;
import com.sx.createxml.pojo.XMLDataStruct.PrintWithItem;
import com.sx.createxml.pojo.flowcore.ActHiActInst;
import com.sx.createxml.pojo.flowcore.ProjectAndProcess;
import com.sx.createxml.pojo.mysql.*;
import com.sx.createxml.pojo.oracleEBM.DpsAllProjectV;
import com.sx.createxml.service.teamcore.ITeamcoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author sunxu93@163.com
 * @date 19/7/15/015 11:55
 */
@Component
public class FillMetaItemsUtil {

    @Autowired
    @Qualifier("teamcoreServiceImpl")
    ITeamcoreService teamcoreService;

    @Autowired
    ActHiActInstRepository actHiActInstRepository;

    @Autowired
    MetaItemRepository metaItemRepository;

    public void fillMetaItems(MajorPlanning majorPlanning, MajorDetail majorDetail,
                              SubProjectDetail subProjectDetail,
                              ProjectApply projectApply, DpsAllProjectV dpsAllProjectV,
                              ProjectAndProcess projectAndProcess,
                              DwgFrameInformation dwgFrameInformation, PrintWithItem printWithItem,
                              List<PdfAnnotation> pdfAnnotations) {


        filleItems(majorPlanning, majorDetail, subProjectDetail, projectApply, dpsAllProjectV,
                projectAndProcess, dwgFrameInformation, printWithItem, pdfAnnotations);

    }

    private void filleItems(MajorPlanning majorPlanning, MajorDetail majorDetail,
                            SubProjectDetail subProjectDetail,
                            ProjectApply projectApply, DpsAllProjectV dpsAllProjectV,
                            ProjectAndProcess projectAndProcess,
                            DwgFrameInformation dwgFrameInformation, PrintWithItem printWithItem,
                            List<PdfAnnotation> pdfAnnotations) {

        ArrayList<MetaItem> items = metaItemRepository.findAll();
        printWithItem.setItems(items);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 数据库2,3,30，文件大小，大小单位，版次
        String gitlabId = majorDetail.getGitlabId();

        String filePath = majorPlanning.getFilePath();
        //TODO teamcore 有问题,暂时设为空
//        if (StringUtils.isEmpty(filePath)) {
            items.get(2).setValue(null);
            items.get(3).setValue(null);
            items.get(30).setValue(null);
            items.get(32).setValue(null);
            items.get(4).setValue(null);
            items.get(6).setValue(null);

//        } else {
//            Map<String, Object> result =
//                    teamcoreService.getFileSizeAndVersion(Long.valueOf(gitlabId), filePath);
//
//            Map<String, Object> ans = (Map<String, Object>) result.get("result");
//            if (ans != null) {
//                String size = (String) ans.get("size");
//                int version = (int) ans.get("version");
//                String commitId = (String) ans.get("commitId");
//                int index = size.indexOf(" ");
//                items.get(2).setValue(size.substring(index + 1));
//                items.get(3).setValue(size.substring(0, index));
//                items.get(30).setValue(String.valueOf(version));
//                items.get(32).setValue("http://webviewer.arcplus-99.com:3010/samples/viewing/viewing/index.html?" +
//                        "key=demo:601439739@qq.com:743d76bd0107bdda259b1ca19b0cb79456070bb2f0c4d57a89&" +
//                        "url=http://teamcore.arcplus-99.com/wopi/files/majorDetail/downloadOtherType?gitlabId=" +
//                        gitlabId + "&commitId=" + commitId + "&fileFullPath=" + filePath + "&branchName=design");
//
//            }
//            String[] split = filePath.split("\\.");
//            String fileType = split[split.length - 1];
//            items.get(4).setValue(fileType);
//            items.get(6).setValue(fileType + "创建程序");
//
//        }

        items.get(0).setValue("文件级");
        items.get(1).setValue("电子");



        items.get(5).setValue(null);



        items.get(7).setValue(null);
        items.get(8).setValue(null);
        items.get(9).setValue(majorPlanning.getSubProjectId().toString());
        items.get(10).setValue(majorDetail.getMajorTag());
        items.get(11).setValue(majorDetail.getMajorName());
        items.get(12).setValue(null);
        items.get(13).setValue(null);
        items.get(14).setValue(null);
        items.get(15).setValue(null);
        items.get(16).setValue(majorPlanning.getFilePath());
        items.get(17).setValue(null);
        items.get(18).setValue(null);
        items.get(19).setValue("pds");
        items.get(20).setValue(projectApply.getEbmNumber());
        items.get(21).setValue(projectApply.getName());
        items.get(22).setValue(subProjectDetail.getName());
        items.get(23).setValue(subProjectDetail.getStageName());
        items.get(24).setValue(majorDetail.getStageName());
        if (dpsAllProjectV !=null){
            items.get(25).setValue(dpsAllProjectV.getOuName());
        }
        items.get(25).setValue(null);
        items.get(26).setValue(projectApply.getConstructionDepartment());
        items.get(27).setValue(null);
        items.get(28).setValue(majorPlanning.getDwgNo());
        items.get(29).setValue(majorPlanning.getDwgName());

        items.get(31).setValue(majorDetail.getMajorName());

        items.get(33).setValue(majorPlanning.getSignedFilePath());
        items.get(34).setValue(majorPlanning.getDwgFrame());
        items.get(35).setValue(majorPlanning.getScale());
        items.get(36).setValue(majorPlanning.getDesigner());
        items.get(37).setValue(majorPlanning.getOwner());
        items.get(38).setValue(majorDetail.getProofreader());
        items.get(39).setValue(majorPlanning.getDecider());
        items.get(40).setValue(majorPlanning.getChecker());
        items.get(41).setValue(majorPlanning.getMajorPrincipal());
        items.get(42).setValue(majorPlanning.getChiefDesigner());

        Date signDate = majorDetail.getSignDate();
        if (StringUtils.isEmpty(signDate)) {
            items.get(43).setValue(null);
        } else {
            items.get(43).setValue(sdf.format(signDate));
        }
        String dwg_name = dwgFrameInformation.getName();
        if (dwg_name.substring(dwg_name.length() - 1) == "竖") {
            items.get(44).setValue("竖");
        } else {
            items.get(44).setValue("横");
        }
        items.get(45).setValue(null);
        items.get(46).setValue(null);
        if (null == projectAndProcess) {
            items.get(47).setValue(null);
        } else {
            String memo = projectAndProcess.getMemo();
            items.get(47).setValue(memo);

        }

//TODO 放入 items  下一个 value没有值
        /**
         * 填充actionMetaItem链表
         */
        String processId = majorPlanning.getProcessId();
        if (processId != null) {

        List<ActionMetaItem> actionMetaItems = new ArrayList<>();
        List<ActHiActInst> actHiActInstRepositoryAll = actHiActInstRepository.getByProcInstId(processId);
        for (int i = 0; i < actHiActInstRepositoryAll.size(); i++) {

            ActHiActInst actHiActInst = actHiActInstRepositoryAll.get(i);

            ActionMetaItem actionMetaItem = new ActionMetaItem();

            String actType = actHiActInst.getActName();


            String actChargePersonPosition = null;
            //TODO 有的log.item 里面除了1和 同意  其他信息全是null,需要进行修改,


            if ((!StringUtils.isEmpty(actType)) && !("图纸审批申请".equals(actType))) {
                if ("设总".equals(actType)) {
                    actType = "审批";
                    actChargePersonPosition = "设总";
                } else if ("创建人".equals(actType)) {
                    actType = "申请";

                } else {
                    String substring = actType.substring(actType.length() - 1);

                    if ("人".equals(substring)) {
                        actChargePersonPosition = actType;
                    } else {
                        actChargePersonPosition = actType + "人";
                    }
                }
                actionMetaItem.setActionType(actType);
                actionMetaItem.setChargePersonPosition(actChargePersonPosition);
                actionMetaItem.setChargePersonName(actHiActInst.getAssignee());
                actionMetaItem.setChargePersonIp(null);
                actionMetaItem.setProcessOccurrenceTime(actHiActInst.getEndTime());
                actionMetaItem.setProcessOrder("1");
                actionMetaItem.setProcessingState("同意");

                actionMetaItems.add(actionMetaItem);
            }

        }
        printWithItem.setActionMetaItems(actionMetaItems);
        }

        printWithItem.setPdfAnnotations(pdfAnnotations);
    }
}


//        图纸的每个ItemValue的获取途径


//        文件   文件层级
//        载体	载体
//        单位	M
//        数量或大小
//        格式名称	文件后缀，一般是pdf
//        存址
//        文档创建程序名称	pdf reader
//        计算机文件名
//        设计资质
//        子项编号	teamcore_major_planning.sub_project_id
//        专业编号	teamcore_major_detail.major_tag
//        归档专业	teamcore_major_detail.major_name
//        文件分类
//        文件类别
//        文件类别编码
//        文件类别序号
//        关联文件	teamcore_major_planning.file_path
//        文件是否必归
//        文件捕获节点
//        文件来源	pds
//        工程编号	teamcore_project_apply_basic.ebm_number
//        工程名称	teamcore_project_apply_basic.name
//        子项名称	teamcore_subproject_detail.name
//        设计阶段	teamcore_subproject_detail.stage_name
//        设计专业	teamcore_major_detail.major_name
//        设计单位	EBM.APPS.DPS_ALL_PROJECT_V.OU_NAME
//        建设单位	teamcore_project_apply_basic.construction_department
//        合作设计单位
//        图纸编号	teamcore_major_planning.dwg_no
//        图纸名称	teamcore_major_planning.dwg_name
//        版次
//        电子源文件
//        预览文件
//        扫描件
//        图幅	teamcore_major_planning.dwg_frame
//        比例	teamcore_major_planning.scale
//        设计人	teamcore_major_planning.designer
//        绘图人	teamcore_major_planning.owner
//        校对人	teamcore_major_planning.proofreader
//        审核人	teamcore_major_planning.decider
//        审定人	teamcore_major_planning.checker
//        专业负责人	teamcore_major_planning.major_principal
//        设计总负责人	teamcore_major_planning.chief_designer
//        出图日期
//        图纸方向	teamcore_dwg_frame_information.name最后汉字
//        二维码
//        缩略图
//        备注
//
