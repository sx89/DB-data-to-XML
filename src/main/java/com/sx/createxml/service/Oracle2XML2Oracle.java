package com.sx.createxml.service;

import com.sx.createxml.dao.repository.*;
import com.sx.createxml.dao.repository2.DtDocumentInfoRepository;
import com.sx.createxml.pojo.CreateXMLResult;
import com.sx.createxml.pojo.XMLDataStruct.PrintWithItem;
import com.sx.createxml.util.CreateXMLUtil;
import com.sx.createxml.util.FillPrintListUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author sunxu93@163.com
 * @date 19/7/9/009 13:16
 */
@Service
public class Oracle2XML2Oracle {

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
    FillPrintListUtil fillPrintListUtil;

    public Object createXMLFromOracle(Long id) {

        //指定存放xml的路径
        String destFolerPath = null ;
        //填满图纸链表
        ArrayList<PrintWithItem> printWithItemList = fillPrintListUtil.createPrint4XMLList(id);
        //创建xml
        ArrayList<CreateXMLResult> xmlByDOM = CreateXMLUtil.createXMLByDOM(destFolerPath, printWithItemList);
        //更新回数据库
        for (CreateXMLResult createXMLResult : xmlByDOM) {
            String createPath = createXMLResult.getCreatePath();
            String mainId = createXMLResult.getPrintId().toString();
            dtDocumentInfoRepository.updateMetaFileByMainid(createPath, mainId);
        }
        return "create xml success";
    }

}
