package com.sx.createxml.pojo.XMLDataStruct;

import com.sx.createxml.pojo.mysql.MetaItem;

import java.util.List;

/**
 * @author sunxu93@163.com
 * @date 19/7/8/008 18:00
 */
public class PrintWithItem {


    private Integer printId;
    private List<MetaItem> items;

    private List<ActionMetaItem> actionMetaItems;


    public PrintWithItem() {

    }

    public Integer getPrintId() {
        return printId;
    }

    public void setPrintId(Integer printId) {
        this.printId = printId;
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
}

