package com.sx.createxml.pojo.XMLDataStruct;

import com.sx.createxml.pojo.mysql.MetaItem;
import com.sx.createxml.pojo.mysql.PdfAnnotation;

import java.util.List;

/**
 * @author sunxu93@163.com
 * @date 19/7/8/008 18:00
 */
public class PrintWithItem {


    private Integer printId;

    private String printName;

    private List<MetaItem> items;

    private List<ActionMetaItem> actionMetaItems;

    private List<PdfAnnotation> pdfAnnotations;

    public PrintWithItem() {

    }



    public Integer getPrintId() {
        return printId;
    }

    public void setPrintId(Integer printId) {
        this.printId = printId;
    }

    public String getPrintName() {
        return printName;
    }

    public void setPrintName(String printName) {
        this.printName = printName;
    }

    public List<MetaItem> getItems() {
        return items;
    }

    public void setItems(List<MetaItem> items) {
        this.items = items;
    }

    public List<ActionMetaItem> getActionMetaItems() {
        return actionMetaItems;
    }

    public void setActionMetaItems(List<ActionMetaItem> actionMetaItems) {
        this.actionMetaItems = actionMetaItems;
    }

    public List<PdfAnnotation> getPdfAnnotations() {
        return pdfAnnotations;
    }

    public void setPdfAnnotations(List<PdfAnnotation> pdfAnnotations) {
        this.pdfAnnotations = pdfAnnotations;
    }
}

