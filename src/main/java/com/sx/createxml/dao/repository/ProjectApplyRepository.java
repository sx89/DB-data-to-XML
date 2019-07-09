package com.sx.createxml.dao.repository;

import com.sx.createxml.pojo.mysql.ProjectApply;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProjectApplyRepository extends JpaRepository<ProjectApply, Long> {

    ProjectApply getByWriterIs(String writer);

    Page<ProjectApply> getByWriterLike(String writer, Pageable pageable);

    ProjectApply getByNameIsAndWriterIs(String name, String writer);

    ProjectApply getByIdIsAndWriterIs(Long id, String writer);

    List<ProjectApply> findByWriterOrProjectAdminOrProjectDirectorOrChiefDesignerOrProjectManager(String writer, String projectAdmin, String projectDirector, String chiefDesigner, String projectManager);

    ProjectApply getById(Long id);

    Page<ProjectApply> findAll(Specification<ProjectApply> spec, Pageable pageable);

    @Override
    void deleteById(Long id);

    ProjectApply getByProcessId(String processId);

    ProjectApply getByRocketchatGroupId(String rocketchatGroupId);

    @Query(value = "select count(*) from teamcore_project_applay_basic", nativeQuery = true)
    Integer countAllProjects();

    List<ProjectApply> findAllByIsPass(Integer code);

    Integer countByIsPass(Integer code);

    ProjectApply getByNameIs(String name);

}
