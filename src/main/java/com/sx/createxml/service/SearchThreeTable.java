package com.sx.createxml.service;

import com.sx.createxml.dao.repository.MajorDetailRepository;
import com.sx.createxml.dao.repository.MajorPlanningRepository;
import com.sx.createxml.dao.repository.ProjectApplyRepository;
import com.sx.createxml.dao.repository.SubProjectDetailRepository;
import com.sx.createxml.pojo.MajorDetail;
import com.sx.createxml.pojo.OraclePrintID;
import com.sx.createxml.pojo.ProjectApply;
import com.sx.createxml.pojo.SubProjectDetail;
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
            //对每一个oracle中的图纸id都从mysql三个表里找数剧
            Integer idInt = printIds[i];
            Long idL = Long.parseLong(idInt.toString());

            //从majorDetail表找数据
            List<MajorDetail> allByProjectId = majorDetailRepository.findAllByProjectId(idL);
            MajorDetail majorDetail = allByProjectId.get(0);

            //从projectApply表找数据
            ProjectApply allByIsPass = projectApplyRepository.getById(idL);

            //从subProjectDetail表找数据
            List<SubProjectDetail> byProjectId = subProjectDetailRepository.findByProjectId(idL);
            SubProjectDetail subProjectDetail = byProjectId.get(0);

            //把数据填入print4XML,用于生成XML
            Print4XML print4XML = new Print4XML();

            //填文件基本元数据
            FileBasic fileBasic = print4XML.getFileBasic();

            //拿到存放文件基本元数据的key,value的hashmap
            HashMap<String, Object> hashMap = fileBasic.getHashMap();
            //拿到存放文件基本元数据的key的中文名字
            String[] listFileBasic = fileBasic.getListFileBasic();


            hashMap.put(listFileBasic[0], "文件级");
            hashMap.put(listFileBasic[1], "载体");
            hashMap.put(listFileBasic[2], "M");
            hashMap.put(listFileBasic[3], null);
            hashMap.put(listFileBasic[4], "文件后缀，一般是pdf");
            hashMap.put(listFileBasic[5], null);
            hashMap.put(listFileBasic[6], "pdf reader");
            hashMap.put(listFileBasic[7], null);

            //填业务基本元数据
            ServiceBasic serviceBasic = print4XML.getServiceBasic();
            hashMap =serviceBasic.getHashMap();



        }
    }
    public void searchThreeTable() {

    }

}
