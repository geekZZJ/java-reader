package com.example.reader.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {
    @GetMapping("/test/t1")
    @ResponseBody
    public Map test1() {
        Map result = new HashMap();
        result.put("test", "测试文本");
        return result;
    }
}
