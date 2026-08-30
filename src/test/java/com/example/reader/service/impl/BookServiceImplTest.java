package com.example.reader.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.reader.entity.Book;
import com.example.reader.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class BookServiceImplTest {
    @Resource
    private BookService bookService;

    @Test
    public void paging() {
        IPage<Book> pageObj = bookService.paging(2l, "quantity", 1, 10);
        List<Book> list = pageObj.getRecords();
        for (Book b : list) {
            System.out.println(b.getBookId() + ":" + b.getBookName());
        }
        System.out.println("总页数" + pageObj.getPages());
        System.out.println("总记录数" + pageObj.getTotal());
    }
}