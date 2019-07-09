package com.sx.createxml.controller;

import com.sx.createxml.service.Oracle2XML2Oracle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        System.err.println("hello world");
        return "hello";
    }

    @RequestMapping("createxml")
    @ResponseBody
    public Object createXML() {
        oracle2XML2Oracle.createXMLFromOracle();
        return null;
    }
}
