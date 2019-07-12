package com.sx.createxml.service.teamcore;

import java.util.Map;

public interface ITeamcoreService {
    Map<String,Object> getFileSizeAndVersion(Long dirId, String filePath);
}
