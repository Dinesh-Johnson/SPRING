package com.xorkz.icecream.controller;


import com.xorkz.icecream.dto.OrderDTO;
import com.xorkz.icecream.service.OrderService;
import com.xorkz.icecream.service.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class OrderController {

    @Autowired
    private OrderServiceImpl service;


    @RequestMapping("/submitOrder")
    public String handleOrder(OrderDTO dto, Model model) {
        System.out.println("handleorder method");
        if (service.validate(dto)) {
            model.addAttribute("name", dto.getName());
            model.addAttribute("total", dto.getQuantity() * OrderServiceImpl.getPrice(dto.getFlavour()));
            return "OrderSuccess.jsp";
        }else {
            model.addAttribute("message","Invalid Details Please Check The Details");
            return "Order.jsp";
        }
    }
}
