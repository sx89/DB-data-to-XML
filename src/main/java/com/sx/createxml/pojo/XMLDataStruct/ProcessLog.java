package com.sx.createxml.pojo.XMLDataStruct;

/**
 * @author sunxu93@163.com
 * @date 19/7/12/012 16:48
 */
public class ProcessLog {
    private ActionMetaItem actionMetaItem;

    public ProcessLog(ActionMetaItem actionMetaItem) {
        this.actionMetaItem = actionMetaItem;
    }

    public ProcessLog() {
    }

    public ActionMetaItem getActionMetaItem() {
        return actionMetaItem;
    }

    public void setActionMetaItem(ActionMetaItem actionMetaItem) {
        this.actionMetaItem = actionMetaItem;
    }
}

class ActionMetaItem {
    /**
     * 行为事件类型
     */
    private String actionType;
    /**
     * 行为责任人职责
     */
    private String chargePersonPositon;
    /**
     * 行为责任者
     */
    private String chargePersonName;
    /**
     * 行为责任者IP
     */
    private String chargePersonIp;
    /**
     * 行为时间
     */
    private String processOccurrenceTime;
    /**
     * 行为序号
     */
    private String processOrder;
    /**
     * 处理意见
     */
    private String processingState;

    public ActionMetaItem() {
    }

    public ActionMetaItem(String actionType, String chargePersonPositon, String chargePersonName, String chargePersonIp, String processOccurrenceTime, String processOrder, String processingState) {
        this.actionType = actionType;
        this.chargePersonPositon = chargePersonPositon;
        this.chargePersonName = chargePersonName;
        this.chargePersonIp = chargePersonIp;
        this.processOccurrenceTime = processOccurrenceTime;
        this.processOrder = processOrder;
        this.processingState = processingState;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getChargePersonPositon() {
        return chargePersonPositon;
    }

    public void setChargePersonPositon(String chargePersonPositon) {
        this.chargePersonPositon = chargePersonPositon;
    }

    public String getChargePersonName() {
        return chargePersonName;
    }

    public void setChargePersonName(String chargePersonName) {
        this.chargePersonName = chargePersonName;
    }

    public String getChargePersonIp() {
        return chargePersonIp;
    }

    public void setChargePersonIp(String chargePersonIp) {
        this.chargePersonIp = chargePersonIp;
    }

    public String getProcessOccurrenceTime() {
        return processOccurrenceTime;
    }

    public void setProcessOccurrenceTime(String processOccurrenceTime) {
        this.processOccurrenceTime = processOccurrenceTime;
    }

    public String getProcessOrder() {
        return processOrder;
    }

    public void setProcessOrder(String processOrder) {
        this.processOrder = processOrder;
    }

    public String getProcessingState() {
        return processingState;
    }

    public void setProcessingState(String processingState) {
        this.processingState = processingState;
    }
}