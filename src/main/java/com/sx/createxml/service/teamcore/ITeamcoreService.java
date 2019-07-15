package com.sx.createxml.service.teamcore;

import org.springframework.stereotype.Component;

import java.util.Map;
@Component
public interface ITeamcoreService {

    Map<String,Object> getFileSizeAndVersion(Long dirId, String filePath);
}
