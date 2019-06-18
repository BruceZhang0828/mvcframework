package com.zhy.demo.service;

import com.zhy.mvcframework.annotation.GpService;

@GpService
public class DemoService implements IDemoService {
    @Override
    public String get(String name) {
        return "My name is "+name;
    }
}
