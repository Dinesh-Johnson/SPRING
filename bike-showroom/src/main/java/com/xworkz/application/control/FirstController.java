package com.xworkz.application.control;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FirstController {

    @RequestMapping("/send")
    public String onSend() {
        System.out.println("onSend Created......");
        System.out.println("Sending.................");
        return "/index.jsp";
    }
}
