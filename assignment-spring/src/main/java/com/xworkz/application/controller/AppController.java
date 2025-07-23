package com.xworkz.application.controller;

import com.xworkz.application.dto.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    public String name( NameDTO nameDTO, Model model) {
        System.out.println("---- Name Form Submitted ----");
        model.addAttribute("nameDTO",nameDTO);
        return "/NameResult.jsp";
    }

    @RequestMapping("/hospital")
    public String hospital(HospitalDTO hospitalDTO, Model model) {
        System.out.println("---- Hospital Form Submitted ----");
        model.addAttribute("hospitalDTO",hospitalDTO);
        return "/HospitalResult.jsp";
    }

    @RequestMapping("/rto")
    public String rto(RTOdto rtOdto, Model model) {
        System.out.println("---- RTO Form Submitted ----");
        model.addAttribute("rtOdto",rtOdto);
        return "/RTOResult.jsp";
    }

    @RequestMapping("/police")
    public String police(PoliceStationDTO policeStationDTO, Model model) {
        System.out.println("---- Police Form Submitted ----");
        model.addAttribute("policeStationDTO",policeStationDTO);
        return "/PoliceStationResult.jsp";
    }

    @RequestMapping("/fruit")
    public String fruit(FruitsDTO fruitsDTO, Model model) {
        System.out.println("---- Fruit Form Submitted ----");
        model.addAttribute("fruitsDTO",fruitsDTO);
        return "/FruitResult.jsp";
    }

    @RequestMapping("/football")
    public String football(FootballDTO footballDTO,Model model){
        System.out.println("----Football Form Submitter----");
        model.addAttribute("footballDTO",footballDTO);
        return "/FootballResult.jsp";

    }


}
