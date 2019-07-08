package com.sx.createxml.pojo;

import com.alibaba.fastjson.annotation.JSONField;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "teamcore_project_applay_basic")
public class ProjectApply {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 256, nullable = false)
    private String writer;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    @Column(length = 10)
    private Date applicationDate;

    @Column(length = 256)
    private String companyName;  //单位名称


    @Column(length = 256)
    private String collaborativeDesignAdmin;

    @Column(length = 256)
    private String collaborativeDesignTelephoneNum;

    @Column(length = 256)
    private String knowledgeManagementAdmin;

    @Column(length = 256)
    private String knowledgeManagementTelephoneNum;

    @Column(length = 100)
    private String projectType;

    @Column(length = 100)
    private String projectLevel;

    @Column(length = 100)
    private String isThreeDimensional;


    private Float buildingArea;

    @Column(length = 256, nullable = false)
    private String name;

    @Column(length = 256)
    private String chiefDesigner;

    @Column(length = 256)
    private String teamDirector;

    @Column(length = 256)
    private String projectManager;


    private Long itemQuantity;


    private Float capacity;

    @Column(length = 256)
    private String leadingMajor;

    @Column(length = 256)
    private String buildingDepartment;

    @Column(length = 256)
    private String architectureDepartment;

    @Column(length = 256)
    private String electromechanicalDepartment;

    @Column(length = 256)
    private String projectNumber;

    @Column(length = 256)
    private String ebmNumber;


    private Integer templateType;


    private String constructionDepartment;  //建设单位

    private String cooperativeDesignDepartment;  //合作设计单位


    /**
     * 下面为废弃使用字段
     */


    @Column(length = 256)
    private String projectAdmin;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    @JSONField(format = "yyyy-MM-dd HH:mm")
    @Column(length = 10)
    private Date modifyGmt;

    @Column(length = 256)
    private String processId;

    private Integer isPass;

    private Integer basicPlanCheck;

    private Integer totalPlanCheck;

    private Integer detailPlanCheck;

    private Integer drawingPlanCheck;

    @Column(length = 800)
    private String noPassDescription;

    @Column(length = 256)
    private String rocketchatGroupId;

    @Column(length = 256)
    private String alfrescoFolderId;

    @Column(length = 256)
    private String alfrescoArchiveFolderId;

    @Column(columnDefinition = "text")
    private String memberCountList;


    @Column(length = 256)
    private String proprietorCompanyName;


    @Column(columnDefinition = "text")
    private String description;

    @Column(length = 256)
    private String projectDirector;


    @Column(length = 256)
    private String department;


    private Integer grade;


    private Integer isCooperate;

    @Column(length = 100)
    private String cooperateStage;

    @Column(length = 100)
    private String teamStage;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    @Column(length = 10)
    private Date permissionOpenDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    @Column(length = 10)
    private Date notifyDate;

    @Column(length = 512)
    private String remarks;

    private String fileList;


    private Integer projectManagerCheck;

    private Integer technicalQualityDepartmentCheck;

    private Integer businessManagementDepartmentCheck;

    private Integer productionDepartmentCheck;


    private boolean hasSubProject;


    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    @JSONField(format = "yyyy-MM-dd HH:mm")
    @Column(length = 10)
    private Date createGmt;


    @Column(length = 256)
    private String buildingRegisterSeal;

    @Column(length = 256)
    private String structureRegisterSeal;

    @Column(length = 256)
    private String dwgPrintApply;

    @Column(length = 256)
    private String dwgPrintCheck;

    @Column(length = 256)
    private String elecCheck;

    @Column(length = 256)
    private String elecDecide;

    @Column(length = 256)
    private String elecDwgGetter;

    @Column(length = 256)
    private String elecDwgCheck1;

    @Column(length = 256)
    private String elecDwgCheck2;

    @Column(length = 256)
    private String elecDwgCheck3;

    @Column(length = 512)
    private String ext1;

    @Column(length = 512)
    private String ext2;

    @Column(length = 512)
    private String ext3;

    private String allowDeleteProcessId;

    private Integer isAllowDeletePass;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    public String getCollaborativeDesignAdmin() {
        return collaborativeDesignAdmin;
    }

    public void setCollaborativeDesignAdmin(String collaborativeDesignAdmin) {
        this.collaborativeDesignAdmin = collaborativeDesignAdmin;
    }

    public String getCollaborativeDesignTelephoneNum() {
        return collaborativeDesignTelephoneNum;
    }

    public void setCollaborativeDesignTelephoneNum(String collaborativeDesignTelephoneNum) {
        this.collaborativeDesignTelephoneNum = collaborativeDesignTelephoneNum;
    }

    public String getKnowledgeManagementAdmin() {
        return knowledgeManagementAdmin;
    }

    public void setKnowledgeManagementAdmin(String knowledgeManagementAdmin) {
        this.knowledgeManagementAdmin = knowledgeManagementAdmin;
    }

    public String getKnowledgeManagementTelephoneNum() {
        return knowledgeManagementTelephoneNum;
    }

    public void setKnowledgeManagementTelephoneNum(String knowledgeManagementTelephoneNum) {
        this.knowledgeManagementTelephoneNum = knowledgeManagementTelephoneNum;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectLevel() {
        return projectLevel;
    }

    public void setProjectLevel(String projectLevel) {
        this.projectLevel = projectLevel;
    }

    public String getIsThreeDimensional() {
        return isThreeDimensional;
    }

    public void setIsThreeDimensional(String isThreeDimensional) {
        this.isThreeDimensional = isThreeDimensional;
    }

    public Float getBuildingArea() {
        return buildingArea;
    }

    public void setBuildingArea(Float buildingArea) {
        this.buildingArea = buildingArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChiefDesigner() {
        return chiefDesigner;
    }

    public void setChiefDesigner(String chiefDesigner) {
        this.chiefDesigner = chiefDesigner;
    }

    public String getTeamDirector() {
        return teamDirector;
    }

    public void setTeamDirector(String teamDirector) {
        this.teamDirector = teamDirector;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public Long getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(Long itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public Float getCapacity() {
        return capacity;
    }

    public void setCapacity(Float capacity) {
        this.capacity = capacity;
    }

    public String getLeadingMajor() {
        return leadingMajor;
    }

    public void setLeadingMajor(String leadingMajor) {
        this.leadingMajor = leadingMajor;
    }

    public String getBuildingDepartment() {
        return buildingDepartment;
    }

    public void setBuildingDepartment(String buildingDepartment) {
        this.buildingDepartment = buildingDepartment;
    }

    public String getArchitectureDepartment() {
        return architectureDepartment;
    }

    public void setArchitectureDepartment(String architectureDepartment) {
        this.architectureDepartment = architectureDepartment;
    }

    public String getElectromechanicalDepartment() {
        return electromechanicalDepartment;
    }

    public void setElectromechanicalDepartment(String electromechanicalDepartment) {
        this.electromechanicalDepartment = electromechanicalDepartment;
    }

    public String getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getEbmNumber() {
        return ebmNumber;
    }

    public void setEbmNumber(String ebmNumber) {
        this.ebmNumber = ebmNumber;
    }

    public Integer getTemplateType() {
        return templateType;
    }

    public void setTemplateType(Integer templateType) {
        this.templateType = templateType;
    }

    public String getConstructionDepartment() {
        return constructionDepartment;
    }

    public void setConstructionDepartment(String constructionDepartment) {
        this.constructionDepartment = constructionDepartment;
    }

    public String getCooperativeDesignDepartment() {
        return cooperativeDesignDepartment;
    }

    public void setCooperativeDesignDepartment(String cooperativeDesignDepartment) {
        this.cooperativeDesignDepartment = cooperativeDesignDepartment;
    }

    public Date getModifyGmt() {
        return modifyGmt;
    }

    public void setModifyGmt(Date modifyGmt) {
        this.modifyGmt = modifyGmt;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public Integer getIsPass() {
        return isPass;
    }

    public void setIsPass(Integer isPass) {
        this.isPass = isPass;
    }

    public Integer getBasicPlanCheck() {
        return basicPlanCheck;
    }

    public void setBasicPlanCheck(Integer basicPlanCheck) {
        this.basicPlanCheck = basicPlanCheck;
    }

    public Integer getTotalPlanCheck() {
        return totalPlanCheck;
    }

    public void setTotalPlanCheck(Integer totalPlanCheck) {
        this.totalPlanCheck = totalPlanCheck;
    }

    public Integer getDetailPlanCheck() {
        return detailPlanCheck;
    }

    public void setDetailPlanCheck(Integer detailPlanCheck) {
        this.detailPlanCheck = detailPlanCheck;
    }

    public Integer getDrawingPlanCheck() {
        return drawingPlanCheck;
    }

    public void setDrawingPlanCheck(Integer drawingPlanCheck) {
        this.drawingPlanCheck = drawingPlanCheck;
    }

    public String getNoPassDescription() {
        return noPassDescription;
    }

    public void setNoPassDescription(String noPassDescription) {
        this.noPassDescription = noPassDescription;
    }

    public String getRocketchatGroupId() {
        return rocketchatGroupId;
    }

    public void setRocketchatGroupId(String rocketchatGroupId) {
        this.rocketchatGroupId = rocketchatGroupId;
    }

    public String getAlfrescoFolderId() {
        return alfrescoFolderId;
    }

    public void setAlfrescoFolderId(String alfrescoFolderId) {
        this.alfrescoFolderId = alfrescoFolderId;
    }

    public String getAlfrescoArchiveFolderId() {
        return alfrescoArchiveFolderId;
    }

    public void setAlfrescoArchiveFolderId(String alfrescoArchiveFolderId) {
        this.alfrescoArchiveFolderId = alfrescoArchiveFolderId;
    }

    public String getMemberCountList() {
        return memberCountList;
    }

    public void setMemberCountList(String memberCountList) {
        this.memberCountList = memberCountList;
    }

    public String getProjectAdmin() {
        return projectAdmin;
    }

    public void setProjectAdmin(String projectAdmin) {
        this.projectAdmin = projectAdmin;
    }

    public String getProprietorCompanyName() {
        return proprietorCompanyName;
    }

    public void setProprietorCompanyName(String proprietorCompanyName) {
        this.proprietorCompanyName = proprietorCompanyName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProjectDirector() {
        return projectDirector;
    }

    public void setProjectDirector(String projectDirector) {
        this.projectDirector = projectDirector;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getIsCooperate() {
        return isCooperate;
    }

    public void setIsCooperate(Integer isCooperate) {
        this.isCooperate = isCooperate;
    }

    public String getCooperateStage() {
        return cooperateStage;
    }

    public void setCooperateStage(String cooperateStage) {
        this.cooperateStage = cooperateStage;
    }

    public String getTeamStage() {
        return teamStage;
    }

    public void setTeamStage(String teamStage) {
        this.teamStage = teamStage;
    }

    public Date getPermissionOpenDate() {
        return permissionOpenDate;
    }

    public void setPermissionOpenDate(Date permissionOpenDate) {
        this.permissionOpenDate = permissionOpenDate;
    }

    public Date getNotifyDate() {
        return notifyDate;
    }

    public void setNotifyDate(Date notifyDate) {
        this.notifyDate = notifyDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getFileList() {
        return fileList;
    }

    public void setFileList(String fileList) {
        this.fileList = fileList;
    }

    public Integer getProjectManagerCheck() {
        return projectManagerCheck;
    }

    public void setProjectManagerCheck(Integer projectManagerCheck) {
        this.projectManagerCheck = projectManagerCheck;
    }

    public Integer getTechnicalQualityDepartmentCheck() {
        return technicalQualityDepartmentCheck;
    }

    public void setTechnicalQualityDepartmentCheck(Integer technicalQualityDepartmentCheck) {
        this.technicalQualityDepartmentCheck = technicalQualityDepartmentCheck;
    }

    public Integer getBusinessManagementDepartmentCheck() {
        return businessManagementDepartmentCheck;
    }

    public void setBusinessManagementDepartmentCheck(Integer businessManagementDepartmentCheck) {
        this.businessManagementDepartmentCheck = businessManagementDepartmentCheck;
    }

    public Integer getProductionDepartmentCheck() {
        return productionDepartmentCheck;
    }

    public void setProductionDepartmentCheck(Integer productionDepartmentCheck) {
        this.productionDepartmentCheck = productionDepartmentCheck;
    }

    public boolean isHasSubProject() {
        return hasSubProject;
    }

    public void setHasSubProject(boolean hasSubProject) {
        this.hasSubProject = hasSubProject;
    }

    public Date getCreateGmt() {
        return createGmt;
    }

    public void setCreateGmt(Date createGmt) {
        this.createGmt = createGmt;
    }

    public String getBuildingRegisterSeal() {
        return buildingRegisterSeal;
    }

    public void setBuildingRegisterSeal(String buildingRegisterSeal) {
        this.buildingRegisterSeal = buildingRegisterSeal;
    }

    public String getStructureRegisterSeal() {
        return structureRegisterSeal;
    }

    public void setStructureRegisterSeal(String structureRegisterSeal) {
        this.structureRegisterSeal = structureRegisterSeal;
    }

    public String getDwgPrintApply() {
        return dwgPrintApply;
    }

    public void setDwgPrintApply(String dwgPrintApply) {
        this.dwgPrintApply = dwgPrintApply;
    }

    public String getDwgPrintCheck() {
        return dwgPrintCheck;
    }

    public void setDwgPrintCheck(String dwgPrintCheck) {
        this.dwgPrintCheck = dwgPrintCheck;
    }

    public String getElecCheck() {
        return elecCheck;
    }

    public void setElecCheck(String elecCheck) {
        this.elecCheck = elecCheck;
    }

    public String getElecDecide() {
        return elecDecide;
    }

    public void setElecDecide(String elecDecide) {
        this.elecDecide = elecDecide;
    }

    public String getElecDwgGetter() {
        return elecDwgGetter;
    }

    public void setElecDwgGetter(String elecDwgGetter) {
        this.elecDwgGetter = elecDwgGetter;
    }

    public String getElecDwgCheck1() {
        return elecDwgCheck1;
    }

    public void setElecDwgCheck1(String elecDwgCheck1) {
        this.elecDwgCheck1 = elecDwgCheck1;
    }

    public String getElecDwgCheck2() {
        return elecDwgCheck2;
    }

    public void setElecDwgCheck2(String elecDwgCheck2) {
        this.elecDwgCheck2 = elecDwgCheck2;
    }

    public String getElecDwgCheck3() {
        return elecDwgCheck3;
    }

    public void setElecDwgCheck3(String elecDwgCheck3) {
        this.elecDwgCheck3 = elecDwgCheck3;
    }

    public String getExt1() {
        return ext1;
    }

    public void setExt1(String ext1) {
        this.ext1 = ext1;
    }

    public String getExt2() {
        return ext2;
    }

    public void setExt2(String ext2) {
        this.ext2 = ext2;
    }

    public String getExt3() {
        return ext3;
    }

    public void setExt3(String ext3) {
        this.ext3 = ext3;
    }

    public String getAllowDeleteProcessId() {
        return allowDeleteProcessId;
    }

    public void setAllowDeleteProcessId(String allowDeleteProcessId) {
        this.allowDeleteProcessId = allowDeleteProcessId;
    }

    public Integer getIsAllowDeletePass() {
        return isAllowDeletePass;
    }

    public void setIsAllowDeletePass(Integer isAllowDeletePass) {
        this.isAllowDeletePass = isAllowDeletePass;
    }


}

