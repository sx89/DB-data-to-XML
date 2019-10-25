package com.sx.createxml.pojo.oracle;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "DT_ATTCH_FILE",schema = "SYSTEM")

public class DtAttchFile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "COMMON_ID")
    private Long id;

    @Column(name="FILEUID", length=500)
    private String fileUid;

    @Column(name="FILESRC", length=500)
    private String fileSrc;

    @Column(name="FILENAME", length=500)
    private String fileName;

    @Column(name="FTPADDRESS", columnDefinition = "nvarchar2 (2000)")
    private String ftpAddress;

    @Column(name="STATUS")
    private Integer status;

    @Column(name="ATTCHID")
    private Integer attchId;

    @Column(name="ATTRTYPE", length=500)
    private String attrType;

    @Column(name="EXCEPTION", length=500)
    private String exception;

    @Column(name="FILELENGTH")
    private Integer fileLength;

    @Column(name="FILEMD5", length=500)
    private String fileMd5;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileUid() {
        return fileUid;
    }

    public void setFileUid(String fileUid) {
        this.fileUid = fileUid;
    }

    public String getFileSrc() {
        return fileSrc;
    }

    public void setFileSrc(String fileSrc) {
        this.fileSrc = fileSrc;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFtpAddress() {
        return ftpAddress;
    }

    public void setFtpAddress(String ftpAddress) {
        this.ftpAddress = ftpAddress;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAttchId() {
        return attchId;
    }

    public void setAttchId(Integer attchId) {
        this.attchId = attchId;
    }

    public String getAttrType() {
        return attrType;
    }

    public void setAttrType(String attrType) {
        this.attrType = attrType;
    }

    public String getException() {
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    public Integer getFileLength() {
        return fileLength;
    }

    public void setFileLength(Integer fileLength) {
        this.fileLength = fileLength;
    }

    public String getFileMd5() {
        return fileMd5;
    }

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
    }
}
