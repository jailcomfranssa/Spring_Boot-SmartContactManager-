package com.scm.scm20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/contact")
    public String contactPage(){
        System.out.println("contact page handler");
        return new String("contact");
    }

    @GetMapping("/login")
    public String loginPage(){
        System.out.println("login page handler");
        return new String("login");
    }

    @GetMapping("/register")
    public String registerPage(){
        System.out.println("register page handler");
        return new String("register");
    }
}
