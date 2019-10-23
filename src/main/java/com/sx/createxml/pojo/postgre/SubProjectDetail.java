package com.sx.createxml.pojo.postgre;

import javax.persistence.*;

@Entity
@Table(name = "teamcore_subproject_detail")
public class SubProjectDetail {

    public enum RefType {
        Relative, Absolute
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String designStage;



    private Long projectId;

    private String projectName;


    private Long majorMetaMergeId;


    private String name;

    private String majors;

    private Integer isThreeDimensional;

    private String cooperativeDesignStage;

    private String cooperativeDesignStageName;

    private String description;

    private String buildingDepartment;

    private String buildingTeam;

    private String architectureDepartment;

    private String architectureTeam;

    private String electromechanicalDepartment;

    private String electromechanicalTeam;

    private String collaborativeDesignAdmin;

    private String knowledgeManagementAdmin;

    private String chiefDesigner;

    private String projectManager;

    private String archiveApprover;

    private String electromechanicalOwner;

    private String buildingOwner;

    @Column(columnDefinition="text")
    private String buildingList;

    private String architectureOwner;

    @Column(columnDefinition="text")
    private String architectureList;

    private String drainageOwner;

    @Column(columnDefinition="text")
    private String drainageList;

    private String electricOwner;

    @Column(columnDefinition="text")
    private String electricList;

    private String hvacOwner;

    @Column(columnDefinition="text")
    private String hvacList;

    private String interiorOwner;

    @Column(columnDefinition="text")
    private String interiorList;

    private String landscapeOwner;

    @Column(columnDefinition="text")
    private String landscapeList;

    @Column(columnDefinition="text")
    private String wallList;

    private String wallOwner;

    private String gitlabId;

    @Column(columnDefinition="text")
    private String buildingDrawer;

    @Column(columnDefinition="text")
    private String buildingOthers;

    @Column(columnDefinition="text")
    private String buildingProofreader;

    @Column(columnDefinition="text")
    private String buildingDecider;

    @Column(columnDefinition="text")
    private String buildingChecker;

    @Column(columnDefinition="text")
    private String buildingDesigners;

    @Column(columnDefinition="text")
    private String architectureDrawer;

    @Column(columnDefinition="text")
    private String architectureOthers;

    @Column(columnDefinition="text")
    private String architectureProofreader;

    @Column(columnDefinition="text")
    private String architectureDecider;

    @Column(columnDefinition="text")
    private String architectureChecker;

    @Column(columnDefinition="text")
    private String architectureDesigners;

    @Column(columnDefinition="text")
    private String drainageDrawer;

    @Column(columnDefinition="text")
    private String drainageOthers;

    @Column(columnDefinition="text")
    private String drainageProofreader;

    @Column(columnDefinition="text")
    private String drainageDecider;

    @Column(columnDefinition="text")
    private String drainageChecker;

    @Column(columnDefinition="text")
    private String drainageDesigners;

    @Column(columnDefinition="text")
    private String electricDrawer;

    @Column(columnDefinition="text")
    private String electricOthers;

    @Column(columnDefinition="text")
    private String electricProofreader;

    @Column(columnDefinition="text")
    private String electricDecider;

    @Column(columnDefinition="text")
    private String electricChecker;

    @Column(columnDefinition="text")
    private String electricDesigners;

    @Column(columnDefinition="text")
    private String hvacDrawer;

    @Column(columnDefinition="text")
    private String hvacOthers;

    @Column(columnDefinition="text")
    private String hvacProofreader;

    @Column(columnDefinition="text")
    private String hvacDecider;

    @Column(columnDefinition="text")
    private String hvacChecker;

    @Column(columnDefinition="text")
    private String hvacDesigners;

    @Column(columnDefinition="text")
    private String interiorDrawer;

    @Column(columnDefinition="text")
    private String interiorOthers;

    @Column(columnDefinition="text")
    private String interiorProofreader;

    @Column(columnDefinition="text")
    private String interiorDecider;

    @Column(columnDefinition="text")
    private String interiorChecker;

    @Column(columnDefinition="text")
    private String interiorDesigners;

    @Column(columnDefinition="text")
    private String landscapeDrawer;

    @Column(columnDefinition="text")
    private String landscapeOthers;

    @Column(columnDefinition="text")
    private String landscapeProofreader;

    @Column(columnDefinition="text")
    private String landscapeDecider;

    @Column(columnDefinition="text")
    private String landscapeChecker;

    @Column(columnDefinition="text")
    private String landscapeDesigners;

    @Column(columnDefinition="text")
    private String wallDrawer;

    @Column(columnDefinition="text")
    private String wallOthers;

    @Column(columnDefinition="text")
    private String wallProofreader;

    @Column(columnDefinition="text")
    private String wallDecider;

    @Column(columnDefinition="text")
    private String wallChecker;

    @Column(columnDefinition="text")
    private String wallDesigners;

    private String stageName;

    @Enumerated(EnumType.STRING)
    //@Column(nullable = false, columnDefinition = "varchar(32) default 'Relative'")
    private RefType refType;


    private String buildingStamp;       //建筑注册章

    private String architectureStamp;  //结构注册章


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getDesignStage() {
        return designStage;
    }

    public void setDesignStage(String designStage) {
        this.designStage = designStage;
    }

    public Long getMajorMetaMergeId() {
        return majorMetaMergeId;
    }

    public void setMajorMetaMergeId(Long majorMetaMergeId) {
        this.majorMetaMergeId = majorMetaMergeId;
    }

    public Integer getIsThreeDimensional() {
        return isThreeDimensional;
    }

    public void setIsThreeDimensional(Integer isThreeDimensional) {
        this.isThreeDimensional = isThreeDimensional;
    }

    public String getCooperativeDesignStage() {
        return cooperativeDesignStage;
    }

    public void setCooperativeDesignStage(String cooperativeDesignStage) {
        this.cooperativeDesignStage = cooperativeDesignStage;
    }

    public String getCooperativeDesignStageName() {
        return cooperativeDesignStageName;
    }

    public void setCooperativeDesignStageName(String cooperativeDesignStageName) {
        this.cooperativeDesignStageName = cooperativeDesignStageName;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBuildingDepartment() {
        return buildingDepartment;
    }

    public void setBuildingDepartment(String buildingDepartment) {
        this.buildingDepartment = buildingDepartment;
    }

    public String getBuildingTeam() {
        return buildingTeam;
    }

    public void setBuildingTeam(String buildingTeam) {
        this.buildingTeam = buildingTeam;
    }

    public String getArchitectureDepartment() {
        return architectureDepartment;
    }

    public void setArchitectureDepartment(String architectureDepartment) {
        this.architectureDepartment = architectureDepartment;
    }

    public String getArchitectureTeam() {
        return architectureTeam;
    }

    public void setArchitectureTeam(String architectureTeam) {
        this.architectureTeam = architectureTeam;
    }

    public String getElectromechanicalDepartment() {
        return electromechanicalDepartment;
    }

    public void setElectromechanicalDepartment(String electromechanicalDepartment) {
        this.electromechanicalDepartment = electromechanicalDepartment;
    }

    public String getElectromechanicalTeam() {
        return electromechanicalTeam;
    }

    public void setElectromechanicalTeam(String electromechanicalTeam) {
        this.electromechanicalTeam = electromechanicalTeam;
    }


    public String getProjectName() {
        return projectName;
    }

    public SubProjectDetail(String designStage, Long projectId, String projectName, Long majorMetaMergeId, String name, String majors, Integer isThreeDimensional, String cooperativeDesignStage, String cooperativeDesignStageName, String description, String buildingDepartment, String buildingTeam, String architectureDepartment, String architectureTeam, String electromechanicalDepartment, String electromechanicalTeam, String collaborativeDesignAdmin, String knowledgeManagementAdmin, String chiefDesigner, String projectManager, String archiveApprover, String electromechanicalOwner, String buildingOwner, String buildingList, String architectureOwner, String architectureList, String drainageOwner, String drainageList, String electricOwner, String electricList, String hvacOwner, String hvacList, String interiorOwner, String interiorList, String landscapeOwner, String landscapeList, String wallList, String wallOwner, String gitlabId, String buildingDrawer, String buildingOthers, String buildingProofreader, String buildingDecider, String buildingChecker, String buildingDesigners, String architectureDrawer, String architectureOthers, String architectureProofreader, String architectureDecider, String architectureChecker, String architectureDesigners, String drainageDrawer, String drainageOthers, String drainageProofreader, String drainageDecider, String drainageChecker, String drainageDesigners, String electricDrawer, String electricOthers, String electricProofreader, String electricDecider, String electricChecker, String electricDesigners, String hvacDrawer, String hvacOthers, String hvacProofreader, String hvacDecider, String hvacChecker, String hvacDesigners, String interiorDrawer, String interiorOthers, String interiorProofreader, String interiorDecider, String interiorChecker, String interiorDesigners, String landscapeDrawer, String landscapeOthers, String landscapeProofreader, String landscapeDecider, String landscapeChecker, String landscapeDesigners, String wallDrawer, String wallOthers, String wallProofreader, String wallDecider, String wallChecker, String wallDesigners, String stageName, RefType refType, String buildingStamp, String architectureStamp) {
        this.designStage = designStage;
        this.projectId = projectId;
        this.projectName = projectName;
        this.majorMetaMergeId = majorMetaMergeId;
        this.name = name;
        this.majors = majors;
        this.isThreeDimensional = isThreeDimensional;
        this.cooperativeDesignStage = cooperativeDesignStage;
        this.cooperativeDesignStageName = cooperativeDesignStageName;
        this.description = description;
        this.buildingDepartment = buildingDepartment;
        this.buildingTeam = buildingTeam;
        this.architectureDepartment = architectureDepartment;
        this.architectureTeam = architectureTeam;
        this.electromechanicalDepartment = electromechanicalDepartment;
        this.electromechanicalTeam = electromechanicalTeam;
        this.collaborativeDesignAdmin = collaborativeDesignAdmin;
        this.knowledgeManagementAdmin = knowledgeManagementAdmin;
        this.chiefDesigner = chiefDesigner;
        this.projectManager = projectManager;
        this.archiveApprover = archiveApprover;
        this.electromechanicalOwner = electromechanicalOwner;
        this.buildingOwner = buildingOwner;
        this.buildingList = buildingList;
        this.architectureOwner = architectureOwner;
        this.architectureList = architectureList;
        this.drainageOwner = drainageOwner;
        this.drainageList = drainageList;
        this.electricOwner = electricOwner;
        this.electricList = electricList;
        this.hvacOwner = hvacOwner;
        this.hvacList = hvacList;
        this.interiorOwner = interiorOwner;
        this.interiorList = interiorList;
        this.landscapeOwner = landscapeOwner;
        this.landscapeList = landscapeList;
        this.wallList = wallList;
        this.wallOwner = wallOwner;
        this.gitlabId = gitlabId;
        this.buildingDrawer = buildingDrawer;
        this.buildingOthers = buildingOthers;
        this.buildingProofreader = buildingProofreader;
        this.buildingDecider = buildingDecider;
        this.buildingChecker = buildingChecker;
        this.buildingDesigners = buildingDesigners;
        this.architectureDrawer = architectureDrawer;
        this.architectureOthers = architectureOthers;
        this.architectureProofreader = architectureProofreader;
        this.architectureDecider = architectureDecider;
        this.architectureChecker = architectureChecker;
        this.architectureDesigners = architectureDesigners;
        this.drainageDrawer = drainageDrawer;
        this.drainageOthers = drainageOthers;
        this.drainageProofreader = drainageProofreader;
        this.drainageDecider = drainageDecider;
        this.drainageChecker = drainageChecker;
        this.drainageDesigners = drainageDesigners;
        this.electricDrawer = electricDrawer;
        this.electricOthers = electricOthers;
        this.electricProofreader = electricProofreader;
        this.electricDecider = electricDecider;
        this.electricChecker = electricChecker;
        this.electricDesigners = electricDesigners;
        this.hvacDrawer = hvacDrawer;
        this.hvacOthers = hvacOthers;
        this.hvacProofreader = hvacProofreader;
        this.hvacDecider = hvacDecider;
        this.hvacChecker = hvacChecker;
        this.hvacDesigners = hvacDesigners;
        this.interiorDrawer = interiorDrawer;
        this.interiorOthers = interiorOthers;
        this.interiorProofreader = interiorProofreader;
        this.interiorDecider = interiorDecider;
        this.interiorChecker = interiorChecker;
        this.interiorDesigners = interiorDesigners;
        this.landscapeDrawer = landscapeDrawer;
        this.landscapeOthers = landscapeOthers;
        this.landscapeProofreader = landscapeProofreader;
        this.landscapeDecider = landscapeDecider;
        this.landscapeChecker = landscapeChecker;
        this.landscapeDesigners = landscapeDesigners;
        this.wallDrawer = wallDrawer;
        this.wallOthers = wallOthers;
        this.wallProofreader = wallProofreader;
        this.wallDecider = wallDecider;
        this.wallChecker = wallChecker;
        this.wallDesigners = wallDesigners;
        this.stageName = stageName;
        this.refType = refType;
        this.buildingStamp = buildingStamp;
        this.architectureStamp = architectureStamp;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getCollaborativeDesignAdmin() {
        return collaborativeDesignAdmin;
    }

    public void setCollaborativeDesignAdmin(String collaborativeDesignAdmin) {
        this.collaborativeDesignAdmin = collaborativeDesignAdmin;
    }

    public String getKnowledgeManagementAdmin() {
        return knowledgeManagementAdmin;
    }

    public void setKnowledgeManagementAdmin(String knowledgeManagementAdmin) {
        this.knowledgeManagementAdmin = knowledgeManagementAdmin;
    }

    public String getChiefDesigner() {
        return chiefDesigner;
    }

    public void setChiefDesigner(String chiefDesigner) {
        this.chiefDesigner = chiefDesigner;
    }

    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

    public String getElectromechanicalOwner() {
        return electromechanicalOwner;
    }

    public void setElectromechanicalOwner(String electromechanicalOwner) {
        this.electromechanicalOwner = electromechanicalOwner;
    }

    public String getBuildingOwner() {
        return buildingOwner;
    }

    public void setBuildingOwner(String buildingOwner) {
        this.buildingOwner = buildingOwner;
    }

    public String getBuildingList() {
        return buildingList;
    }

    public void setBuildingList(String buildingList) {
        this.buildingList = buildingList;
    }

    public String getArchitectureOwner() {
        return architectureOwner;
    }

    public void setArchitectureOwner(String architectureOwner) {
        this.architectureOwner = architectureOwner;
    }

    public String getArchitectureList() {
        return architectureList;
    }

    public void setArchitectureList(String architectureList) {
        this.architectureList = architectureList;
    }

    public String getDrainageOwner() {
        return drainageOwner;
    }

    public void setDrainageOwner(String drainageOwner) {
        this.drainageOwner = drainageOwner;
    }

    public String getDrainageList() {
        return drainageList;
    }

    public void setDrainageList(String drainageList) {
        this.drainageList = drainageList;
    }

    public String getElectricOwner() {
        return electricOwner;
    }

    public void setElectricOwner(String electricOwner) {
        this.electricOwner = electricOwner;
    }

    public String getElectricList() {
        return electricList;
    }

    public void setElectricList(String electricList) {
        this.electricList = electricList;
    }

    public String getHvacOwner() {
        return hvacOwner;
    }

    public void setHvacOwner(String hvacOwner) {
        this.hvacOwner = hvacOwner;
    }

    public String getHvacList() {
        return hvacList;
    }

    public void setHvacList(String hvacList) {
        this.hvacList = hvacList;
    }

    public String getInteriorOwner() {
        return interiorOwner;
    }

    public void setInteriorOwner(String interiorOwner) {
        this.interiorOwner = interiorOwner;
    }

    public String getInteriorList() {
        return interiorList;
    }

    public void setInteriorList(String interiorList) {
        this.interiorList = interiorList;
    }

    public String getLandscapeOwner() {
        return landscapeOwner;
    }

    public void setLandscapeOwner(String landscapeOwner) {
        this.landscapeOwner = landscapeOwner;
    }

    public String getLandscapeList() {
        return landscapeList;
    }

    public void setLandscapeList(String landscapeList) {
        this.landscapeList = landscapeList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getGitlabId() {
        return gitlabId;
    }

    public void setGitlabId(String gitlabId) {
        this.gitlabId = gitlabId;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }


    @Override
    public Object clone() {
        SubProjectDetail subProjectDetail = null;
        try {
            subProjectDetail = (SubProjectDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return subProjectDetail;
    }

    public String getBuildingStamp() {
        return buildingStamp;
    }

    public void setBuildingStamp(String buildingStamp) {
        this.buildingStamp = buildingStamp;
    }

    public String getArchitectureStamp() {
        return architectureStamp;
    }

    public void setArchitectureStamp(String architectureStamp) {
        this.architectureStamp = architectureStamp;
    }
    public RefType getRefType() {
        return refType;
    }

    public void setRefType(RefType refType) {
        this.refType = refType;
    }

    public String getWallOwner() {
        return wallOwner;
    }

    public void setWallOwner(String wallOwner) {
        this.wallOwner = wallOwner;
    }

    public String getWallList() {
        return wallList;
    }

    public void setWallList(String wallList) {
        this.wallList = wallList;
    }

    public String getBuildingDrawer() {
        return buildingDrawer;
    }

    public void setBuildingDrawer(String buildingDrawer) {
        this.buildingDrawer = buildingDrawer;
    }

    public String getBuildingOthers() {
        return buildingOthers;
    }

    public void setBuildingOthers(String buildingOthers) {
        this.buildingOthers = buildingOthers;
    }

    public String getBuildingProofreader() {
        return buildingProofreader;
    }

    public void setBuildingProofreader(String buildingProofreader) {
        this.buildingProofreader = buildingProofreader;
    }

    public String getBuildingDecider() {
        return buildingDecider;
    }

    public void setBuildingDecider(String buildingDecider) {
        this.buildingDecider = buildingDecider;
    }

    public String getBuildingChecker() {
        return buildingChecker;
    }

    public void setBuildingChecker(String buildingChecker) {
        this.buildingChecker = buildingChecker;
    }

    public String getBuildingDesigners() {
        return buildingDesigners;
    }

    public void setBuildingDesigners(String buildingDesigners) {
        this.buildingDesigners = buildingDesigners;
    }

    public String getArchitectureDrawer() {
        return architectureDrawer;
    }

    public void setArchitectureDrawer(String architectureDrawer) {
        this.architectureDrawer = architectureDrawer;
    }

    public String getArchitectureOthers() {
        return architectureOthers;
    }

    public void setArchitectureOthers(String architectureOthers) {
        this.architectureOthers = architectureOthers;
    }

    public String getArchitectureProofreader() {
        return architectureProofreader;
    }

    public void setArchitectureProofreader(String architectureProofreader) {
        this.architectureProofreader = architectureProofreader;
    }

    public String getArchitectureDecider() {
        return architectureDecider;
    }

    public void setArchitectureDecider(String architectureDecider) {
        this.architectureDecider = architectureDecider;
    }

    public String getArchitectureChecker() {
        return architectureChecker;
    }

    public void setArchitectureChecker(String architectureChecker) {
        this.architectureChecker = architectureChecker;
    }

    public String getArchitectureDesigners() {
        return architectureDesigners;
    }

    public void setArchitectureDesigners(String architectureDesigners) {
        this.architectureDesigners = architectureDesigners;
    }

    public String getDrainageDrawer() {
        return drainageDrawer;
    }

    public void setDrainageDrawer(String drainageDrawer) {
        this.drainageDrawer = drainageDrawer;
    }

    public String getDrainageOthers() {
        return drainageOthers;
    }

    public void setDrainageOthers(String drainageOthers) {
        this.drainageOthers = drainageOthers;
    }

    public String getDrainageProofreader() {
        return drainageProofreader;
    }

    public void setDrainageProofreader(String drainageProofreader) {
        this.drainageProofreader = drainageProofreader;
    }

    public String getDrainageDecider() {
        return drainageDecider;
    }

    public void setDrainageDecider(String drainageDecider) {
        this.drainageDecider = drainageDecider;
    }

    public String getDrainageChecker() {
        return drainageChecker;
    }

    public void setDrainageChecker(String drainageChecker) {
        this.drainageChecker = drainageChecker;
    }

    public String getDrainageDesigners() {
        return drainageDesigners;
    }

    public void setDrainageDesigners(String drainageDesigners) {
        this.drainageDesigners = drainageDesigners;
    }

    public String getElectricDrawer() {
        return electricDrawer;
    }

    public void setElectricDrawer(String electricDrawer) {
        this.electricDrawer = electricDrawer;
    }

    public String getElectricOthers() {
        return electricOthers;
    }

    public void setElectricOthers(String electricOthers) {
        this.electricOthers = electricOthers;
    }

    public String getElectricProofreader() {
        return electricProofreader;
    }

    public void setElectricProofreader(String electricProofreader) {
        this.electricProofreader = electricProofreader;
    }

    public String getElectricDecider() {
        return electricDecider;
    }

    public void setElectricDecider(String electricDecider) {
        this.electricDecider = electricDecider;
    }

    public String getElectricChecker() {
        return electricChecker;
    }

    public void setElectricChecker(String electricChecker) {
        this.electricChecker = electricChecker;
    }

    public String getElectricDesigners() {
        return electricDesigners;
    }

    public void setElectricDesigners(String electricDesigners) {
        this.electricDesigners = electricDesigners;
    }

    public String getHvacDrawer() {
        return hvacDrawer;
    }

    public void setHvacDrawer(String hvacDrawer) {
        this.hvacDrawer = hvacDrawer;
    }

    public String getHvacOthers() {
        return hvacOthers;
    }

    public void setHvacOthers(String hvacOthers) {
        this.hvacOthers = hvacOthers;
    }

    public String getHvacProofreader() {
        return hvacProofreader;
    }

    public void setHvacProofreader(String hvacProofreader) {
        this.hvacProofreader = hvacProofreader;
    }

    public String getHvacDecider() {
        return hvacDecider;
    }

    public void setHvacDecider(String hvacDecider) {
        this.hvacDecider = hvacDecider;
    }

    public String getHvacChecker() {
        return hvacChecker;
    }

    public void setHvacChecker(String hvacChecker) {
        this.hvacChecker = hvacChecker;
    }

    public String getHvacDesigners() {
        return hvacDesigners;
    }

    public void setHvacDesigners(String hvacDesigners) {
        this.hvacDesigners = hvacDesigners;
    }

    public String getInteriorDrawer() {
        return interiorDrawer;
    }

    public void setInteriorDrawer(String interiorDrawer) {
        this.interiorDrawer = interiorDrawer;
    }

    public String getInteriorOthers() {
        return interiorOthers;
    }

    public void setInteriorOthers(String interiorOthers) {
        this.interiorOthers = interiorOthers;
    }

    public String getInteriorProofreader() {
        return interiorProofreader;
    }

    public void setInteriorProofreader(String interiorProofreader) {
        this.interiorProofreader = interiorProofreader;
    }

    public String getInteriorDecider() {
        return interiorDecider;
    }

    public void setInteriorDecider(String interiorDecider) {
        this.interiorDecider = interiorDecider;
    }

    public String getInteriorChecker() {
        return interiorChecker;
    }

    public void setInteriorChecker(String interiorChecker) {
        this.interiorChecker = interiorChecker;
    }

    public String getInteriorDesigners() {
        return interiorDesigners;
    }

    public void setInteriorDesigners(String interiorDesigners) {
        this.interiorDesigners = interiorDesigners;
    }

    public String getLandscapeDrawer() {
        return landscapeDrawer;
    }

    public void setLandscapeDrawer(String landscapeDrawer) {
        this.landscapeDrawer = landscapeDrawer;
    }

    public String getLandscapeOthers() {
        return landscapeOthers;
    }

    public void setLandscapeOthers(String landscapeOthers) {
        this.landscapeOthers = landscapeOthers;
    }

    public String getLandscapeProofreader() {
        return landscapeProofreader;
    }

    public void setLandscapeProofreader(String landscapeProofreader) {
        this.landscapeProofreader = landscapeProofreader;
    }

    public String getLandscapeDecider() {
        return landscapeDecider;
    }

    public void setLandscapeDecider(String landscapeDecider) {
        this.landscapeDecider = landscapeDecider;
    }

    public String getLandscapeChecker() {
        return landscapeChecker;
    }

    public void setLandscapeChecker(String landscapeChecker) {
        this.landscapeChecker = landscapeChecker;
    }

    public String getLandscapeDesigners() {
        return landscapeDesigners;
    }

    public void setLandscapeDesigners(String landscapeDesigners) {
        this.landscapeDesigners = landscapeDesigners;
    }

    public String getWallDrawer() {
        return wallDrawer;
    }

    public void setWallDrawer(String wallDrawer) {
        this.wallDrawer = wallDrawer;
    }

    public String getWallOthers() {
        return wallOthers;
    }

    public void setWallOthers(String wallOthers) {
        this.wallOthers = wallOthers;
    }

    public String getWallProofreader() {
        return wallProofreader;
    }

    public void setWallProofreader(String wallProofreader) {
        this.wallProofreader = wallProofreader;
    }

    public String getWallDecider() {
        return wallDecider;
    }

    public void setWallDecider(String wallDecider) {
        this.wallDecider = wallDecider;
    }

    public String getWallChecker() {
        return wallChecker;
    }

    public void setWallChecker(String wallChecker) {
        this.wallChecker = wallChecker;
    }

    public String getWallDesigners() {
        return wallDesigners;
    }

    public void setWallDesigners(String wallDesigners) {
        this.wallDesigners = wallDesigners;
    }

    public String getArchiveApprover() {
        return archiveApprover;
    }

    public void setArchiveApprover(String archiveApprover) {
        this.archiveApprover = archiveApprover;
    }
}
