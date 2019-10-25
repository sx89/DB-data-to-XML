package com.sx.createxml.controller;

import com.sx.createxml.dao.repository.*;
import com.sx.createxml.service.Oracle2XML2Oracle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunxu93@163.com
 * @date 19/7/9/009 10:27
 */
@RestController
public class Oracle2XML2OracleController {
    @Autowired
    Oracle2XML2Oracle oracle2XML2Oracle;

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

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        System.err.println("hello world");
        return "hello";
    }

    @RequestMapping("createAllXml")
    public  Object createAllXml(){
        return oracle2XML2Oracle.createAllXml();
    }

    @RequestMapping("createXmlByProjectId")
    public Object createXMLByProjectId (@RequestParam Long id){
        return oracle2XML2Oracle.createXMLFromOracleByProjectId(id);
    }
    @RequestMapping("createxml")
    @ResponseBody
    public Object createXML(@RequestParam Long id) {
        return oracle2XML2Oracle.createXMLFromOracle(id);
    }
}
