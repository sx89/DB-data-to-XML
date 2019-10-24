//package com.sx.createxml.controller;
//
//import com.sx.createxml.dao.repository2.DtDocumentInfoRepository;
//import com.sx.createxml.dao.repository5.BookRepository;
//import com.sx.createxml.pojo.postgre.Book;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Map;
//
///**
// * @author sunxu93@163.com
// * @date 19/7/12/012 10:17
// */
//@RestController
//
//public class DtDocumentInfoController {
//    @Autowired
//    DtDocumentInfoRepository dtDocumentInfoRepository;
//
//
//    @Autowired
//    BookRepository bookRepository;
//
//    @ResponseBody
//    @RequestMapping("/updateDtDocumentMetaFileByMainid")
//    public void updateDtDocumentMetaFileByMainid(String metaFile, String mainID) {
//        dtDocumentInfoRepository.updateMetaFileByMainid(metaFile, mainID);
//
//    }
//
//    @ResponseBody
//    @RequestMapping("test/postgre")
//    public void testPostgre(){
//        Book book = new Book();
//        book.setName("sx");
//        book.setSn(123L);
//        bookRepository.save(book);
//    }
//}
