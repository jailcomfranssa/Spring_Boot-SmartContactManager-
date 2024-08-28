package com.scm.scm20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class PageController {
    private static final Logger logger = LoggerFactory.getLogger(PageController.class);

    @RequestMapping("/home")
    public String home(Model model){
        logger.info("home page handler");
        model.addAttribute("title", "Home-pagina Inicial ");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage(){
        logger.info("about page handler");
        return "about";
    }

    @RequestMapping("/services")
    public String servicesPage(){
        logger.info("services page handler");
        return "services";
    }

    @GetMapping("/contact")
    public String contactPage(){
        logger.info("contact page handler");
        return "contact";
    }

    @GetMapping("/login")
    public String loginPage(){
        logger.info("login page handler");
        return "login";
    }

    @GetMapping("/register")
    public String registerPage(){
        logger.info("register page handler");
        return "register";
    }
}


