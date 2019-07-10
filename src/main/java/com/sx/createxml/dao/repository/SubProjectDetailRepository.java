package com.sx.createxml.dao.repository;

import com.sx.createxml.pojo.mysql.SubProjectDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubProjectDetailRepository extends JpaRepository<SubProjectDetail, Long> {

    List<SubProjectDetail> findAll();

    List<SubProjectDetail> findByProjectId(Long projectId);

    SubProjectDetail getById(Long id);


    void deleteById(Long id);

    List<SubProjectDetail> findByCollaborativeDesignAdminOrKnowledgeManagementAdminOrChiefDesignerOrProjectManagerOrElectromechanicalOwner(String collaborativeDesignAdmin, String knowledgeManagementAdmin, String chiefDesigner, String projectManager, String electromechanicalOwner);


    SubProjectDetail findByProjectIdAndName(Long projectId, String name);

    List<SubProjectDetail> findByMajorMetaMergeId(Long majorMetaMergeId);

}
