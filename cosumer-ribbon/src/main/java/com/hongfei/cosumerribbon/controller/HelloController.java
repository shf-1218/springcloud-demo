package com.hongfei.cosumerribbon.controller;

import com.hongfei.cosumerribbon.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: springcloud-demo
 * @Date: 2019-05-06 22:36
 * @Author: Mr.Shen
 * @Description:
 */
@RestController
public class HelloController {
    @Resource
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService( name );
    }
}
