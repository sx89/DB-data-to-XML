package com.sx.createxml.pojo.oracleEBM;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "DPS_ALL_PROJECT_V",schema = "APPS")
public class DpsAllProjectV {

    @Id
    @Column(name = "PROJECT_ID")
    private Integer projectId;

    @Column(name = "SEGMENT1")
    private String segment1;

    @Column(name = "PROJECT_NAME")
    private String projectName;

    @Column(name = "PROJECT_TYPE")
    private String projectType;

    @Column(name = "PROJECT_STATUS")
    private String projectStatus;

    @Column(name = "OU_NAME")
    private String ouName;

    @Column(name = "CUSTOMER_NUMBER")
    private String customerNumber;

    @Column(name="CUSTOMER_NAME")
    private  String customerName;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "COMPLETION_DATE")
    private Date completionDate;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "LAST_UPDATE_DATE")
    private Date lastUpdateDate;


    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getSegment1() {
        return segment1;
    }

    public void setSegment1(String segment1) {
        this.segment1 = segment1;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    public String getOuName() {
        return ouName;
    }

    public void setOuName(String ouName) {
        this.ouName = ouName;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

}
