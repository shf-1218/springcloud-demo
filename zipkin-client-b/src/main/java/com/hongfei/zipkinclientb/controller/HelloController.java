package com.hongfei.zipkinclientb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: springcloud-demo
 * @Date: 2019-05-14 23:17
 * @Author: Mr.Shen
 * @Description:
 */
@RestController
public class HelloController {
    @Resource
    RestTemplate restTemplate;

    @RequestMapping("/serviceBInfo")
    public String serviceBInfo() {
        System.out.println("serviceBInfo  start");
        return "serviceB  被调用了";
    }

    @RequestMapping("/getServiceA")
    public String getServiceA() {
        System.out.println("开始访问servicea");
        return restTemplate.getForObject("http://localhost:8202/serviceAInfo", String.class);
    }

}
