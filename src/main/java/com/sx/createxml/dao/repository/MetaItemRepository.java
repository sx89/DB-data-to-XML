package com.sx.createxml.dao.repository;

import com.sx.createxml.pojo.mysql.MetaItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author sunxu93@163.com
 * @date 19/7/9/009 17:10
 */
public interface MetaItemRepository extends JpaRepository<MetaItem, Long> {
    @Override
    List<MetaItem> findAll() ;

}