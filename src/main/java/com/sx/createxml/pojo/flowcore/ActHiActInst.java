package com.sx.createxml.pojo.flowcore;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Objects;

/**
 * @author sunxu93@163.com
 * @date 19/7/12/012 17:31
 */

@Entity
@Table(name = "ACT_HI_ACTINST")
public class ActHiActInst {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_")
    private String id;

    @Column(name = "PROC_DEF_ID_")
    private String procDefId;
    @Column(name = "PROC_INST_ID_")
    private String procInstId;
    @Column(name = "EXECUTION_ID_")
    private String executionId;
    @Column(name = "ACT_ID_")
    private String actId;
    @Column(name = "TASK_ID_")
    private String taskId;
    @Column(name = "CALL_PROC_INST_ID_")
    private String callProcInstId;
    @Column(name = "ACT_NAME_")
    private String actName;
    @Column(name = "ACT_TYPE_")
    private String actType;
    @Column(name = "ASSIGNEE_")
    private String assignee;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "START_TIME_")
    private String startTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "END_TIME_")
    private String endTime;

    @Column(name = "DURATION_")
    private BigInteger duration;

    @Column(name = "TENANT_ID_")
    private String tenantId;

    public ActHiActInst() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProcDefId() {
        return procDefId;
    }

    public void setProcDefId(String procDefId) {
        this.procDefId = procDefId;
    }

    public String getProcInstId() {
        return procInstId;
    }

    public void setProcInstId(String procInstId) {
        this.procInstId = procInstId;
    }

    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public String getActId() {
        return actId;
    }

    public void setActId(String actId) {
        this.actId = actId;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public String getCallProcInstId() {
        return callProcInstId;
    }

    public void setCallProcInstId(String callProcInstId) {
        this.callProcInstId = callProcInstId;
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName;
    }

    public String getActType() {
        return actType;
    }

    public void setActType(String actType) {
        this.actType = actType;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public BigInteger getDuration() {
        return duration;
    }

    public void setDuration(BigInteger duration) {
        this.duration = duration;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }
}

