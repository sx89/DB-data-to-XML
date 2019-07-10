package com.sx.createxml.pojo.XMLDataStruct;

import com.sx.createxml.dao.repository.MetaItemRepository;
import com.sx.createxml.pojo.mysql.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunxu93@163.com
 * @date 19/7/8/008 18:00
 */
public class Print4XML {



    private  Integer printId;
    private List<MetaItem> items;

    public List<MetaItem>fillMetaItems(MajorPlanning majorPlanning, MajorDetail majorDetail,
                                            SubProjectDetail subProjectDetail,
                                            ProjectApply projectApply,List<MetaItem> items) {
        this.items =items;

        //TODO 给items的value们赋值
        return this.items;

    }
    public Print4XML() {

    }


    public List<MetaItem> getItems() {
        return this.items;
    }

    public void setItems(ArrayList<MetaItem> items) {
        this.items = items;
    }

    public Integer getPrintId() {
        return printId;
    }


    public void setPrintId(Integer printId) {
        this.printId = printId;
    }


}
