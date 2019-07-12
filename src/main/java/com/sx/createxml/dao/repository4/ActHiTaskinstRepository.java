package com.sx.createxml.dao.repository4;

import com.sx.createxml.pojo.flowcore.ActHiTaskinst;
import com.sx.createxml.pojo.mysql.MajorDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author sunxu93@163.com
 * @date 19/7/12/012 17:31
 */
//TODO  主键是string官方改一下
public interface ActHiTaskinstRepository extends JpaRepository<ActHiTaskinst, String> {
    @Override
    List<ActHiTaskinst> findAll();

    ActHiTaskinst getById(String id);

}
