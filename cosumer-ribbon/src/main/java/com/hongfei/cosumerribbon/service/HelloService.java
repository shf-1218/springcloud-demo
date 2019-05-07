package com.hongfei.cosumerribbon.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @program: springcloud-demo
 * @Date: 2019-05-06 22:34
 * @Author: Mr.Shen
 * @Description:
 */
@Service
public class HelloService {
    @Resource
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/hello?name="+name,String.class);
    }
}
