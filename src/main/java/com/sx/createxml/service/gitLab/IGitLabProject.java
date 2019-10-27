package com.sx.createxml.service.gitLab;

import java.io.File;
import java.io.InputStream;


/**
 * @author Huang Qiqi
 * @data 18-5-3
 */
public interface IGitLabProject {
    public InputStream downloadGitLabProjectByPathV2(Integer projId,
                                                     String userToken,
                                                     String folderPath,
                                                     String fileName,
                                                     String branchName);

    public File downloadGitLabProjectByPath(Integer projId,
                                            String userToken,
                                            String folderPath,
                                            String fileName,
                                            String downPath,
                                            String branchName);

    public InputStream downloadFileByCommitId(Integer gitlabId, String userToken, String commitId, String fileFullPath, String branchName);

    }
