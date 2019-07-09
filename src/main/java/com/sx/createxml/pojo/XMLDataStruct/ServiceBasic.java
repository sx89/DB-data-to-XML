package com.sx.createxml.pojo.XMLDataStruct;

import com.sx.createxml.pojo.MajorDetail;
import com.sx.createxml.pojo.MajorPlanning;
import com.sx.createxml.pojo.ProjectApply;
import com.sx.createxml.pojo.SubProjectDetail;

import java.util.HashMap;

/**
 * @author sunxu93@163.com
 * @date 19/7/8/008 18:05
 */
public class ServiceBasic {
    private String name = "业务基本信息元数据";

    public static final String[] listFileBasic = {"设计资质",
            "子项编号",
            "专业编号",
            "归档专业",
            "文件分类",
            "文件类别",
            "文件类别编码",
            "文件类别序号",
            "关联文件",
            "文件是否必归",
            "文件捕获节点",
            "文件来源"};

    private HashMap<String, Object> hashMap = new HashMap<>();

    public ServiceBasic() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String[] getListFileBasic() {
        return listFileBasic;
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
