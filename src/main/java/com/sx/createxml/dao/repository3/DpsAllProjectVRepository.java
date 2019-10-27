package com.sx.createxml.dao.repository3;

import com.sx.createxml.pojo.oracleEBM.DpsAllProjectV;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DpsAllProjectVRepository extends JpaRepository<DpsAllProjectV,Integer> {


    DpsAllProjectV findByProjectId(Integer projectId);

    DpsAllProjectV findBySegment1(String segment1);

//    @Query("SELECT '*' from DpsAllProjectV WHERE segment1 like '%?1%'")
    List<DpsAllProjectV> findBySegment1StartingWith(String segment1);
}
