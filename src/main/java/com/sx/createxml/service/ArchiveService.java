//package com.sx.createxml.service;
//
//import com.sx.createxml.dao.repository.*;
//import com.sx.createxml.dao.repository2.DtDocumentInfoRepository;
//import com.sx.createxml.dao.repository5.ProjectApplyBasicRepository;
//import com.sx.createxml.pojo.postgre.ProjectApplyBasic;
//import com.sx.createxml.util.FillPrintListUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
///**
// * @author sunxu93@163.com
// * @date 19/10/22/022 9:12
// */
//@Service
//public class ArchiveService {
//
//
//    @Autowired
//    MetaItemRepository metaItemRepository;
//    @Autowired
//    MajorPlanningRepository majorPlanningRepository;
//    @Autowired
//    MajorDetailRepository majorDetailRepository;
//    @Autowired
//    ProjectApplyRepository p1;
//    @Autowired
//    SubProjectDetailRepository s1;
//    @Autowired
//    DtDocumentInfoRepository dtDocumentInfoRepository;
//    @Autowired
//    FillPrintListUtil fillPrintListUtil;
//    @Autowired
//    com.sx.createxml.dao.repository5.SubProjectDetailRepository s5;
//    @Autowired
//    ProjectApplyBasicRepository p5;
//
//
//    public void archiveProjectApplyBasic(Long projectId) {
//
//        com.sx.createxml.pojo.mysql.ProjectApply f = p1.getById(projectId);
//
//        com.sx.createxml.pojo.postgre.ProjectApplyBasic posgreProject = new ProjectApplyBasic(
//                f.getWriter(),
//                f.getApplicationDate(),
//                f.getCompanyName(),
//                f.getCollaborativeDesignAdmin(),
//                f.getCollaborativeDesignTelephoneNum(),
//                f.getKnowledgeManagementAdmin(),
//                f.getKnowledgeManagementTelephoneNum(),
//                f.getProjectType(),
//                f.getProjectLevel(),
//                f.getIsThreeDimensional(),
//                f.getBuildingArea(),
//                f.getName(),
//                f.getChiefDesigner(),
//                f.getTeamDirector(),
//                f.getProjectManager(),
//                f.getItemQuantity(),
//                f.getCapacity(),
//                f.getLeadingMajor(),
//                f.getBuildingDepartment(),
//                f.getArchitectureDepartment(),
//                f.getElectromechanicalDepartment(),
//                f.getProjectNumber(),
//                f.getEbmNumber(),
//                f.getTemplateType(),
//                f.getConstructionDepartment(),
//                f.getCooperativeDesignDepartment(), f.getProjectAdmin(),
//                f.getModifyGmt(),
//                f.getProcessId(),
//                f.getIsPass(),
//                f.getBasicPlanCheck(),
//                f.getTotalPlanCheck(),
//                f.getDetailPlanCheck(),
//                f.getDrawingPlanCheck(),
//                f.getNoPassDescription(),
//                f.getRocketchatGroupId(),
//                f.getAlfrescoFolderId(),
//                f.getAlfrescoArchiveFolderId(),
//                f.getMemberCountList(),
//                f.getProprietorCompanyName(),
//                f.getDescription(),
//                f.getProjectDirector(),
//                f.getDepartment(),
//                f.getGrade(),
//                f.getIsCooperate(),
//                f.getCooperateStage(),
//                f.getTeamStage(),
//                f.getPermissionOpenDate(),
//                f.getNotifyDate(),
//                f.getRemarks(),
//                f.getFileList(),
//                f.getProjectManagerCheck(),
//                f.getTechnicalQualityDepartmentCheck(),
//                f.getBusinessManagementDepartmentCheck(),
//                f.getProductionDepartmentCheck(),
//                f.isHasSubProject(),
//                f.getCreateGmt(),
//                f.getBuildingRegisterSeal(),
//                f.getStructureRegisterSeal(),
//                f.getDwgPrintApply(),
//                f.getDwgPrintCheck(),
//                f.getElecCheck(),
//                f.getElecDecide(),
//                f.getElecDwgGetter(),
//                f.getElecDwgCheck1(),
//                f.getElecDwgCheck2(),
//                f.getElecDwgCheck3(),
//                f.getExt1(),
//                f.getExt2(),
//                f.getExt3(),
//                f.getAllowDeleteProcessId(),
//                f.getIsAllowDeletePass()
//        );
//
//
//    }
//
//
//    public void archiveSubProjectDetail(int projectId) {
//
//    }
//
//}
