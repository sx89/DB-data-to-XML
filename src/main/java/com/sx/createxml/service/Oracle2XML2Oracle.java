package com.sx.createxml.service;

import com.sx.createxml.dao.repository.*;
import com.sx.createxml.pojo.CreateXMLResult;
import com.sx.createxml.pojo.XMLDataStruct.Print4XML;
import com.sx.createxml.util.Class2XML;
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
    FillPrintList fillPrintList;
    public Object createXMLFromOracle() {


        String destFolerPath = null ;
        ArrayList<Print4XML> print4XMLList = fillPrintList.createPrint4XMLList();
        ArrayList<CreateXMLResult> xmlByDOM = Class2XML.createXMLByDOM(destFolerPath,print4XMLList);

        //TODO  通过xmlByBom把图纸地址写回oracle
        return null;
    }
}
