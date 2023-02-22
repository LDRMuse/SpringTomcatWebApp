package com.springdemo.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class FormController {

    // need controller method to show the initial form
    @RequestMapping("/showForm")
    public String showForm() {
        return "greeting-form";

    }


    // need  controller method to process the form
    @RequestMapping("/processForm")
    public String processForm() {
        return "process-form";
    }

    // new controller method to read data and
    // add data to the model
    @RequestMapping(value="/processFormVersionTwo", method = RequestMethod.GET)
    public String letsShoutDude(ModelMap model, @RequestParam(value = "name") String name) {

        // read the request parameter from HTML form
        // convert data to uppercase
        String uppercaseName = name.toUpperCase();

        //create message

        String theMessage = "Yo! " + uppercaseName;

        // add message to model
        model.addAttribute("message", theMessage);

        return "process-form";
    }

}
