package com.hongfei.zipkinclienta.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: springcloud-demo
 * @Date: 2019-05-14 23:14
 * @Author: Mr.Shen
 * @Description:
 */
@RestController
public class HelloController {
    @Resource
    private RestTemplate restTemplate;


    @RequestMapping("/serviceAInfo")
    public String serviceBInfo() {
        System.out.println("serviceAInfo  start");
        return "serviceA  被调用了";
    }

    @RequestMapping("/getServiceB")
    public String getServiceA() {
        System.out.println("开始访问serviceB");
        return restTemplate.getForObject("http://localhost:8203/serviceBInfo", String.class);
    }

}
