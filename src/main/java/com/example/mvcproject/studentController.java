package com.example.mvcproject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("student")
public class studentController {

    @RequestMapping("/showForm")
    public String showForm(Model model){
        //create a student object
        Student theStudent = new Student();
        //add the object to the model
        model.addAttribute("student",theStudent);

        return "student-form";
    }

     //step 3 create a html form

    //step 4 creating the form processing code
    @RequestMapping("/processForm")
    public String confirmForm(@ModelAttribute("student") Student theStudent){
        //log the input data
        System.out.println("theStudent: "+theStudent.getFirstName()+" "+theStudent.getLastName()+" "+theStudent.getCountry());


        return "Student-confirmation";

    }

}
