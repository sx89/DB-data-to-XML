package com.sx.createxml.service;

import com.sx.createxml.dao.repository.MajorDetailRepository;
import com.sx.createxml.dao.repository.MajorPlanningRepository;
import com.sx.createxml.dao.repository.ProjectApplyRepository;
import com.sx.createxml.dao.repository.SubProjectDetailRepository;
import com.sx.createxml.pojo.*;
import com.sx.createxml.pojo.XMLDataStruct.FileBasic;
import com.sx.createxml.pojo.XMLDataStruct.Print4XML;
import com.sx.createxml.pojo.XMLDataStruct.ServiceBasic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author sunxu93@163.com
 * @date 19/7/8/008 18:51
 */
@Service
public class SearchThreeTable {

    @Autowired
    MajorPlanningRepository majorPlanningRepository;
    @Autowired
    MajorDetailRepository majorDetailRepository;
    @Autowired
    ProjectApplyRepository projectApplyRepository;
    @Autowired
    SubProjectDetailRepository subProjectDetailRepository;


    public void searchAllIdFromMajorPlanning() {
        OraclePrintID oraclePrintID = new OraclePrintID();
        int[] printIds = oraclePrintID.getPrintIds();

        for (int i = 0; i < printIds.length; i++) {
            Integer idInt = printIds[i];
            Long idL = Long.parseLong(idInt.toString());
            List<MajorDetail> allByProjectId = majorDetailRepository.findAllByProjectId(idL);
            MajorDetail majorDetail = allByProjectId.get(0);

            ProjectApply allByIsPass = projectApplyRepository.getById(idL);

            List<SubProjectDetail> byProjectId = subProjectDetailRepository.findByProjectId(idL);
            SubProjectDetail subProjectDetail = byProjectId.get(0);

            Print4XML print4XML = new Print4XML();
            FileBasic fileBasic = print4XML.getFileBasic();
            ServiceBasic serviceBasic = print4XML.getServiceBasic();

            HashMap<String, Object> hashMap = fileBasic.getHashMap();
            String[] listFileBasic = fileBasic.getListFileBasic();

            for (int j = 0; j < listFileBasic.length; j++) {
                hashMap.put(listFileBasic[j], majorDetail.getDrawer());
            }
            //TODO  把其他的值填进Print
            //得到一个PrintLIst

        }
    }
    public void searchThreeTable() {

    }

}
