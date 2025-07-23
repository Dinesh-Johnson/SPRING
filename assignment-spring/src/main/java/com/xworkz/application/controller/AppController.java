package com.xworkz.application.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/")
public class AppController {

    public AppController() {
        System.out.println("AppControl Constructor......");
    }

    @RequestMapping("/index")
    public String onIndex(){
        System.out.println("onIndex Created...");
        return "/index.jsp";
    }

    @RequestMapping("/name")
    public String name(@RequestParam String fName, @RequestParam String mName, @RequestParam String lName, @RequestParam String displayName, Model model) {
        System.out.println("---- Name Form Submitted ----");
        model.addAttribute("fName", fName);
        model.addAttribute("mName", mName);
        model.addAttribute("lName", lName);
        model.addAttribute("displayName", displayName);
        return "/NameResult.jsp";
    }

    @RequestMapping("/hospital")
    public String hospital(@RequestParam String name, @RequestParam String location, @RequestParam String type, @RequestParam String doctors, @RequestParam String beds, @RequestParam String contact, Model model) {
        System.out.println("---- Hospital Form Submitted ----");
        model.addAttribute("name", name);
        model.addAttribute("location", location);
        model.addAttribute("type", type);
        model.addAttribute("doctors", doctors);
        model.addAttribute("beds", beds);
        model.addAttribute("contact", contact);
        return "/HospitalResult.jsp";
    }

    @RequestMapping("/rto")
    public String rto(@RequestParam String code, @RequestParam String city, @RequestParam String officer, @RequestParam String address, @RequestParam String staff, @RequestParam String timings, Model model) {
        System.out.println("---- RTO Form Submitted ----");
        model.addAttribute("code", code);
        model.addAttribute("city", city);
        model.addAttribute("officer", officer);
        model.addAttribute("address", address);
        model.addAttribute("staff", staff);
        model.addAttribute("timings", timings);
        return "/RTOResult.jsp";
    }

    @RequestMapping("/police")
    public String police(@RequestParam String station, @RequestParam String area, @RequestParam String city, @RequestParam String officer, @RequestParam String contact, @RequestParam String email,
                         @RequestParam String staff, @RequestParam String fir, @RequestParam String jurisdiction, @RequestParam String timing, Model model) {
        System.out.println("---- Police Form Submitted ----");
        model.addAttribute("station", station);
        model.addAttribute("area", area);
        model.addAttribute("city", city);
        model.addAttribute("officer", officer);
        model.addAttribute("contact", contact);
        model.addAttribute("email", email);
        model.addAttribute("staff", staff);
        model.addAttribute("fir", fir);
        model.addAttribute("jurisdiction", jurisdiction);
        model.addAttribute("timing", timing);
        return "/PoliceStationResult.jsp";
    }

    @RequestMapping("/fruit")
    public String fruit(@RequestParam String name, @RequestParam String color, @RequestParam String weight, @RequestParam String season, @RequestParam String taste, @RequestParam String country,
                        @RequestParam String vitamin, @RequestParam String price, @RequestParam String tropical, @RequestParam String ripe, Model model) {
        System.out.println("---- Fruit Form Submitted ----");
        model.addAttribute("name", name);
        model.addAttribute("color", color);
        model.addAttribute("weight", weight);
        model.addAttribute("season", season);
        model.addAttribute("taste", taste);
        model.addAttribute("country", country);
        model.addAttribute("vitamin", vitamin);
        model.addAttribute("price", price);
        model.addAttribute("tropical", tropical);
        model.addAttribute("ripe", ripe);
        return "/FruitResult.jsp";
    }


}
