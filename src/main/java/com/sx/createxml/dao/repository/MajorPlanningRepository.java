package com.sx.createxml.dao.repository;

import com.sx.createxml.pojo.mysql.MajorPlanning;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface MajorPlanningRepository extends JpaRepository<MajorPlanning, Long> {

    Page<MajorPlanning> findAllByMajorId(Long majorId, Pageable pageable);

    MajorPlanning findByDwgNameAndDwgNo(String dwgName, String dwgNo);

    MajorPlanning findByDwgNameAndDwgNoAndMajorId(String dwgName, String dwgNo, Long majorId);

    List<MajorPlanning> findByProjectId(Long proejctId);

    List<MajorPlanning> findAllByMajorId(Long majorId);

    List<MajorPlanning> findAllByProjectIdAndSubProjectId(Long projectId, Long subProjectId);


    @Override
    void deleteById(Long id);

    MajorPlanning getById(Long id);

    List<MajorPlanning> findAllByMajorIdAndDwgNameLike(Long majorId, String dwgName);

    List<MajorPlanning> findAllByMajorIdAndDwgName(Long majorId, String dwgName);

    List<MajorPlanning> findAllByProjectId(Long projectId);

    List<MajorPlanning> findAllByProjectIdAndSubProjectIdAndMajorId(Long projectId, Long subProjectId, Long majorId);

//    MajorPlanning findByDwgNameAndDwgNoAndMajorId(String dwgName, String dwgNo, Long majorId);

    /**
     * 获取具体专业实例下的策划总数
     *
     * @param majorId
     * @return
     */
    Integer countByMajorId(Long majorId);

    /**
     * 获取具体专业实例下的已提交文件总是(已废除)
     *
     * @param majorId
     * @return
     */
    Integer countByMajorIdAndAlfrescoFileIdIsNotNull(Long majorId);

    /**
     * 获取具体专业实例下的已提交文件总数量
     *
     * @param majorId
     * @return
     */
    Integer countByMajorIdAndSignFilePathIsNotNull(Long majorId);

    /**
     * 获取具体专业实例下的某个审批状态下的数量
     *
     * @param majorId
     * @param isPass
     * @return
     */
    Integer countByMajorIdAndIsPass(Long majorId, Integer isPass);

    /**
     * 获取某个专业某个状态下的已签章文件个数(已废除)
     *
     * @param majorId
     * @param isPass
     * @return
     */
    Integer countByMajorIdAndIsPassAndAlfrescoSignedFileIdIsNotNull(Long majorId, Integer isPass);

    /**
     * 获取某个专业某个状态下的已签章文件个数
     *
     * @param majorId
     * @param isPass
     * @return
     */
    Integer countByMajorIdAndIsPassAndSignedFilePathIsNotNull(Long majorId, Integer isPass);

    /**
     * 获取某个专业某个流程某个审批状态下的策划总数
     *
     * @param majorId
     * @param isPass
     * @param processId
     * @return
     */
    Integer countByMajorIdAndIsPassAndProcessId(Long majorId, Integer isPass, String processId);

    /**
     * 获取某个专业某个流程某个审批状态下已被签过章的的策划总数(已废弃)
     *
     * @param majorId
     * @param isPass
     * @param processId
     * @return
     */
    Integer countByMajorIdAndIsPassAndProcessIdAndAlfrescoSignedFileIdIsNotNull(Long majorId, Integer isPass, String processId);

    /**
     * 获取某个专业某个流程某个审批状态下已被签过章的的策划总数
     *
     * @param majorId
     * @param isPass
     * @param processId
     * @return
     */
    Integer countByMajorIdAndIsPassAndProcessIdAndSignedFilePathIsNotNull(Long majorId, Integer isPass, String processId);

    /**
     * 查询专业中所有签章任务的流程ID
     *
     * @param majorId
     * @param isPass
     * @return
     */
    @Query("select distinct t.processId from MajorPlanning t where t.majorId = ?1 and t.isPass= ?2 and t.processId is not null")
    List<String> queryAllProgress(Long majorId, Integer isPass);

    /**
     * 获取某个专业某个状态下的未签章文件个数
     *
     * @param majorId
     * @param isPass
     * @return
     */
    Integer countByMajorIdAndIsPassAndAlfrescoSignedFileIdIsNull(Long majorId, Integer isPass);

    @Query("select  distinct projectId from MajorPlanning t where t.processId = ?1")
    List<Long> findDistinctProjectIds(String processId);

    @Query(value = "select count(*) from teamcore_major_planning", nativeQuery = true)
    Integer countAllDwg();

    Integer countByIsPass(Integer code);

    @Query(value = "select count(*) from teamcore_major_planning where alfresco_file_id is null", nativeQuery = true)
    Integer countAllUncompletedDwg();

    @Query(value = "select count(*) from teamcore_major_planning where alfresco_file_id is not null and is_pass is null", nativeQuery = true)
    Integer countAllToApproveDwg();

    @Query(value = "select count(*) from teamcore_major_planning where alfresco_file_id is not null and is_pass=2", nativeQuery = true)
    Integer countAllRefusedDwg();

    @Query(value = "select count(*) from teamcore_major_planning where alfresco_file_id is not null and is_pass=1", nativeQuery = true)
    Integer countAllApprovingDwg();

    @Query(value = "select count(*) from teamcore_major_planning where alfresco_file_id is not null and is_pass=3 and alfresco_signed_file_id is null", nativeQuery = true)
    Integer countAllApprovedAndUnsigned();

    @Query(value = "select count(*) from teamcore_major_planning where alfresco_file_id is not null and is_pass=3 and alfresco_signed_file_id is not null", nativeQuery = true)
    Integer countAllApprovedAndSigned();

    @Query(value = "select designer, count(*) as times from teamcore_major_planning where create_gmt > ?1 group by designer order by times desc limit 10", nativeQuery = true)
    List<Object> getTopDesigners(Date date);

    Integer countByMajorIdAndAlfrescoSignedFileIdIsNotNull(Long MajorId);

    List<MajorPlanning> findAll();

    MajorPlanning findByMajorIdAndSignFilePath(Long majorId, String filePath);

    Integer countByProjectId(Long projectId);

    Integer countByProjectIdAndSignFilePathNotNull(Long projectId);

    Integer countByProjectIdAndSignedFilePathNotNull(Long projectId);


}
