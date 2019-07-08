package com.sx.createxml.pojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author sunxu93@163.com
 * @date 19/7/8/008 18:01
 */
public class FileBasic {

    private  String[] listFileBasic = new String[]{"文件层级", "载体"};
    private  HashMap<String, Object> hashMap = new HashMap<>();
    private String name = "文件基本信息元数据";

    public String[] getListFileBasic() {
        return listFileBasic;
    }

    public void setListFileBasic(String[] listFileBasic) {
        this.listFileBasic = listFileBasic;
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
