package com.xworkz.demo.controller;

import com.xworkz.demo.dto.ContactDTO;
import com.xworkz.demo.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ContactController {

    @Autowired
    ContactService service;

    @RequestMapping("/contact")
    public String onOpen(){
        System.out.println("Opening Contact...");
        return "Contact";
    }
    @RequestMapping("/save")
    public String saveContact(ContactDTO dto, Model model){

        String error =  service.validateAndSave(dto);
        if (error!=null){
            model.addAttribute("error",error);
            model.addAttribute("dto",dto);

            return "Contact";
        }

        model.addAttribute("dto",dto);
        return "ContactSuccess";
    }
}
