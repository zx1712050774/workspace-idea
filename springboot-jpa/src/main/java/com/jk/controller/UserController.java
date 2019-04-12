/**
  * Copyright (C), 
  * FileName: UserController
  * Author:   zx
  * Date:     2019/4/11 16:23
  * History:
  * zx          <time>          <version>          <desc>
  * 作者姓名           修改时间           版本号              描述
  */
    package com.jk.controller;

import com.jk.model.Book;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈a〉
 *
 * @author 17120
 * @create 2019/4/11
 * @since 1.0.0
 */
@Controller
@RequestMapping("user")
public class UserController {
   @Autowired
   private UserService userService;

    @RequestMapping("main")
    public String hello(){
        return "aaa";
    }
    @RequestMapping("showBook")
    public String showBook(){
        return "showBook";
    }

    @RequestMapping("toAddBookPage")
    public String toAddBookPage(){
        return "addBookPage";
    }
    @RequestMapping("queryBook")
    @ResponseBody
    public List<Book> queryBook(){
        List<Book> list = userService.queryBook();
        return list;
    }
    @RequestMapping("addBook")
    @ResponseBody
    public String addBook(Book book){
        book.setBookDate(new Date());
        userService.addBook(book);
        return "";
    }
    @RequestMapping("delBook")
    public String delBook(Integer id){
        System.out.println(id);
        userService.delBook(id);
        return "";
    }
    @RequestMapping("queryBookById")
    public String queryBookById(){
        Integer id=3;
        Book book=userService.queryBookById(id);
        return "";
    }
}