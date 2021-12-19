package com.example.mvcproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller

public class HelloServlet{

    @RequestMapping("/")
    public String showMyPage(){
        return "main-menu";
    }

    @RequestMapping("/showForm1")
    public String showForm(){
        return "form";
    }
    @RequestMapping("/processForm")
    public String processForm(){
        return "hellopage";
    }

    //creating a new method to process form data
    @RequestMapping("/processFormVersionTwo")
        public String letsShoutDude(HttpServletRequest request, Model model){

        //read the firm data studentName
        String theName = request.getParameter("studentName");

        //convert the data to all caps
        theName = theName.toLowerCase();

        //create the message
        String result = "Yo! " + theName;

      //add message to model
        model.addAttribute("message",result);

        return "hellopage";
        }

        @RequestMapping("/processFormthree")
    public String letShoutDude(@RequestParam("studentName") String theName, Model model){

        theName = theName.toLowerCase();
        String Result = "Yo! "+theName;
        model.addAttribute("message",Result);
        return "hellopage";

        }

}