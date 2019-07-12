package com.sx.createxml.dao.repository4;
import com.sx.createxml.pojo.flowcore.ProjectAndProcess;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectAndProcessRepository extends JpaRepository<ProjectAndProcess,Long> {
    ProjectAndProcess getByProcessId(String processId);
    List<ProjectAndProcess> getByExternalIds(String externalIds);
    ProjectAndProcess findByProjectIdAndSubProjectIdAndStageOrderAndTableName(Long projectId, Long subProjectId, Long stageOrder, String tableName);
}
