package com.sx.createxml.pojo;

/**
 * @author sunxu93@163.com
 * @date 19/7/9/009 13:23
 */
public class CreateXMLResult {
    private String printName;
    private String createPath;
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
