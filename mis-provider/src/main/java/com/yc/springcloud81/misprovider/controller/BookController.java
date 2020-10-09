package com.yc.springcloud81.misprovider.controller;


import com.yc.springcloud81.misprovider.bean.Book;
import com.yc.springcloud81.misprovider.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book") //http://127.0.0.1:8888/book/
public class BookController {
    //注入service
    @Autowired
    private BookService bookService;
    //http://localhost:8888/book/3  ->rest风格
    //http://localhost:8888/book/?id=1   request.getParamter()    @Param
    @GetMapping("{id}")
    public Book getBook(@PathVariable("id") Integer id){
        return bookService.getBook(id);
    }
}
