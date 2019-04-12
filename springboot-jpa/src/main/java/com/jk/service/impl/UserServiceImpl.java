/**
 * Copyright (C),
 * FileName: UserServiceImpl
 * Author:   zx
 * Date:     2019/4/11 18:55
 * History:
 * zx         <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.jk.service.impl;

import com.jk.dao.UserDao;
import com.jk.model.Book;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * @author 17120
 * @create 2019/4/11
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {
        @Autowired
        private UserDao userDao;

        @Override
        public void addBook(Book book) {
                userDao.save(book);
        }

        @Override
        public void delBook(Integer id) {
                userDao.deleteById(id);
        }

        @Override
        public Book queryBookById(Integer id) {
                Book one = userDao.getOne(id);
                System.out.println(one.getBookName());
                return one;
        }

        @Override
        public List<Book> queryBook() {
                return userDao.findAll();
              //return userDao.queryBook();
        }
}
