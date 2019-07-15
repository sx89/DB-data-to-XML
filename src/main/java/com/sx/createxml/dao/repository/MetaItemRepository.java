package com.sx.createxml.dao.repository;

import com.sx.createxml.pojo.mysql.MetaItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sunxu93@163.com
 * @date 19/7/9/009 17:10
 */
public interface MetaItemRepository extends JpaRepository<MetaItem, Integer> {
    @Override
    ArrayList<MetaItem> findAll() ;

   MetaItem getById(Integer id);

}
