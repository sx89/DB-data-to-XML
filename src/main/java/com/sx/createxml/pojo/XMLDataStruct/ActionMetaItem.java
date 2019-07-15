package com.sx.createxml.pojo.XMLDataStruct;

/**
 * @author sunxu93@163.com
 * @date 19/7/12/012 18:31
 */
public class ActionMetaItem {
    /**
     * 行为事件类型
     */
    private String actionType;
    /**
     * 行为责任人职责
     */
    private String chargePersonPosition;
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

    public ActionMetaItem(String actionType, String chargePersonPosition, String chargePersonName, String chargePersonIp, String processOccurrenceTime, String processOrder, String processingState) {
        this.actionType = actionType;
        this.chargePersonPosition = chargePersonPosition;
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

    public String getChargePersonPosition() {
        return chargePersonPosition;
    }

    public void setChargePersonPosition(String chargePersonPosition) {
        this.chargePersonPosition = chargePersonPosition;
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
