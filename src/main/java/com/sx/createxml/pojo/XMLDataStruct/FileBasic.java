package com.sx.createxml.pojo.XMLDataStruct;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author sunxu93@163.com
 * @date 19/7/8/008 18:01
 */
public class FileBasic {
    private String name = "文件基本信息元数据";

    public static final   String[] listFileBasic = new String[]{"文件层级", "载体","单位","数量或大小","格式名称","存址","文档创建程序名称",
            "计算机文件名"};

    private  HashMap<String, Object> hashMap = new HashMap<>();


    public String[] getListFileBasic() {
        return listFileBasic;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, Object> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<String, Object> hashMap) {
        this.hashMap = hashMap;
    }
}
