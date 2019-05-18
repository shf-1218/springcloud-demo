package com.hongfei.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springcloud-demo
 * @Date: 2019-05-08 22:13
 * @Author: Mr.Shen
 * @Description:
 */
@RefreshScope
@RestController
public class ConfigClientController {

    @Value("${writer}")
    String writer;

    @RequestMapping(value = "/writer")
    public String writer(){
        return writer;
    }
}
