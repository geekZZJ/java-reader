package com.example.reader.controller;

import com.example.reader.entity.Category;
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

    @GetMapping("/category/list")
    @ResponseBody
    public List<Category> getAllCategory() {
        List<Category> list = categoryService.selectAll();
        return list;
    }
}
