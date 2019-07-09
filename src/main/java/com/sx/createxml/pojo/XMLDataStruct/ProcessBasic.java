package com.sx.createxml.pojo.XMLDataStruct;

import java.util.HashMap;

/**
 * @author sunxu93@163.com
 * @date 19/7/9/009 10:02
 */
public class ProcessBasic {
    private String name = "过程行为元数据";

    public static final String[] listFileBasic = {
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

    public static String[] getListFileBasic() {
        return listFileBasic;
    }

    public HashMap<String, Object> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<String, Object> hashMap) {
        this.hashMap = hashMap;
    }
}
