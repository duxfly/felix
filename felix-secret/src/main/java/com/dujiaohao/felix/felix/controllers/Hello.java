package com.dujiaohao.felix.felix.controllers;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class Hello {

    @RequestMapping("/init.html")
    public String init(@PathParam(value = "aaa") String aaa){
        System.out.println("111");
        return "init("+aaa+")";
    }


    @RequestMapping("/init2.html")
    public String init2(@RequestParam(name = "aaa") String aaa){
        System.out.println("sssss"+aaa);
        return "init2("+aaa+")";
    }
}
