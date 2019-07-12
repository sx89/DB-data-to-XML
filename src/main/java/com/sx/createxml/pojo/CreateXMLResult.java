package com.sx.createxml.pojo;

/**
 * 用于存储创建xml之后的返回结果
 *
 * @author sunxu93@163.com
 * @date 19/7/9/009 13:23
 */
public class CreateXMLResult {
    private String printName;
    //xml文件的存储路径
    private String createPath;
    //图纸id
    private Integer printId;

    public CreateXMLResult() {
    }

    public CreateXMLResult(String printName, String createPath, Integer printId) {
        this.printName = printName;
        this.createPath = createPath;
        this.printId = printId;
    }

    public String getPrintName() {
        return printName;
    }

    public void setPrintName(String printName) {
        this.printName = printName;
    }

    public String getCreatePath() {
        return createPath;
    }

    public void setCreatePath(String createPath) {
        this.createPath = createPath;
    }

    public Integer getPrintId() {
        return printId;
    }

    public void setPrintId(Integer printId) {
        this.printId = printId;
    }
}
