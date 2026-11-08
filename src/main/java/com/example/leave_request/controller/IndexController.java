package com.example.leave_request.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller 
public class IndexController {
    
    /*
     * RequestMapping("/") public String index()
     * @return "redirect:/login/"
     */
    @RequestMapping(path="/")
    public String index(){
        return "redirect:/login/";
    }

        /*
     * RequestMapping("/login/") public String login()
     * @return "index"
     */
    @RequestMapping(path="/login/")
    public String login(){
        return "index";
    }
}
