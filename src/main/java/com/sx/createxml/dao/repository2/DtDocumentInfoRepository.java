package com.sx.createxml.dao.repository2;

import org.springframework.data.jpa.repository.JpaRepository;
import  com.sx.createxml.pojo.oracle.DtDocumentInfo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DtDocumentInfoRepository extends JpaRepository<DtDocumentInfo,Integer> {

    List<DtDocumentInfo> getById(Integer id);

    @Override
    List<DtDocumentInfo> findAll();

    @Query("update dt_document_info set metafile = :metaFile where mainid like :mainId")
    void updateMetaFileByMainid(@Param("metaFile" )String metaFile, @Param("mainId") String mainId);
}
