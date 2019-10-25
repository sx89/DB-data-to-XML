package com.sx.createxml.pojo.oracle;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DT_ARCHIVES_INFO", schema = "SYSTEM")
public class DtArchivesInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COMMON_ID")
    private Long id;

    @Column(name = "MAINID", columnDefinition = "nvarchar2 (500)")
    private String mainid;

    @Column(name = "DOCSRC", columnDefinition = "nvarchar2 (500)")
    private String docsrc;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    @JSONField(format = "yyyy-MM-dd HH:mm")
    @Column(length = 7, name = "LAST_UPDATE_TIME")
    private Date lastUpdateTime;

    @Column(name = "PRJNUMBER", columnDefinition = "nvarchar2 (500)")
    private String prjnumber;

    @Column(name = "PRJNAME", columnDefinition = "nvarchar2 (500)")
    private String prjname;

    @Column(name = "DESIGNTYPE", columnDefinition = "nvarchar2 (500)")
    private String designtype;

    @Column(name = "HTNUMBER")
    private String htnumber;

    @Column(name = "PRJLEVEL")
    private String prjlevel;

    @Column(name = "PRJADDRESS")
    private String prjaddress;

    @Column(name = "PRJPHASE", columnDefinition = "nvarchar2 (500)")
    private String prjphase;

    @Column(name = "YEAR")
    private Integer year;

    @Column(name = "DESIGN_DEPT", columnDefinition = "nvarchar2 (500)")
    private String designDept;

    @Column(name = "PART_UNIT")
    private String partUnit;

    @Column(name = "UNIT_NAME", columnDefinition = "nvarchar2 (500)")
    private String unitName;

    @Column(name = "DESIGN_MANAGER")
    private String designManager;

    @Column(name = "PRJ_MANAGER")
    private String prjManager;

    @Column(name = "JD_MANAGER")
    private String jdManager;

    @Column(name = "BUILD_MANAGER")
    private String buildManager;

    @Column(name = "JG_MANAGER")
    private String jgManager;

    @Column(name = "JPS_MANAGER")
    private String jpsManager;

    @Column(name = "QD_MANAGER")
    private String qdManager;

    @Column(name = "ND_MANAGER")
    private String ndManager;

    @Column(name = "NT_MANAGER")
    private String ntManager;

    @Column(name = "NL_MANAGER")
    private String nlManager;

    @Column(name = "STATUS")
    private Integer status;

    @Column(name = "PTAPPROVAL")
    private String ptapproval;

    @Column(name = "CBSHENQING")
    private String cbshenqing;

    @Column(name = "EFILE_SQR")
    private String efileSqr;

    @Column(name = "EFILE_SPR_F")
    private String efileSprF;

    @Column(name = "EFILE_SPR_S")
    private String efileSprS;

    @Column(name = "EFILE_SPR_T")
    private String efileSprT;

    @Column(name = "BAREA")
    private String barea;

    @Column(name = "BHEIGHT")
    private String bheight;

    @Column(name = "INVESTMENT")
    private String investment;

    @Column(name = "CCY")
    private String ccy;

    @Column(name = "SURVEY_UNIT")
    private String surveyUnit;

    @Column(name = "CONTACTER")
    private String contacter;

    @Column(name = "CONTACT_ADDR")
    private String contactAddr;

    @Column(name = "CONTACT_TEL")
    private String contactTel;

    @Column(name = "CONTACT_EMAIL")
    private String contactEmail;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "EFFECT_PIC")
    private String effectPic;

    @Column(name = "DAORU_MANAGER")
    private String daoruManager;

    @Column(name = "QIAOLIANG_MANAGER")
    private String qiaoliangManager;

    @Column(name = "JISHUI_MANAGER")
    private String jishuiManager;

    @Column(name = "PAISHUI_MANAGER")
    private String paishuiManager;

    @Column(name = "GUANXIAN_MANAGER")
    private String guanxianManager;

    @Column(name = "SUIDAO_MANAGER")
    private String suidaoManager;

    @Column(name = "RANQI_MANAGER")
    private String ranqiManager;

    @Column(name = "GAISUAN_MANAGER")
    private String gaisuanManager;

    @Column(name = "SHINEI_MANAGER")
    private String shineiManager;

    @Column(name = "JINGGUAN_MANAGER")
    private String jingguanManager;

    @Column(name = "NUANDONG_MANAGER")
    private String nuandongManager;

    @Column(name = "DIANQI_MANAGER")
    private String dianqiManager;

    @Column(name = "EBMCODE")
    private String ebmcode;

    @Column(name = "DANGHAO")
    private String danghao;

    @Column(name = "GY_STATUS")
    private Integer gyStatus;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    @JSONField(format = "yyyy-MM-dd HH:mm")
    @Column(length = 7, name = "CREATETIME")
    private Date createtime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    @JSONField(format = "yyyy-MM-dd HH:mm")
    @Column(length = 7, name = "MODIFYTIME")
    private Date modifytime;

    @Column(name = "CREATOR")
    private Integer creator;

    @Column(name = "MODIFIER")
    private Integer modifier;

    @Column(name = "ERRORMSG")
    private String errormsg;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMainid() {
        return mainid;
    }

    public void setMainid(String mainid) {
        this.mainid = mainid;
    }

    public String getDocsrc() {
        return docsrc;
    }

    public void setDocsrc(String docsrc) {
        this.docsrc = docsrc;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getPrjnumber() {
        return prjnumber;
    }

    public void setPrjnumber(String prjnumber) {
        this.prjnumber = prjnumber;
    }

    public String getPrjname() {
        return prjname;
    }

    public void setPrjname(String prjname) {
        this.prjname = prjname;
    }

    public String getDesigntype() {
        return designtype;
    }

    public void setDesigntype(String designtype) {
        this.designtype = designtype;
    }

    public String getHtnumber() {
        return htnumber;
    }

    public void setHtnumber(String htnumber) {
        this.htnumber = htnumber;
    }

    public String getPrjlevel() {
        return prjlevel;
    }

    public void setPrjlevel(String prjlevel) {
        this.prjlevel = prjlevel;
    }

    public String getPrjaddress() {
        return prjaddress;
    }

    public void setPrjaddress(String prjaddress) {
        this.prjaddress = prjaddress;
    }

    public String getPrjphase() {
        return prjphase;
    }

    public void setPrjphase(String prjphase) {
        this.prjphase = prjphase;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDesignDept() {
        return designDept;
    }

    public void setDesignDept(String designDept) {
        this.designDept = designDept;
    }

    public String getPartUnit() {
        return partUnit;
    }

    public void setPartUnit(String partUnit) {
        this.partUnit = partUnit;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getDesignManager() {
        return designManager;
    }

    public void setDesignManager(String designManager) {
        this.designManager = designManager;
    }

    public String getPrjManager() {
        return prjManager;
    }

    public void setPrjManager(String prjManager) {
        this.prjManager = prjManager;
    }

    public String getJdManager() {
        return jdManager;
    }

    public void setJdManager(String jdManager) {
        this.jdManager = jdManager;
    }

    public String getBuildManager() {
        return buildManager;
    }

    public void setBuildManager(String buildManager) {
        this.buildManager = buildManager;
    }

    public String getJgManager() {
        return jgManager;
    }

    public void setJgManager(String jgManager) {
        this.jgManager = jgManager;
    }

    public String getJpsManager() {
        return jpsManager;
    }

    public void setJpsManager(String jpsManager) {
        this.jpsManager = jpsManager;
    }

    public String getQdManager() {
        return qdManager;
    }

    public void setQdManager(String qdManager) {
        this.qdManager = qdManager;
    }

    public String getNdManager() {
        return ndManager;
    }

    public void setNdManager(String ndManager) {
        this.ndManager = ndManager;
    }

    public String getNtManager() {
        return ntManager;
    }

    public void setNtManager(String ntManager) {
        this.ntManager = ntManager;
    }

    public String getNlManager() {
        return nlManager;
    }

    public void setNlManager(String nlManager) {
        this.nlManager = nlManager;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPtapproval() {
        return ptapproval;
    }

    public void setPtapproval(String ptapproval) {
        this.ptapproval = ptapproval;
    }

    public String getCbshenqing() {
        return cbshenqing;
    }

    public void setCbshenqing(String cbshenqing) {
        this.cbshenqing = cbshenqing;
    }

    public String getEfileSqr() {
        return efileSqr;
    }

    public void setEfileSqr(String efileSqr) {
        this.efileSqr = efileSqr;
    }

    public String getEfileSprF() {
        return efileSprF;
    }

    public void setEfileSprF(String efileSprF) {
        this.efileSprF = efileSprF;
    }

    public String getEfileSprS() {
        return efileSprS;
    }

    public void setEfileSprS(String efileSprS) {
        this.efileSprS = efileSprS;
    }

    public String getEfileSprT() {
        return efileSprT;
    }

    public void setEfileSprT(String efileSprT) {
        this.efileSprT = efileSprT;
    }

    public String getBarea() {
        return barea;
    }

    public void setBarea(String barea) {
        this.barea = barea;
    }

    public String getBheight() {
        return bheight;
    }

    public void setBheight(String bheight) {
        this.bheight = bheight;
    }

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment;
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getSurveyUnit() {
        return surveyUnit;
    }

    public void setSurveyUnit(String surveyUnit) {
        this.surveyUnit = surveyUnit;
    }

    public String getContacter() {
        return contacter;
    }

    public void setContacter(String contacter) {
        this.contacter = contacter;
    }

    public String getContactAddr() {
        return contactAddr;
    }

    public void setContactAddr(String contactAddr) {
        this.contactAddr = contactAddr;
    }

    public String getContactTel() {
        return contactTel;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getEffectPic() {
        return effectPic;
    }

    public void setEffectPic(String effectPic) {
        this.effectPic = effectPic;
    }

    public String getDaoruManager() {
        return daoruManager;
    }

    public void setDaoruManager(String daoruManager) {
        this.daoruManager = daoruManager;
    }

    public String getQiaoliangManager() {
        return qiaoliangManager;
    }

    public void setQiaoliangManager(String qiaoliangManager) {
        this.qiaoliangManager = qiaoliangManager;
    }

    public String getJishuiManager() {
        return jishuiManager;
    }

    public void setJishuiManager(String jishuiManager) {
        this.jishuiManager = jishuiManager;
    }

    public String getPaishuiManager() {
        return paishuiManager;
    }

    public void setPaishuiManager(String paishuiManager) {
        this.paishuiManager = paishuiManager;
    }

    public String getGuanxianManager() {
        return guanxianManager;
    }

    public void setGuanxianManager(String guanxianManager) {
        this.guanxianManager = guanxianManager;
    }

    public String getSuidaoManager() {
        return suidaoManager;
    }

    public void setSuidaoManager(String suidaoManager) {
        this.suidaoManager = suidaoManager;
    }

    public String getRanqiManager() {
        return ranqiManager;
    }

    public void setRanqiManager(String ranqiManager) {
        this.ranqiManager = ranqiManager;
    }

    public String getGaisuanManager() {
        return gaisuanManager;
    }

    public void setGaisuanManager(String gaisuanManager) {
        this.gaisuanManager = gaisuanManager;
    }

    public String getShineiManager() {
        return shineiManager;
    }

    public void setShineiManager(String shineiManager) {
        this.shineiManager = shineiManager;
    }

    public String getJingguanManager() {
        return jingguanManager;
    }

    public void setJingguanManager(String jingguanManager) {
        this.jingguanManager = jingguanManager;
    }

    public String getNuandongManager() {
        return nuandongManager;
    }

    public void setNuandongManager(String nuandongManager) {
        this.nuandongManager = nuandongManager;
    }

    public String getDianqiManager() {
        return dianqiManager;
    }

    public void setDianqiManager(String dianqiManager) {
        this.dianqiManager = dianqiManager;
    }

    public String getEbmcode() {
        return ebmcode;
    }

    public void setEbmcode(String ebmcode) {
        this.ebmcode = ebmcode;
    }

    public String getDanghao() {
        return danghao;
    }

    public void setDanghao(String danghao) {
        this.danghao = danghao;
    }

    public Integer getGyStatus() {
        return gyStatus;
    }

    public void setGyStatus(Integer gyStatus) {
        this.gyStatus = gyStatus;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public Integer getModifier() {
        return modifier;
    }

    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }
}