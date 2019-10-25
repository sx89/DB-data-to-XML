package com.sx.createxml.biz;

import com.sx.createxml.pojo.mysql.MajorDetail;
import com.sx.createxml.pojo.mysql.MajorPlanning;
import com.sx.createxml.pojo.mysql.ProjectApply;
import com.sx.createxml.pojo.mysql.SubProjectDetail;
import com.sx.createxml.pojo.oracle.DtArchivesInfo;
import com.sx.createxml.pojo.oracle.DtAttchFile;
import com.sx.createxml.pojo.oracle.DtDocumentInfo;
import com.sx.createxml.util.Result;
import org.springframework.data.repository.query.Param;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface IMajorPlanningArchiveBiz {

    DtArchivesInfo saveDtArchivesInfo(Long projectId, ProjectApply projectApply, SubProjectDetail subProjectDetail);

    DtDocumentInfo saveDtDocumentInfo(Long projectId, ProjectApply projectApply,SubProjectDetail subProjectDetail,
                                      MajorPlanning majorPlanning, MajorDetail majorDetail);

    DtAttchFile saveDtAttchFile(ProjectApply projectApply,SubProjectDetail subProjectDetail,
                                MajorPlanning majorPlanning, MajorDetail majorDetail, File file) throws IOException;

    File getAndUploadMajorPlanningFile(String gitlabId, String signedFilePath, String baseFileName, String branch, File folder) throws Exception;
}
