package com.sx.createxml.pojo.XMLDataStruct;

import com.sx.createxml.pojo.MajorDetail;
import com.sx.createxml.pojo.MajorPlanning;
import com.sx.createxml.pojo.ProjectApply;
import com.sx.createxml.pojo.SubProjectDetail;

import java.util.HashMap;

/**
 * @author sunxu93@163.com
 * @date 19/7/9/009 10:01
 */
public class PrintInfoBasic {
    private String name = "图纸信息元数据";

    public static final String[] listFileBasic = {
            "工程编号",
            "工程名称",
            "子项名称",
            "设计阶段",
            "设计专业",
            "设计单位",
            "建设单位",
            "合作设计单位",
            "图纸编号",
            "图纸名称",
            "版次",
            "电子源文件",
            "预览文件",
            "扫描件",
            "图幅",
            "比例",
            "设计人",
            "绘图人",
            "校对人",
            "审核人",
            "审定人",
            "专业负责人",
            "设计总负责人",
            "出图日期",
            "图纸方向",
            "二维码",
            "缩略图",
            "备注"};

    private HashMap<String, Object> hashMap = new HashMap<>();

    public PrintInfoBasic() {
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
