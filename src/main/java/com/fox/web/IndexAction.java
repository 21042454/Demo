package com.fox.web;

import com.opensymphony.xwork2.Action;

public class IndexAction  implements Action{

    public String execute() throws Exception {
        System.out.println("action访问成功");
        return "test";
    }





}
