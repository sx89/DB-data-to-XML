package com.sx.createxml.pojo.mysql;

import javax.persistence.*;

@Entity
@Table(name = "teamcore_dwg_frame_information")
public class DwgFrameInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;   //图框名

    private String architectureStampLocation;               // 结构注册章位置

    private String buildingStampLocation;                   //建筑注册章位置

    private String companyStampLocation;                    //公司章位置

    private String archiveStampLocation;                    //归档章位置

    private String deciderSignatureLocation;                //审定人签名位置

    private String checkerSignatureLocation;                //审核人签名位置

    private String chiefDesignerSignatureLocation;          //设总签名位置

    private String ownerSignatureLocation;                  //专业负责人签名位置

    private String proofreaderSignatureLocation;            //校对人签名位置

    private String designerSignatureLocation;               //设计人签名位置

    private String projectManagerSignatureLocation;         //项目经理签名位置

    private String architectureCounterSignatureLocation;    //结构会签签名位置

    private String buildingCounterSignatureLocation;        //建筑会签签名位置

    private String drainageListCounterSignatureLocation;    //给排水会签签名位置

    private String electricCounterSignatureLocation;        //电气会签签名位置

    private String hvacCounterSignatureLocation;            //暖通会签签名位置

    private String QRCodeLocation;                          //二维码签名位置

    private String dataLocation;                           //日期位置

    private String groupName;                               //域签名位置

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArchitectureStampLocation() {
        return architectureStampLocation;
    }

    public void setArchitectureStampLocation(String architectureStampLocation) {
        this.architectureStampLocation = architectureStampLocation;
    }

    public String getBuildingStampLocation() {
        return buildingStampLocation;
    }

    public void setBuildingStampLocation(String buildingStampLocation) {
        this.buildingStampLocation = buildingStampLocation;
    }

    public String getCompanyStampLocation() {
        return companyStampLocation;
    }

    public void setCompanyStampLocation(String companyStampLocation) {
        this.companyStampLocation = companyStampLocation;
    }

    public String getArchiveStampLocation() {
        return archiveStampLocation;
    }

    public void setArchiveStampLocation(String archiveStampLocation) {
        this.archiveStampLocation = archiveStampLocation;
    }

    public String getDeciderSignatureLocation() {
        return deciderSignatureLocation;
    }

    public void setDeciderSignatureLocation(String deciderSignatureLocation) {
        this.deciderSignatureLocation = deciderSignatureLocation;
    }

    public String getCheckerSignatureLocation() {
        return checkerSignatureLocation;
    }

    public void setCheckerSignatureLocation(String checkerSignatureLocation) {
        this.checkerSignatureLocation = checkerSignatureLocation;
    }

    public String getChiefDesignerSignatureLocation() {
        return chiefDesignerSignatureLocation;
    }

    public void setChiefDesignerSignatureLocation(String chiefDesignerSignatureLocation) {
        this.chiefDesignerSignatureLocation = chiefDesignerSignatureLocation;
    }

    public String getOwnerSignatureLocation() {
        return ownerSignatureLocation;
    }

    public void setOwnerSignatureLocation(String ownerSignatureLocation) {
        this.ownerSignatureLocation = ownerSignatureLocation;
    }

    public String getProofreaderSignatureLocation() {
        return proofreaderSignatureLocation;
    }

    public void setProofreaderSignatureLocation(String proofreaderSignatureLocation) {
        this.proofreaderSignatureLocation = proofreaderSignatureLocation;
    }

    public String getDesignerSignatureLocation() {
        return designerSignatureLocation;
    }

    public void setDesignerSignatureLocation(String designerSignatureLocation) {
        this.designerSignatureLocation = designerSignatureLocation;
    }

    public String getProjectManagerSignatureLocation() {
        return projectManagerSignatureLocation;
    }

    public void setProjectManagerSignatureLocation(String projectManagerSignatureLocation) {
        this.projectManagerSignatureLocation = projectManagerSignatureLocation;
    }

    public String getArchitectureCounterSignatureLocation() {
        return architectureCounterSignatureLocation;
    }

    public void setArchitectureCounterSignatureLocation(String architectureCounterSignatureLocation) {
        this.architectureCounterSignatureLocation = architectureCounterSignatureLocation;
    }

    public String getBuildingCounterSignatureLocation() {
        return buildingCounterSignatureLocation;
    }

    public void setBuildingCounterSignatureLocation(String buildingCounterSignatureLocation) {
        this.buildingCounterSignatureLocation = buildingCounterSignatureLocation;
    }

    public String getDrainageListCounterSignatureLocation() {
        return drainageListCounterSignatureLocation;
    }

    public void setDrainageListCounterSignatureLocation(String drainageListCounterSignatureLocation) {
        this.drainageListCounterSignatureLocation = drainageListCounterSignatureLocation;
    }

    public String getElectricCounterSignatureLocation() {
        return electricCounterSignatureLocation;
    }

    public void setElectricCounterSignatureLocation(String electricCounterSignatureLocation) {
        this.electricCounterSignatureLocation = electricCounterSignatureLocation;
    }

    public String getHvacCounterSignatureLocation() {
        return hvacCounterSignatureLocation;
    }

    public void setHvacCounterSignatureLocation(String hvacCounterSignatureLocation) {
        this.hvacCounterSignatureLocation = hvacCounterSignatureLocation;
    }

    public String getQRCodeLocation() {
        return QRCodeLocation;
    }

    public void setQRCodeLocation(String QRCodeLocation) {
        this.QRCodeLocation = QRCodeLocation;
    }

    public String getDataLocation() {
        return dataLocation;
    }

    public void setDataLocation(String dataLocation) {
        this.dataLocation = dataLocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
