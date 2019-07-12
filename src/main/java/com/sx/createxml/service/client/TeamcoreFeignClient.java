package com.sx.createxml.service.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Service
@FeignClient("teamcore")

public interface TeamcoreFeignClient {
    @RequestMapping(value="api/majorDetail/getFileSizeAndVersion",method =  RequestMethod.GET,produces = {"application/json;charset=UTF-8"})
    Map<String,Object> getFileSizeAndVersion(@RequestParam("dirId")Long dirId, @RequestParam("filePath")String filePath);
}
