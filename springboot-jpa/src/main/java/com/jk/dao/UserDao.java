/**
 * Copyright (C),
 * FileName: UserDao
 * Author:   zx
 * Date:     2019/4/11 18:58
 * History:
 * zx         <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.dao;

import com.jk.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 * @author 17120
 * @create 2019/4/11
 * @since 1.0.0
 */
@Repository
public interface UserDao extends JpaRepository<Book,Integer> {

    @Query(nativeQuery = true,value=" SELECT b.book_date,b.book_name,bt.type_name,b.id,b.book_price from t_book b LEFT JOIN t_booktype bt\n" +
        "ON b.type_id=bt.id  ")
    List<Book> queryBook();
}
