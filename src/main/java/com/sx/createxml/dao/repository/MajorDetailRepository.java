package com.sx.createxml.dao.repository;

import com.sx.createxml.pojo.MajorDetail;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MajorDetailRepository extends JpaRepository<MajorDetail, Long> {

    List<MajorDetail> findByCheckerLikeOrDeciderLikeOrProofreaderLikeOrOwnerOrDesignersLike(String checker, String decider, String proofReader, String owner, String designer);

    List<MajorDetail> findAllBySubProjectId(Long subProjectId);

    List<MajorDetail> findAllByProjectId(Long ProjectId);

    List<MajorDetail> findAllBySubProjectIdAndMajorName(Long subProjectId, String majorName, Sort sort);

    List<MajorDetail> findAllBySubProjectIdAndStageId(Long subProjectId, Long stageId, Sort sort);

    MajorDetail getById(Long id);

    MajorDetail getByRocketchatGroupId(String rocketchatGroupId);

    @Query("select t.majorId from MajorDetail t where t.id=?1")
    Long getMajorIdById(Long id);

    MajorDetail findByMajorNameAndSubProjectId(String majorName, Long subProjectId);

    List<MajorDetail> findBySubProjectIdAndStageName(Long subProjectId, String stageName);

    void deleteBySubProjectId(Long subProjectId);

    MajorDetail findByGitlabId(String gitlabId);

}
