package com.example.reader.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.reader.entity.Book;
import com.example.reader.entity.Category;
import com.example.reader.service.BookService;
import com.example.reader.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class BookController {
    @Resource
    private CategoryService categoryService;
    @Resource
    private BookService bookService;

    @GetMapping("/category/list")
    @ResponseBody
    public List<Category> getAllCategory() {
        List<Category> list = categoryService.selectAll();
        return list;
    }

    @GetMapping("/books")
    @ResponseBody
    public IPage<Book> selectBook(Integer p) {
        if (p == null) {
            p = 1;
        }
        IPage<Book> pageObject = bookService.paging(p, 10);
        return pageObject;
    }
}
