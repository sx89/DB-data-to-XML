package com.sx.createxml.service.gitLab.impl;


import com.sx.createxml.service.gitLab.IGitLabProject;
import com.sx.createxml.util.Constants;
import org.gitlab4j.api.GitLabApi;
import org.gitlab4j.api.RepositoryFileApi;
import org.gitlab4j.api.models.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Huang Qiqi
 * @data 18-4-20
 */

@Service
public class GitLabProject implements IGitLabProject {

    private static final Logger logger = LoggerFactory.getLogger(GitLabProject.class);

    private static final Map<Integer, ExecutorService> gitTaskService = new HashMap<>();

    @Autowired
    Constants constants;

    @Override
    public InputStream downloadFileByCommitId(Integer gitlabId,
                                              String userToken,
                                              String commitId,
                                              String fileFullPath,
                                              String branchName){
        try {
            GitLabApi gitLabApi = new GitLabApi(constants.getGitlabHostUrl(), userToken);

            String currentCommitId = commitId;
            if (StringUtils.isEmpty(commitId) || commitId.equals("undefined")) {
                List<Commit> commitList = gitLabApi.getCommitsApi().getCommits(gitlabId, branchName, null, null);
                currentCommitId = commitList.get(0).getId();
            }

            InputStream inputStream = gitLabApi.getRepositoryFileApi().getRawFile(gitlabId, currentCommitId, fileFullPath);
            return inputStream;
        } catch (Exception e) {
            logger.error("GitLabController[searchGitLabProject] error", e);
            return null;
        }
    }

    /**
     * 下载指定路径文件
     *
     * @param projId
     * @param userToken
     * @param folderPath 要下载在gitlab中的路径(不含文件名)
     * @param fileName   下载的文件名
     * @param branchName
     */
    @Override
    public File downloadGitLabProjectByPath(Integer projId,
                                            String userToken,
                                            String folderPath,
                                            String fileName,
                                            String downPath,
                                            String branchName
    ) {
        try {
            GitLabApi gitLabApi = new GitLabApi(constants.getGitlabHostUrl(), userToken);
            String fileFullPath;
            if (folderPath == null || folderPath.equals("") || folderPath.equalsIgnoreCase(gitLabApi.getProjectApi().getProject(projId).getPath())) {
                fileFullPath = fileName;
            } else {
                fileFullPath = folderPath + "/" + fileName;
            }
            List<TreeItem> treeItemPager = gitLabApi.getRepositoryApi().getTree(
                    projId, folderPath, branchName, false);
            for (TreeItem treeItem : treeItemPager) {

                if (treeItem.getType().equals(TreeItem.Type.BLOB) && treeItem.getPath().equalsIgnoreCase(fileFullPath)) {
                    File downFile = new File(downPath); //设定下载本地地址

                    downFile = gitLabApi.getRepositoryFileApi().getRawFile(projId, branchName, fileFullPath, downFile);

                    return downFile;
                }
            }
            return null;
        } catch (Exception e) {
            logger.error("GitLabController[downloadGitLabProjectByPath] error", e);
            return null;
        }
    }

    @Override
    public InputStream downloadGitLabProjectByPathV2(Integer projId,
                                                     String userToken,
                                                     String folderPath,
                                                     String fileName,
                                                     String branchName) {
        try {
            GitLabApi gitLabApi = new GitLabApi(constants.getGitlabHostUrl(), userToken);
            InputStream inputStream = gitLabApi.getRepositoryFileApi().getRawFile(projId, branchName, folderPath);
            return inputStream;
        } catch (Exception e) {
            logger.error("GitLabController[downloadGitLabProjectByPath] error", e);
            return null;
        }
    }


}
