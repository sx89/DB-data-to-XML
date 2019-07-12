package com.sx.createxml.pojo.flowcore;

import javax.persistence.*;


@Entity
@Table(name="flowcore_project_Process")

public class ProjectAndProcess {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long stageOrder;

    private Long projectId;

    private Long subProjectId;

    private String tableName;

    private String isoTableId;

    @Column(columnDefinition= "tinyint default 0")
    private Integer passOrNot;

    @Column(length = 64, nullable = false)
    private String processId;

    @Column(length = 64, nullable = false)
    private String type;

    @Column(columnDefinition="text", nullable = false)
    private String externalIds;

    @Column(length=256,nullable = false)
    private String title;

    @Column(length=1024)
    private String memo;

    @Column(columnDefinition="text")
    private String passGraphIds;

    @Column(columnDefinition="text")
    private String rejectGraphIds;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getExternalIds() {
        return externalIds;
    }

    public void setExternalIds(String externalIds) {
        this.externalIds = externalIds;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getPassGraphIds() {
        return passGraphIds;
    }

    public void setPassGraphIds(String passGraphIds) {
        this.passGraphIds = passGraphIds;
    }

    public String getRejectGraphIds() {
        return rejectGraphIds;
    }

    public void setRejectGraphIds(String rejectGraphIds) {
        this.rejectGraphIds = rejectGraphIds;
    }

    public Long getStageOrder() {
        return stageOrder;
    }

    public void setStageOrder(Long stageOrder) {
        this.stageOrder = stageOrder;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getSubProjectId() {
        return subProjectId;
    }

    public void setSubProjectId(Long subProjectId) {
        this.subProjectId = subProjectId;
    }

    public String getTableName() {return tableName;}

    public void setTableName(String tableName) {this.tableName = tableName;}

    public String getIsoTableId() {return isoTableId;}

    public void setIsoTableId(String isoTableId) {this.isoTableId = isoTableId;}

    public Integer getPassOrNot() {return passOrNot;}

    public void setPassOrNot(Integer passOrNot) { this.passOrNot = passOrNot; }
}

