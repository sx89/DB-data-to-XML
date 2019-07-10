package com.sx.createxml.pojo.mysql;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "teamcore_major_detail")
public class MajorDetail implements Cloneable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long subProjectId;

    private Long projectId;

    private Long stageId;

    //    @Column(length=256, nullable = false)
    private String stageName;

    private Integer stageOrder;

    private Long majorId;

    @Column(length = 256)
    private String stampPerson;

    //    @Column(length=256, nullable = false)
    private String majorName;

    private Integer majorOrder;

    @Column(length = 256)
    private String gitlabId;

    @Column(columnDefinition = "text")
    private String checker;

    @Column(columnDefinition = "text")
    private String decider;

    @Column(columnDefinition = "text")
    private String drawer;

    @Column(columnDefinition = "text")
    private String others;

    @Column(columnDefinition = "text")
    private String proofreader;

    @Column(columnDefinition = "text")
    private String list;

    //    @Column(length=256, nullable = false)
    private String owner;

    @Column(columnDefinition = "text")
    private String designers;

    @Column(length = 256)
    private String rocketchatGroupId;

    @Column(length = 256)
    private String alfrescoFolderId;

    @Column(length = 256)
    private String alfrescoArchiveFolderId;

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

    private String majorTag;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JSONField(format = "yyyy-MM-dd")
    @Column(length = 10)
    private Date signDate;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getStageId() {
        return stageId;
    }

    public void setStageId(Long stageId) {
        this.stageId = stageId;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public Integer getStageOrder() {
        return stageOrder;
    }

    public void setStageOrder(Integer stageOrder) {
        this.stageOrder = stageOrder;
    }

    public Long getMajorId() {
        return majorId;
    }

    public void setMajorId(Long majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public Integer getMajorOrder() {
        return majorOrder;
    }

    public void setMajorOrder(Integer majorOrder) {
        this.majorOrder = majorOrder;
    }

    public String getGitlabId() {
        return gitlabId;
    }

    public void setGitlabId(String gitlabId) {
        this.gitlabId = gitlabId;
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

    public String getProofreader() {
        return proofreader;
    }

    public void setProofreader(String proofreader) {
        this.proofreader = proofreader;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getStampPerson() {
        return stampPerson;
    }

    public void setStampPerson(String stampPerson) {
        this.stampPerson = stampPerson;
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

    public Date getCreateGmt() {
        return createGmt;
    }

    public void setCreateGmt(Date createGmt) {
        this.createGmt = createGmt;
    }

    public Date getModifyGmt() {
        return modifyGmt;
    }

    public void setModifyGmt(Date modifyGmt) {
        this.modifyGmt = modifyGmt;
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

    public String getAlfrescoArchiveFolderId() {
        return alfrescoArchiveFolderId;
    }

    public void setAlfrescoArchiveFolderId(String alfrescoArchiveFolderId) {
        this.alfrescoArchiveFolderId = alfrescoArchiveFolderId;
    }

    public String getMajorTag() {
        return majorTag;
    }

    public void setMajorTag(String majorTag) {
        this.majorTag = majorTag;
    }

    public String getDrawer() {
        return drawer;
    }

    public void setDrawer(String drawer) {
        this.drawer = drawer;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others;
    }

    public String getDesigners() {
        return designers;
    }

    public void setDesigners(String designers) {
        this.designers = designers;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    @Override
    public Object clone() {
        MajorDetail majorDetail = null;
        try {
            majorDetail = (MajorDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return majorDetail;
    }


    public Date getSignDate() {
        return signDate;
    }

    public void setSignDate(Date signDate) {
        this.signDate = signDate;
    }
}
