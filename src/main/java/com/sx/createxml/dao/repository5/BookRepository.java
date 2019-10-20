package com.sx.createxml.dao.repository5;

import com.sx.createxml.pojo.postgre.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sunxu93@163.com
 * @date 19/10/20/020 17:31
 */
public interface BookRepository extends JpaRepository<Book,Long> {

}
