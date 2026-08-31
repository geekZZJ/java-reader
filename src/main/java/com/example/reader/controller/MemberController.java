package com.example.reader.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MemberController {
    @PostMapping("/register")
    @ResponseBody
    public Map register(String vc, String username, String password, String nickname, HttpServletRequest request) {
        String code = (String) request.getSession().getAttribute("kaptchaVerifyCode");
        Map result = new HashMap();
        if (vc == null || code == null || !vc.equalsIgnoreCase(code)) {
            result.put("code", "VC01");
            result.put("msg", "验证码错误");
        } else {
            result.put("code", "0");
            result.put("msg", "success");
        }
        return result;
    }
}
