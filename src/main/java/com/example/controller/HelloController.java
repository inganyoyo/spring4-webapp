package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(
            HttpServletRequest request
    ) {
        HttpSession session =  request.getSession(true);
        session.setAttribute("test","test");

        System.out.println(session.getAttribute("test")+session.getId());
        return "hello";  // 반환되는 뷰 이름
    }
}
