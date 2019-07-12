package com.sx.createxml.controller;

import com.sx.createxml.dao.repository2.DtDocumentInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunxu93@163.com
 * @date 19/7/12/012 10:17
 */
@RestController

public class DtDocumentInfoController {
    @Autowired
    DtDocumentInfoRepository dtDocumentInfoRepository;

    @ResponseBody
    @RequestMapping("/updateDtDocumentMetaFileByMainid")
    public void updateDtDocumentMetaFileByMainid(String metaFile, String mainID) {
        dtDocumentInfoRepository.updateMetaFileByMainid(metaFile, mainID);
    }
}
