package com.sx.createxml.dao.repository2;

import com.sx.createxml.pojo.oracle.DtArchivesInfo;
import com.sx.createxml.pojo.oracle.DtDocumentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DtArchivesInfoRepository extends JpaRepository<DtArchivesInfo,Long> {
    DtArchivesInfo getById(Integer Long);
}
