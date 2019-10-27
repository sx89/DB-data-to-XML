package com.sx.createxml.biz.impl;

import com.sx.createxml.biz.IMajorPlanningArchiveBiz;
import com.sx.createxml.dao.repository.MajorDetailRepository;
import com.sx.createxml.dao.repository.ProjectApplyRepository;
import com.sx.createxml.dao.repository.SubProjectDetailRepository;
import com.sx.createxml.dao.repository2.DtArchivesInfoRepository;
import com.sx.createxml.dao.repository2.DtAttchFileRepository;
import com.sx.createxml.dao.repository2.DtDocumentInfoRepository;
import com.sx.createxml.dao.repository3.DpsAllProjectVRepository;
import com.sx.createxml.pojo.mysql.MajorDetail;
import com.sx.createxml.pojo.mysql.MajorPlanning;
import com.sx.createxml.pojo.mysql.ProjectApply;
import com.sx.createxml.pojo.mysql.SubProjectDetail;
import com.sx.createxml.pojo.oracle.DtArchivesInfo;
import com.sx.createxml.pojo.oracle.DtAttchFile;
import com.sx.createxml.pojo.oracle.DtDocumentInfo;
import com.sx.createxml.pojo.oracleEBM.DpsAllProjectV;
import com.sx.createxml.service.gitLab.IGitLabProject;
import com.sx.createxml.service.teamcore.ITeamcoreService;
import com.sx.createxml.util.Constants;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class MajorPlanningArchiveBizImpl implements IMajorPlanningArchiveBiz {

    @Autowired
    ProjectApplyRepository projectApplyRepository;

    @Autowired
    DpsAllProjectVRepository dpsAllProjectVRepository;

    @Autowired
    SubProjectDetailRepository subProjectDetailRepository;

    @Autowired
    MajorDetailRepository majorDetailRepository;

    @Autowired
    DtArchivesInfoRepository dtArchivesInfoRepository;

    @Autowired
    DtDocumentInfoRepository dtDocumentInfoRepository;

    @Autowired
    DtAttchFileRepository dtAttchFileRepository;

    @Autowired
    IGitLabProject iGitLabProject;

    @Autowired
    Constants constants;

    @Autowired
    ITeamcoreService iTeamcoreService;

    //现在归档为子项
    @Override
    public DtArchivesInfo saveDtArchivesInfo(Long projectId, ProjectApply projectApply, SubProjectDetail subProjectDetail){
        String ebmNumber = projectApply.getEbmNumber();
        Long subProjectId = subProjectDetail.getId();
        List<MajorDetail> majorDetailList = majorDetailRepository.findAllBySubProjectId(subProjectId);
        String buildingManager = "";
        String jgManager = "";
        String jpsManager = "";
        String dqManager = "";
        String ndManager = "";
        for(MajorDetail majorDetail : majorDetailList) {
            if("建筑".equals(majorDetail.getMajorName())){
                buildingManager = majorDetail.getOwner();
                continue;
            }
            if("结构".equals(majorDetail.getMajorName())){
                jgManager = majorDetail.getOwner();
                continue;
            }
            if("给排水".equals(majorDetail.getMajorName())){
                jpsManager = majorDetail.getOwner();
                continue;
            }
            if("电气".equals(majorDetail.getMajorName())){
                dqManager = majorDetail.getOwner();
                continue;
            }
            if("暖动".equals(majorDetail.getMajorName())){
                ndManager = majorDetail.getOwner();
            }
        }
        Integer year;
        Date createDate = projectApply.getCreateGmt();
        if (createDate != null) {
            Calendar c = Calendar.getInstance();
            c.setTime(createDate);
            year = c.get(Calendar.YEAR);
        } else {
            year = -1;
        }
        DpsAllProjectV dpsAllProjectV = dpsAllProjectVRepository.findBySegment1(ebmNumber);
        DtArchivesInfo dtArchivesInfo = new DtArchivesInfo();
        // 系统主键，现在设为子项id
        dtArchivesInfo.setMainid(String.valueOf(subProjectId));
        dtArchivesInfo.setDocsrc("生产平台");
        // 修改时间，现在为项目更新时间
        dtArchivesInfo.setLastUpdateTime(projectApply.getModifyGmt());
        dtArchivesInfo.setPrjnumber(String.valueOf(projectId));
        dtArchivesInfo.setPrjname(projectApply.getName());
        // 设计资质现在取ebm中的ou_name
        dtArchivesInfo.setDesigntype(dpsAllProjectV.getOuName());
        dtArchivesInfo.setHtnumber(ebmNumber);
        // 设计阶段现在取项目中第一个子项的阶段
        dtArchivesInfo.setPrjphase(subProjectDetail.getStageName());
        // 工程年份,现在取项目创建日期的年份
        dtArchivesInfo.setYear(year);
        // 设计单位现在取ebm中的ou_name
        if(dpsAllProjectV.getOuName() != null){
            dtArchivesInfo.setDesignDept(dpsAllProjectV.getOuName());
        } else {
            dtArchivesInfo.setDesignDept("");
        }
        dtArchivesInfo.setDesignManager(projectApply.getChiefDesigner());
        dtArchivesInfo.setPrjManager(projectApply.getProjectManager());
        dtArchivesInfo.setJdManager(subProjectDetail.getElectromechanicalOwner());
        dtArchivesInfo.setBuildManager(buildingManager);
        dtArchivesInfo.setJgManager(jgManager);
        dtArchivesInfo.setJpsManager(jpsManager);
        dtArchivesInfo.setQdManager(dqManager);
        dtArchivesInfo.setNdManager(dqManager);
        dtArchivesInfo.setNtManager(ndManager);
        dtArchivesInfo.setNlManager(ndManager);
        dtArchivesInfo.setStatus(1);
        DtArchivesInfo result = dtArchivesInfoRepository.save(dtArchivesInfo);
        return result;
    }

    @Override
    public DtDocumentInfo saveDtDocumentInfo(Long projectId, ProjectApply projectApply,SubProjectDetail subProjectDetail,
                                             MajorPlanning majorPlanning,MajorDetail majorDetail){
        DtDocumentInfo dtDocumentInfo = new DtDocumentInfo();
        dtDocumentInfo.setMainid(String.valueOf(majorPlanning.getId()));
        dtDocumentInfo.setDocsrc("项目管理系统");
        dtDocumentInfo.setLastUpdateTime(majorPlanning.getModifyGmt());
        dtDocumentInfo.setDoctype("图纸");
        dtDocumentInfo.setPrjnumber(String.valueOf(projectId));
        dtDocumentInfo.setPrjname(projectApply.getName());
        dtDocumentInfo.setItemnumber(String.valueOf(majorPlanning.getSubProjectId()));
        dtDocumentInfo.setItemname(subProjectDetail.getName());
        dtDocumentInfo.setPicnumber(String.valueOf(majorPlanning.getId()));
        dtDocumentInfo.setPicname(majorPlanning.getDwgName());
        dtDocumentInfo.setPhasename(subProjectDetail.getStageName());
        dtDocumentInfo.setProportion(majorPlanning.getScale());
        dtDocumentInfo.setCtdate(majorPlanning.getCreateGmt());
        dtDocumentInfo.setPapertype(majorPlanning.getDwgFrame());
        dtDocumentInfo.setEditor(majorPlanning.getDesigner());
        dtDocumentInfo.setAuditor(majorPlanning.getProofreader());
        dtDocumentInfo.setSpecialname(majorDetail.getOwner());
        dtDocumentInfo.setCollator(majorPlanning.getChecker());
        dtDocumentInfo.setReader(majorPlanning.getDecider());
        dtDocumentInfo.setDesignmanager(majorPlanning.getChiefDesigner());
        dtDocumentInfo.setCreator(majorPlanning.getOwner());
        dtDocumentInfo.setAnnex(majorPlanning.getFilePath());
        // pdf文件，现为签章图纸
        dtDocumentInfo.setPdffile(majorPlanning.getSignedFilePath());
        dtDocumentInfo.setSpecialname(majorDetail.getMajorName());
        //todo 版次，写死1，后续修改
        dtDocumentInfo.setVersion("1");
        // 归档状态，写死为2， 即已归档
        dtDocumentInfo.setDocstu("2");
        // GY_STATUS 写死为2，意义不明
        dtDocumentInfo.setGyStatus(2);
        DtDocumentInfo result = dtDocumentInfoRepository.save(dtDocumentInfo);
        return result;
    }

    @Override
    public DtAttchFile saveDtAttchFile(ProjectApply projectApply,SubProjectDetail subProjectDetail,
                                       MajorPlanning majorPlanning, MajorDetail majorDetail, File file) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            String fileName = majorPlanning.getDwgNo() + "_" + majorPlanning.getDwgName() + ".pdf";
            String ftpAddress = "/" + projectApply.getName() + "/" + subProjectDetail.getName() + "-"
                    + subProjectDetail.getStageName() + "/" + majorDetail.getMajorName() + fileName;
            Long fileLength = file.length();
            fileInputStream = new FileInputStream(file);
            String md5 = DigestUtils.md5Hex(fileInputStream);
            DtAttchFile dtAttchFile = new DtAttchFile();
            dtAttchFile.setFileUid(String.valueOf(majorPlanning.getId()));
            dtAttchFile.setFileSrc("生产管理系统");
            dtAttchFile.setFileName(fileName);
            dtAttchFile.setFtpAddress(ftpAddress);
            dtAttchFile.setFileLength(fileLength.intValue());
            dtAttchFile.setFileMd5(md5);
            DtAttchFile result = dtAttchFileRepository.save(dtAttchFile);
            return result;
        }finally {
            if (fileInputStream!=null){
                fileInputStream.close();
            }
        }
    }

    @Override
    public File getAndUploadMajorPlanningFile(String gitlabId, String signedFilePath, String baseFileName, String branch, File folder) throws Exception {
        //todo 需要补充上传逻辑
        String userToken = constants.getGitlabRootToken();
        InputStream inputStream = iGitLabProject.downloadGitLabProjectByPathV2(Integer.parseInt(gitlabId),userToken,signedFilePath,baseFileName,branch);
        File file = new File(folder,baseFileName);
        OutputStream outputStream = new FileOutputStream(file);
        byte[] b =new byte[2048];
        int len;
        while((len = inputStream.read(b))!=-1){
            outputStream.write(b,0,len);
        }
        outputStream.close();
        inputStream.close();
        return file;
    }
}
