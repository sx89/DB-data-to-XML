package com.sx.createxml.pojo2;

import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DT_DOCUMENT_INFO",schema = "SYSTEM")
public class DtDocumentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COMMON_ID")
    private Integer id;

    @Column(name="MAINID", length=500)
    private String mainid;

    @Column(name="PARENTID", length=500)
    private String parentid;

    @Column(name="DOCSRC", length=500)
    private String docsrc;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    @JSONField(format = "yyyy-MM-dd HH:mm")
    @Column(length = 7, name = "LAST_UPDATE_TIME")
    private Date lastUpdateTime;

    @Column(name="DOCTYPE", length=500)
    private String doctype;

    @Column(name="PRJNUMBER", length=500)
    private String prjnumber;

    @Column(name="PRJNAME", length=500)
    private String prjname;

    @Column(name="ITEMNUMBER", length=500)
    private String itemnumber;

    @Column(name="ITEMNAME", length=500)
    private String itemname;

    @Column(name="PICNUMBER", length=500)
    private String picnumber;

    @Column(name="PICNAME", length=500)
    private String picname;

    @Column(name="VERSION", length=500)
    private String version;

    @Column(name="PHASENAME", length=500)
    private String phasename;

    @Column(name="SPECIALNAME", length=500)
    private String specialname;

    @Column(name="PROPORTION", length=500)
    private String proportion;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    @JSONField(format = "yyyy-MM-dd HH:mm")
    @Column(length = 7, name = "CTDATE")
    private Date ctdate;

    @Column(name="PAPERTYPE", length=500)
    private String papertype;

    @Column(name="EDITOR", length=500)
    private String editor;

    @Column(name="AUDITOR", length=500)
    private String auditor;

    @Column(name="SPECIALPERSON", length=500)
    private String specialperson;

    @Column(name="COLLATOR", length=500)
    private String collator;

    @Column(name="READER", length=500)
    private String reader;

    @Column(name="DESIGNMANAGER", length=500)
    private String designmanager;

    @Column(name="CREATOR", length=500)
    private String creator;

    @Column(name="ANNEX", length=500)
    private String annex;

    @Column(name="PDFFILE", length=500)
    private String pdffile;

    @Column(name="DOCSTU", length=500)
    private String docstu;

    @Column(name = "GY_STATUS")
    private Integer gyStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMainid() {
        return mainid;
    }

    public void setMainid(String mainid) {
        this.mainid = mainid;
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid;
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

    public String getDoctype() {
        return doctype;
    }

    public void setDoctype(String doctype) {
        this.doctype = doctype;
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

    public String getItemnumber() {
        return itemnumber;
    }

    public void setItemnumber(String itemnumber) {
        this.itemnumber = itemnumber;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getPicnumber() {
        return picnumber;
    }

    public void setPicnumber(String picnumber) {
        this.picnumber = picnumber;
    }

    public String getPicname() {
        return picname;
    }

    public void setPicname(String picname) {
        this.picname = picname;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPhasename() {
        return phasename;
    }

    public void setPhasename(String phasename) {
        this.phasename = phasename;
    }

    public String getSpecialname() {
        return specialname;
    }

    public void setSpecialname(String specialname) {
        this.specialname = specialname;
    }

    public String getProportion() {
        return proportion;
    }

    public void setProportion(String proportion) {
        this.proportion = proportion;
    }

    public Date getCtdate() {
        return ctdate;
    }

    public void setCtdate(Date ctdate) {
        this.ctdate = ctdate;
    }

    public String getPapertype() {
        return papertype;
    }

    public void setPapertype(String papertype) {
        this.papertype = papertype;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public String getSpecialperson() {
        return specialperson;
    }

    public void setSpecialperson(String specialperson) {
        this.specialperson = specialperson;
    }

    public String getCollator() {
        return collator;
    }

    public void setCollator(String collator) {
        this.collator = collator;
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }

    public String getDesignmanager() {
        return designmanager;
    }

    public void setDesignmanager(String designmanager) {
        this.designmanager = designmanager;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getAnnex() {
        return annex;
    }

    public void setAnnex(String annex) {
        this.annex = annex;
    }

    public String getPdffile() {
        return pdffile;
    }

    public void setPdffile(String pdffile) {
        this.pdffile = pdffile;
    }

    public String getDocstu() {
        return docstu;
    }

    public void setDocstu(String docstu) {
        this.docstu = docstu;
    }

    public Integer getGyStatus() {
        return gyStatus;
    }

    public void setGyStatus(Integer gyStatus) {
        this.gyStatus = gyStatus;
    }
}
