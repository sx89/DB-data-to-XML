package com.sx.createxml.pojo.flowcore;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author sunxu93@163.com
 * @date 19/7/12/012 17:31
 */

@Entity
@Table(name = "ACT_HI_TASKINST")
public class ActHiTaskinst {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_")
    private String id;

    @Column(name = "PROC_DEF_ID_")
    private Long procDefId;
    @Column(name = "PROC_INST_ID_")
    private Long procInstId;
    @Column(name = "EXECUTION_ID_")
    private Long executionId;
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
    private String duration;

    @Column(name = "TENANT_ID_")
    private String tenantId;

    public ActHiTaskinst() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getProcDefId() {
        return procDefId;
    }

    public void setProcDefId(Long procDefId) {
        this.procDefId = procDefId;
    }

    public Long getProcInstId() {
        return procInstId;
    }

    public void setProcInstId(Long procInstId) {
        this.procInstId = procInstId;
    }

    public Long getExecutionId() {
        return executionId;
    }

    public void setExecutionId(Long executionId) {
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ActHiTaskinst that = (ActHiTaskinst) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(procDefId, that.procDefId) &&
                Objects.equals(procInstId, that.procInstId) &&
                Objects.equals(executionId, that.executionId) &&
                Objects.equals(actId, that.actId) &&
                Objects.equals(taskId, that.taskId) &&
                Objects.equals(callProcInstId, that.callProcInstId) &&
                Objects.equals(actName, that.actName) &&
                Objects.equals(actType, that.actType) &&
                Objects.equals(assignee, that.assignee) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(duration, that.duration) &&
                Objects.equals(tenantId, that.tenantId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, procDefId, procInstId, executionId, actId, taskId, callProcInstId, actName, actType, assignee, startTime, endTime, duration, tenantId);
    }

    @Override
    public String toString() {
        return "ActHiTaskinst{" +
                "id=" + id +
                ", procDefId=" + procDefId +
                ", procInstId=" + procInstId +
                ", executionId=" + executionId +
                ", actId='" + actId + '\'' +
                ", taskId='" + taskId + '\'' +
                ", callProcInstId='" + callProcInstId + '\'' +
                ", actName='" + actName + '\'' +
                ", actType='" + actType + '\'' +
                ", assignee='" + assignee + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", duration='" + duration + '\'' +
                ", tenantId='" + tenantId + '\'' +
                '}';
    }
}

