package com.sx.createxml.controller;

import com.sx.createxml.dao.repository.*;
import com.sx.createxml.service.Oracle2XML2Oracle;
import com.sx.createxml.service.teamcore.ITeamcoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

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

    @Autowired
    @Qualifier("teamcoreServiceImpl")
    ITeamcoreService teamcoreService;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        System.err.println("hello world");
        return "hello";
    }

    @RequestMapping("createxml")
    @ResponseBody
    public Object createXML() {
        return oracle2XML2Oracle.createXMLFromOracle();
    }

    @RequestMapping("gitlab")
    public void gitlabAPI(@RequestParam String gitlabId, @RequestParam String filePath){
        Map<String, Object> result =
                teamcoreService.getFileSizeAndVersion(Long.valueOf(gitlabId), filePath);
        System.out.println("1");
    }

}
