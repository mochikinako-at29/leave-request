package com.example.leave_request.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller 
public class IndexController {
    
    /*
     * 初期画面
     * @return "redirect:/login" ログイン画面へリダイレクト
     */
    @RequestMapping(path="/", method = RequestMethod.GET)
    public String index(){
        return "redirect:/login";
    }

    //ログイン時のPOSTパスを追加必要あり。
    /*
     * ログイン画面
     * @return "index"　初期表示(index)を表示
     */
    @RequestMapping(path="/login", method = RequestMethod.GET)
    public String login(){
        return "index";
    }

    /*
     * 登録画面(GET)
     * @return "register"
     */
    @RequestMapping(path="/register", method = RequestMethod.GET)
    public String getRegister(){
        return "register";
    }

    /*
     * 登録画面(POST)
     * @return "register"
     */
    @RequestMapping(path="/register", method = RequestMethod.POST)
    public String postRegister(){
        return "register";
    }
}
