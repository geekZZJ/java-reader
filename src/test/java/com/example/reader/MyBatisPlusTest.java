package com.example.reader;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.reader.entity.Test;
import com.example.reader.mapper.TestMapper;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MyBatisPlusTest {
    @Resource
    private TestMapper testMapper;

    @org.junit.Test
    public void testInsert() {
        Test test = new Test();
        test.setContent("测试测试123");
        testMapper.insert(test);
    }

    @org.junit.Test
    public void testUpdate() {
        Test test = testMapper.selectById(19);
        test.setContent("你好123");
        testMapper.updateById(test);
    }

    @org.junit.Test
    public void testSelect() {
        QueryWrapper<Test> queryWrapper = new QueryWrapper<Test>();
        queryWrapper.eq("id", 19);
        List<Test> list = testMapper.selectList(queryWrapper);
        System.out.println(list.get(0));
    }
}
