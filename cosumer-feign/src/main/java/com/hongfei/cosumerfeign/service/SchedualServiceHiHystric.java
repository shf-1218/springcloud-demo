package com.hongfei.cosumerfeign.service;

import org.springframework.stereotype.Component;

/**
 * @program: springcloud-demo
 * @Date: 2019-05-06 23:15
 * @Author: Mr.Shen
 * @Description:
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHello {
    @Override
    public String sayHelloFromClientOne(String name) {
        return "sorry " +name;
    }
}
