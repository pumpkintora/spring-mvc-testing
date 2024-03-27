package com.example.demo.view;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderViewController {
    @RequestMapping("/orders")
    public String GetOrder() {
        return "/order/get-orders.html";
    }

    @RequestMapping("/new-order")
    public String NewOrder() {
        return "/order/new-order.html";
    }
}
