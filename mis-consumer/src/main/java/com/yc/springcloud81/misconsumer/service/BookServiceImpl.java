package com.yc.springcloud81.misconsumer.service;

import com.yc.springcloud81.misconsumer.bean.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Book getBook(int id) {
        //htto://pplicatiop  服务名，由ribbon来获取服务列裹，负戳均衡
        return this.restTemplate.getForObject("http://application/book/"+id,Book.class);
    }
}
