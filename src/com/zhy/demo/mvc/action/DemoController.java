package com.zhy.demo.mvc.action;

import com.zhy.demo.service.IDemoService;
import com.zhy.mvcframework.annotation.GPAutowired;
import com.zhy.mvcframework.annotation.GPController;
import com.zhy.mvcframework.annotation.GPRequestMapping;
import com.zhy.mvcframework.annotation.GPRequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@GPController
@GPRequestMapping(value = "/demo")
public class DemoController {
    @GPAutowired
    private IDemoService iDemoService;

    @GPRequestMapping(value = "/query")
    public void query(HttpServletRequest req, HttpServletResponse resp, @GPRequestParam("name") String name){
        String result = iDemoService.get(name);

        try {
            resp.getWriter().write(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @GPRequestMapping(value = "/add")
    public void add(HttpServletRequest req, HttpServletResponse resp,
                    @GPRequestParam("a") Integer a,@GPRequestParam("b") Integer b) {

        try {
            resp.getWriter().write(a + "+" + b + "= " +(a+b));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void remove(HttpServletRequest req,HttpServletResponse resp,@GPRequestParam("id")String id){

    }
}
