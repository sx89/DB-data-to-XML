package com.sx.createxml.dao.repository2;

import org.springframework.data.jpa.repository.JpaRepository;
import  com.sx.createxml.pojo.oracle.DtDocumentInfo;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface DtDocumentInfoRepository extends JpaRepository<DtDocumentInfo,Integer> {

    List<DtDocumentInfo> getById(Integer id);

    @Override
    List<DtDocumentInfo> findAll();


    @Query(value = "update system.dt_document_info set metafile = :metaFile where mainid like :mainId",nativeQuery =
            true)
    @Modifying
    @Transactional
    void updateMetaFileByMainid(@Param("metaFile" )String metaFile, @Param("mainId") String mainId);
}
