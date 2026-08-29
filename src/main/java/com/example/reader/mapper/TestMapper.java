package com.example.reader.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.reader.entity.Test;

public interface TestMapper extends BaseMapper<Test> {
    public void insertSample();
}
