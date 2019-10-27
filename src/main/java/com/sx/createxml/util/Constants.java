/**
 * DiLing.com Inc.
 * Copyright (c) 2016-2018 All Rights Reserved.
 */

package com.sx.createxml.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 系统常量
 * @author hekai
 * @version $Id: Constants, v 0.1 2018/3/14 下午4:38 hekai Exp $
 */
@Component
public class Constants {

    /** gitlab 的主机地址 */
    @Value("${gitlab.host.url}")
    private String gitlabHostUrl;

    /** gitlab 的 root token 地址 */
    @Value("${gitlab.root.token}")
    private String gitlabRootToken;

    /** rocketmq的 name server地址 */
    @Value("${rocketmq.name.server}")
    private String rocketmqNameServer;

    /** social product 的服务地址 */
    @Value("${social.prod.server}")
    private String socialProdServer;

    /** flowcore 系统的调用 api token */
    @Value("${flowcore.sys.api.token}")
    private String flowcoreApiToken;

    @Value("${teamcore.sys.token}")
    private String teamcoreSysToken;


    public String getGitlabHostUrl() {
        return gitlabHostUrl;
    }

    public void setGitlabHostUrl(String gitlabHostUrl) {
        this.gitlabHostUrl = gitlabHostUrl;
    }

    public String getGitlabRootToken() {
        return gitlabRootToken;
    }

    public void setGitlabRootToken(String gitlabRootToken) {
        this.gitlabRootToken = gitlabRootToken;
    }

    public String getRocketmqNameServer() {
        return rocketmqNameServer;
    }

    public void setRocketmqNameServer(String rocketmqNameServer) {
        this.rocketmqNameServer = rocketmqNameServer;
    }

    public String getSocialProdServer() {
        return socialProdServer;
    }

    public void setSocialProdServer(String socialProdServer) {
        this.socialProdServer = socialProdServer;
    }

    public String getFlowcoreApiToken() {
        return flowcoreApiToken;
    }

    public void setFlowcoreApiToken(String flowcoreApiToken) {
        this.flowcoreApiToken = flowcoreApiToken;
    }

    public String getTeamcoreSysToken() {
        return teamcoreSysToken;
    }

    public void setTeamcoreSysToken(String teamcoreSysToken) {
        this.teamcoreSysToken = teamcoreSysToken;
    }
}
