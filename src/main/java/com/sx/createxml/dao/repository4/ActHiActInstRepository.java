package com.sx.createxml.dao.repository4;

import com.sx.createxml.pojo.flowcore.ActHiActInst;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author sunxu93@163.com
 * @date 19/7/12/012 17:31
 */
//TODO  主键是string官方改一下
public interface ActHiActInstRepository extends JpaRepository<ActHiActInst, String> {
    @Override
    List<ActHiActInst> findAll();

    ActHiActInst getById(String id);

    List<ActHiActInst> getByProcInstId(String procInstId);

}
