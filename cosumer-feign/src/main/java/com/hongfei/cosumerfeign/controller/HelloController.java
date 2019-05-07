package com.hongfei.cosumerfeign.controller;

import com.hongfei.cosumerfeign.service.SchedualServiceHello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: springcloud-demo
 * @Date: 2019-05-06 23:05
 * @Author: Mr.Shen
 * @Description:
 */
@RestController
public class HelloController {

    @Resource
    SchedualServiceHello schedualServiceHello;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam String name) {
        return schedualServiceHello.sayHelloFromClientOne( name );
    }

}
