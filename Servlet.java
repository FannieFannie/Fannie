package com.szkingdom.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class Servlet {
@RequestMapping(value={"/he"})
public String index(HttpServletRequest request){
    return "123445";
}
}
