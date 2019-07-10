package com.sx.createxml.pojo.mysql;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "teamcore_major_planning")
public class MajorPlanning {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long majorId;

    private Long subProjectId;

    private Long projectId;

    @Column(length = 256)
    private String dwgName;

    @Column(length = 256)
    private String dwgNo;

    private String dwgFrame;   //图幅

    private String dwgFigure;   //图别

    @Column(length = 128)
    private String scale;

    @Column(length = 256)
    private String owner;

    @Column(length = 100)
    private String designer;

    @Column(length = 100)
    private String proofreader;

    @Column(length = 256)
    private String checker;

    @Column(length = 256)
    private String decider;

    @Column(length = 256)
    private String chiefDesigner;

    @Column(length = 256)
    private String tempEditor;

    @Column(length = 256)
    private String processId;

    private Integer isPass;

    @Column(length = 2048)
    private String editors;

    @Column(length = 800)
    private String noPassDescription;

    private Integer fileLock;

    @Column(length = 256)
    private String alfrescoFileId;

    @Column(length = 256)
    private String alfrescoSignedFileId;

    @Column
    private Long fileSize;

    @Column
    Long signedFileSize;

    @Column(length = 256)
    private String majorPrincipal; //专业负责人


    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date createGmt;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date modifyGmt;

    @Column(length = 256)
    private String creator;

    @Column(length = 256)
    private String modifier;

    private String frameId;


    private String projectManager;      //项目经理

//    private String professionManager;   //专业负责人

    @Column(length = 256)
    private String stampPerson;

    private String filePath;

    private String signFilePath;

    private String signedFilePath;

    private String signnatureLocation;

    private String signnatureLocation2;

    private String signnatureLocation3;

    private String signnatureLocation4;


    private String sealLocation;

    private String architectureStamp;  //结构注册章

    private String buildingStamp;       //建筑注册章

    private String companyStamp;        //公司章

    @Column(name = "group_name")
    private String groupName;

    private String buildingCounter;         //建筑会签人

    private String architectureCounter;     //结构会签人

    private String drainageListCounter;  //给排水会签人

    private String electricCounter;         //电气会签人

    private String hvacCounter;             //暖动会签人

    private String landscapeCounter;      //景观会签人


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMajorId() {
        return majorId;
    }

    public void setMajorId(Long majorId) {
        this.majorId = majorId;
    }

    public Long getSubProjectId() {
        return subProjectId;
    }

    public void setSubProjectId(Long subProjectId) {
        this.subProjectId = subProjectId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getDwgName() {
        return dwgName;
    }

    public void setDwgName(String dwgName) {
        this.dwgName = dwgName;
    }

    public String getDwgNo() {
        return dwgNo;
    }

    public void setDwgNo(String dwgNo) {
        this.dwgNo = dwgNo;
    }

    public String getDwgFrame() {
        return dwgFrame;
    }

    public void setDwgFrame(String dwgFrame) {
        this.dwgFrame = dwgFrame;
    }

    public String getDwgFigure() {
        return dwgFigure;
    }

    public void setDwgFigure(String dwgFigure) {
        this.dwgFigure = dwgFigure;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public String getProofreader() {
        return proofreader;
    }

    public void setProofreader(String proofreader) {
        this.proofreader = proofreader;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker;
    }

    public String getDecider() {
        return decider;
    }

    public void setDecider(String decider) {
        this.decider = decider;
    }

    public String getChiefDesigner() {
        return chiefDesigner;
    }

    public void setChiefDesigner(String chiefDesigner) {
        this.chiefDesigner = chiefDesigner;
    }

    public String getTempEditor() {
        return tempEditor;
    }

    public void setTempEditor(String tempEditor) {
        this.tempEditor = tempEditor;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getEditors() {
        return editors;
    }

    public void setEditors(String editors) {
        this.editors = editors;
    }

    public Integer getIsPass() {
        return isPass;
    }

    public void setIsPass(Integer isPass) {
        this.isPass = isPass;
    }

    public Date getModifyGmt() {
        return modifyGmt;
    }

    public void setModifyGmt(Date modifyGmt) {
        this.modifyGmt = modifyGmt;
    }

    public String getNoPassDescription() {
        return noPassDescription;
    }

    public void setNoPassDescription(String noPassDescription) {
        this.noPassDescription = noPassDescription;
    }

    public Integer getFileLock() {
        return fileLock;
    }

    public void setFileLock(Integer fileLock) {
        this.fileLock = fileLock;
    }

    public String getAlfrescoFileId() {
        return alfrescoFileId;
    }

    public void setAlfrescoFileId(String alfrescoFileId) {
        this.alfrescoFileId = alfrescoFileId;
    }

    public String getAlfrescoSignedFileId() {
        return alfrescoSignedFileId;
    }

    public void setAlfrescoSignedFileId(String alfrescoSignedFileId) {
        this.alfrescoSignedFileId = alfrescoSignedFileId;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public Long getSignedFileSize() {
        return signedFileSize;
    }

    public void setSignedFileSize(Long signedFileSize) {
        this.signedFileSize = signedFileSize;
    }

    public String getMajorPrincipal() {
        return majorPrincipal;
    }

    public void setMajorPrincipal(String majorPrincipal) {
        this.majorPrincipal = majorPrincipal;
    }

    public Date getCreateGmt() {
        return createGmt;
    }

    public void setCreateGmt(Date createGmt) {
        this.createGmt = createGmt;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getFrameId() {
        return frameId;
    }

    public void setFrameId(String frameId) {
        this.frameId = frameId;
    }


    public String getProjectManager() {
        return projectManager;
    }

    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager;
    }

//    public String getProfessionManager() {
//        return professionManager;
//    }
//
//    public void setProfessionManager(String professionManager) {
//        this.professionManager = professionManager;
//    }

    public String getStampPerson() {
        return stampPerson;
    }

    public void setStampPerson(String stampPerson) {
        this.stampPerson = stampPerson;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getSignFilePath() {
        return signFilePath;
    }

    public void setSignFilePath(String signFilePath) {
        this.signFilePath = signFilePath;
    }

    public String getSignedFilePath() {
        return signedFilePath;
    }

    public void setSignedFilePath(String signedFilePath) {
        this.signedFilePath = signedFilePath;
    }

    public String getSignnatureLocation() {
        return signnatureLocation;
    }

    public void setSignnatureLocation(String signnatureLocation) {
        this.signnatureLocation = signnatureLocation;
    }

    public String getSignnatureLocation2() {
        return signnatureLocation2;
    }

    public void setSignnatureLocation2(String signnatureLocation2) {
        this.signnatureLocation2 = signnatureLocation2;
    }

    public String getSignnatureLocation3() {
        return signnatureLocation3;
    }

    public void setSignnatureLocation3(String signnatureLocation3) {
        this.signnatureLocation3 = signnatureLocation3;
    }

    public String getSignnatureLocation4() {
        return signnatureLocation4;
    }

    public void setSignnatureLocation4(String signnatureLocation4) {
        this.signnatureLocation4 = signnatureLocation4;
    }

    public String getSealLocation() {
        return sealLocation;
    }

    public void setSealLocation(String sealLocation) {
        this.sealLocation = sealLocation;
    }

    public String getArchitectureStamp() {
        return architectureStamp;
    }

    public void setArchitectureStamp(String architectureStamp) {
        this.architectureStamp = architectureStamp;
    }

    public String getBuildingStamp() {
        return buildingStamp;
    }

    public void setBuildingStamp(String buildingStamp) {
        this.buildingStamp = buildingStamp;
    }

    public String getCompanyStamp() {
        return companyStamp;
    }

    public void setCompanyStamp(String companyStamp) {
        this.companyStamp = companyStamp;
    }

    public String getDrainageListCounter() {
        return drainageListCounter;
    }

    public void setDrainageListCounter(String drainageListCounter) {
        this.drainageListCounter = drainageListCounter;
    }

    public String getElectricCounter() {
        return electricCounter;
    }

    public void setElectricCounter(String electricCounter) {
        this.electricCounter = electricCounter;
    }

    public String getHvacCounter() {
        return hvacCounter;
    }

    public void setHvacCounter(String hvacCounter) {
        this.hvacCounter = hvacCounter;
    }

    public String getArchitectureCounter() {
        return architectureCounter;
    }

    public void setArchitectureCounter(String architectureCounter) {
        this.architectureCounter = architectureCounter;
    }

    public String getBuildingCounter() {
        return buildingCounter;
    }

    public void setBuildingCounter(String buildingCounter) {
        this.buildingCounter = buildingCounter;
    }

    public String getLandscapeCounter() {
        return landscapeCounter;
    }

    public void setLandscapeCounter(String landscapeCounter) {
        this.landscapeCounter = landscapeCounter;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


}
