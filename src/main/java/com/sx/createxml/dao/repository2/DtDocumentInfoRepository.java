//package com.sx.createxml.dao.repository2;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import  com.sx.createxml.pojo.oracle.DtDocumentInfo;
//import org.springframework.data.jpa.repository.Query;
//
//import java.util.List;
//
//public interface DtDocumentInfoRepository extends JpaRepository<DtDocumentInfo,Integer> {
//
//    List<DtDocumentInfo> getById(Integer id);
//
//    @Override
//    List<DtDocumentInfo> findAll();
//
//    @Query("update dt_document_info set metafile = ?1 where mainid like ?2")
//    void updateMetaFileByMainid(String metaFile,String mainid);
//}
