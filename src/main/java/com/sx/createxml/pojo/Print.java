package com.sx.createxml.pojo;

import java.util.HashMap;
import java.util.List;

/**
 * @author sunxu93@163.com
 * @date 19/7/8/008 18:00
 */
public class Print {
    public static final String[] listPrint = {"文件基本信息", "业务基本信息"};

    private String fileBasicName = listPrint[0];
    private String serviceBasicName = listPrint[1];
    private FileBasic fileBasic;
    private ServiceBasic serviceBasic;

    public static String[] getListPrint() {
        return listPrint;
    }

    public String getFileBasicName() {
        return fileBasicName;
    }

    public void setFileBasicName(String fileBasicName) {
        this.fileBasicName = fileBasicName;
    }

    public String getServiceBasicName() {
        return serviceBasicName;
    }

    public void setServiceBasicName(String serviceBasicName) {
        this.serviceBasicName = serviceBasicName;
    }

    public FileBasic getFileBasic() {
        return fileBasic;
    }

    public void setFileBasic(FileBasic fileBasic) {
        this.fileBasic = fileBasic;
    }

    public ServiceBasic getServiceBasic() {
        return serviceBasic;
    }

    public void setServiceBasic(ServiceBasic serviceBasic) {
        this.serviceBasic = serviceBasic;
    }
}
