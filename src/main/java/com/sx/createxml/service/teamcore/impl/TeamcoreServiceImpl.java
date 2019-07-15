package com.sx.createxml.service.teamcore.impl;

import com.sx.createxml.service.client.TeamcoreFeignClient;
import com.sx.createxml.service.teamcore.ITeamcoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class TeamcoreServiceImpl implements ITeamcoreService {

    @Autowired
    private TeamcoreFeignClient teamcoreFeignClient;

    @Override
    public Map<String,Object> getFileSizeAndVersion(Long dirId, String filePath) {
        Map<String,Object> result = teamcoreFeignClient.getFileSizeAndVersion(dirId,filePath);
        return result;
    }
}
