package com.example.reader.service.impl;

import com.example.reader.entity.Category;
import com.example.reader.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class CategoryServiceTest {
    @Resource
    private CategoryService categoryService;

    @Test
    public void selectAll() {
        List<Category> list = categoryService.selectAll();
        System.out.println(list);
    }
}
