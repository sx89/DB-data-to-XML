package com.sx.createxml.service;

import com.sx.createxml.pojo.CreateXMLResult;
import com.sx.createxml.pojo.XMLDataStruct.Print4XML;
import com.sx.createxml.util.Class2XML;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author sunxu93@163.com
 * @date 19/7/9/009 13:16
 */
@Service
public class Oracle2XML2Oracle {
    public Object createXMLFromOracle() {
        ArrayList<Print4XML> print4XMLList = new FillPrintList().createPrint4XMLList();
        ArrayList<CreateXMLResult> xmlByDOM = Class2XML.createXMLByDOM(null, print4XMLList);

        //TODO  通过xmlByBom把图纸地址写回oracle
        return null;
    }
}
