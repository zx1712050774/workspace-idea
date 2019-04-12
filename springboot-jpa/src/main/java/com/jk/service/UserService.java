/**
 * Copyright (C),
 * FileName: UserService
 * Author:   zx
 * Date:     2019/4/11 18:52
 * History:
 * zx         <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service;

import com.jk.model.Book;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 *
 * @author 17120
 * @create 2019/4/11
 * @since 1.0.0
 */
public interface UserService {

    void addBook(Book book);

    void delBook(Integer id);

    Book queryBookById(Integer id);

    List<Book> queryBook();
}
