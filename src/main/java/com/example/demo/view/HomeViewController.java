package com.example.demo.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeViewController {
    @RequestMapping("/")
    public String Home() {
        return "index.html";
    }
}
