package com.scm.scm20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page handler");
        model.addAttribute("title", "Home-pagina Inicial ");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(){
        System.out.println("About page handler");
        return "about";
    }

    @RequestMapping("/services")
    public String servicesPage(){
        System.out.println("services page handler");
        return "services";
    }
}
