package com.sx.createxml.controller;

import com.sx.createxml.biz.IMajorPlanningArchiveBiz;
import com.sx.createxml.dao.repository.MajorDetailRepository;
import com.sx.createxml.dao.repository.MajorPlanningRepository;
import com.sx.createxml.dao.repository.ProjectApplyRepository;
import com.sx.createxml.dao.repository.SubProjectDetailRepository;
import com.sx.createxml.pojo.mysql.MajorDetail;
import com.sx.createxml.pojo.mysql.MajorPlanning;
import com.sx.createxml.pojo.mysql.ProjectApply;
import com.sx.createxml.pojo.mysql.SubProjectDetail;
import com.sx.createxml.pojo.oracle.DtArchivesInfo;
import com.sx.createxml.pojo.oracle.DtAttchFile;
import com.sx.createxml.pojo.oracle.DtDocumentInfo;
import com.sx.createxml.service.gitLab.IGitLabProject;
import com.sx.createxml.service.gitLab.impl.GitLabProject;
import com.sx.createxml.util.Constants;
import com.sx.createxml.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.InputStream;
import java.util.List;

@RestController
public class MajorPlanningArchiveController {
    @Autowired
    IMajorPlanningArchiveBiz iMajorPlanningArchiveBiz;

    @Autowired
    ProjectApplyRepository projectApplyRepository;

    @Autowired
    SubProjectDetailRepository subProjectDetailRepository;

    @Autowired
    MajorPlanningRepository majorPlanningRepository;

    @Autowired
    MajorDetailRepository majorDetailRepository;

    @Autowired
    IGitLabProject iGitLabProject;

    @Autowired
    Constants constants;


    @RequestMapping("/archive/saveMajorPlanningArchiveData")
    public Result saveMajorPlanningArchiveData(@RequestParam("projectId")Long projectId) {
        ProjectApply projectApply = projectApplyRepository.getById(projectId);
        File projectFolder = new File(projectApply.getName());
        if(!projectFolder.exists()) {
            projectFolder.mkdir();
        }
        List<SubProjectDetail> subProjectDetailList = subProjectDetailRepository.findByProjectId(projectId);
        for (SubProjectDetail subProjectDetail : subProjectDetailList) {
            String subProjectFolderName = subProjectDetail.getName() + "-" + subProjectDetail.getStageName();
            File subProjectFolder = new File(projectFolder,subProjectFolderName);
            if(!subProjectFolder.exists()) {
                subProjectFolder.mkdir();
            }
            //todo 检查ftp结构，将文件以结构形式存入文件夹
            // 清空三张表中的测试数据
            // 生成宁波项目的数据并将文件上传
            DtArchivesInfo dtArchivesInfo = iMajorPlanningArchiveBiz.saveDtArchivesInfo
                    (projectId,projectApply, subProjectDetail);
            if(dtArchivesInfo == null) {
                break;
            }
            else {
                List<MajorPlanning> majorPlanningList = majorPlanningRepository
                        .findAllByProjectIdAndSubProjectId(projectId,subProjectDetail.getId());
                for (MajorPlanning majorPlanning : majorPlanningList) {
                    Long majorId = majorPlanning.getMajorId();
                    MajorDetail majorDetail = majorDetailRepository.getById(majorId);
                    File majorFolder = new File(subProjectFolder,majorDetail.getMajorName());
                    if(!majorFolder.exists()) {
                        majorFolder.mkdir();
                    }
                    String gitlabId = majorDetail.getGitlabId();
                    String signedFilePath = majorPlanning.getSignedFilePath();
                    String baseFileName = signedFilePath;
                    String branch = "design";
                    if(signedFilePath != null) {
                        int fileIndex = signedFilePath.lastIndexOf("/");
                        if (fileIndex > -1 && (fileIndex < (signedFilePath.length() - 1))) {
                            baseFileName = signedFilePath.substring(fileIndex + 1);
                        }
                        try {
                            File file = iMajorPlanningArchiveBiz.getAndUploadMajorPlanningFile(gitlabId,signedFilePath,baseFileName,branch, majorFolder);
                            DtDocumentInfo dtDocumentInfo = iMajorPlanningArchiveBiz.saveDtDocumentInfo
                                    (projectId, projectApply,subProjectDetail, majorPlanning, majorDetail);
                            DtAttchFile dtAttchFile = iMajorPlanningArchiveBiz.saveDtAttchFile
                                    (projectApply,subProjectDetail, majorPlanning, majorDetail, file);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    else {
                        continue;
                    }
                }
            }
        }
        return(new Result(true,"归档成功"));
    }

    @RequestMapping("/test")
    public Result test() {
        int projId = 1014;
        String folderPath = "S出图图纸/已签章/S-00-00-01_一层平面图.pdf";
        String fileName = "S-00-00-01_一层平面图.pdf";
        String branchName = "design";
        String userToken = constants.getGitlabRootToken();
        InputStream inputStream = iGitLabProject.downloadGitLabProjectByPathV2(projId,userToken,folderPath,fileName,branchName);
        return(new Result(true,"success"));
    }
}
