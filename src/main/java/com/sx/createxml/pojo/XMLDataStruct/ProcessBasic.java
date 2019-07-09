package com.sx.createxml.pojo.XMLDataStruct;

import com.sx.createxml.pojo.MajorDetail;
import com.sx.createxml.pojo.MajorPlanning;
import com.sx.createxml.pojo.ProjectApply;
import com.sx.createxml.pojo.SubProjectDetail;

import java.util.HashMap;

/**
 * @author sunxu93@163.com
 * @date 19/7/9/009 10:02
 */
public class ProcessBasic {
    private String name = "过程行为元数据";

    public static final String[] listProcessBasic = {
            "行为事件类型",
            "行为责任人职责",
            "行为责任者",
            "行为责任者IP",
            "行为时间",
            "行为序号",
            "处理意见"

    };

    private HashMap<String, Object> hashMap = new HashMap<>();


    public ProcessBasic() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String[] getListProcessBasic() {
        return listProcessBasic;
    }

    public HashMap<String, Object> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<String, Object> hashMap) {
        this.hashMap = hashMap;
    }

    //TODO 类似com.sx.createxml.pojo.XMLDataStruct.FileBasic 的fillhashmap填充hashmap

    public HashMap<String,Object> fillFileBasic(MajorPlanning majorPlanning, MajorDetail majorDetail,
                                                SubProjectDetail subProjectDetail, ProjectApply projectApply) {


        return hashMap;
    }
}
