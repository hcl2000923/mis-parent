package com.yc.springcloud81.misconsumer.service;

import com.yc.springcloud81.misconsumer.bean.Book;


public interface BookService {
    /**
     * 在消费端以rest形式去访问｛socket,httpClient,RestTemple｝去访问provider的服务
     * @param id
     * @return
     */
    public Book getBook(int id);
}
