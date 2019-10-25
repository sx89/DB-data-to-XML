package com.sx.createxml.dao.repository2;

import com.sx.createxml.pojo.oracle.DtAttchFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DtAttchFileRepository extends JpaRepository<DtAttchFile,Long> {
    DtAttchFile getById(Integer Long);
}
