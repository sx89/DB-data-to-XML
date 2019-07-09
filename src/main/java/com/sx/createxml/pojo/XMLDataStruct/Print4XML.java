package com.sx.createxml.pojo.XMLDataStruct;

/**
 * @author sunxu93@163.com
 * @date 19/7/8/008 18:00
 */
public class Print4XML {
    public static final String[] listPrint4XML = {"文件基本信息元数据", "业务基本信息元数据",
            "图纸信息元数据","过程行为元数据"};

    private FileBasic fileBasic;
    private String fileBasicName = listPrint4XML[0];

    private ServiceBasic serviceBasic;
    private String serviceBasicName = listPrint4XML[1];

    private PrintInfoBasic printInfoBasic;
    private String printInfoBasicName = listPrint4XML[2];

    private ProcessBasic processBasic;
    private String processBasicName = listPrint4XML[3];


    public static String[] getListPrint4XML() {
        return listPrint4XML;
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

    public PrintInfoBasic getPrintInfoBasic() {
        return printInfoBasic;
    }

    public void setPrintInfoBasic(PrintInfoBasic printInfoBasic) {
        this.printInfoBasic = printInfoBasic;
    }

    public String getPrintInfoBasicName() {
        return printInfoBasicName;
    }

    public void setPrintInfoBasicName(String printInfoBasicName) {
        this.printInfoBasicName = printInfoBasicName;
    }

    public ProcessBasic getProcessBasic() {
        return processBasic;
    }

    public void setProcessBasic(ProcessBasic processBasic) {
        this.processBasic = processBasic;
    }

    public String getProcessBasicName() {
        return processBasicName;
    }

    public void setProcessBasicName(String processBasicName) {
        this.processBasicName = processBasicName;
    }
}
