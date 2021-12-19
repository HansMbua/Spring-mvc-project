package com.example.mvcproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("customer")
public class customerController {


    @RequestMapping("/showform")
    public String showform(Model model){
        model.addAttribute("customer", new customer());
        return "customer-form";

    }

}
