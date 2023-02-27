package com.springdemo.mvc.controllers;

import com.springdemo.mvc.models.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;


@Controller
@RequestMapping("/student")
public class StudentController {

    @Value("#{countryOptions}")
    private Map<String, String> countryOptions;

    @RequestMapping("/showForm")
    public String showForm(Model model) {

        // create new Student obj
        Student theStudent = new Student();

        // add student obj to the model
        model.addAttribute("student", theStudent);

        // add the country options to the model
        model.addAttribute("theCountryOptions", countryOptions);

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {

        // log input data to form page
        System.out.println("Student:" + theStudent.getFirstName());
        System.out.println("Student:" + theStudent.getLastName());
        System.out.println("Country:" + theStudent.getCountry());
        System.out.println("Language:" + theStudent.getFavoriteLanguage());
        System.out.println("Operating System(s):" + Arrays.toString(theStudent.getOperatingSystems()));

        return "student-process-form";
    }




}
