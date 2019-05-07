package com.hongfei.cosumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: springcloud-demo
 * @Date: 2019-05-06 23:03
 * @Author: Mr.Shen
 * @Description:
 */
@FeignClient(value = "EUREKA-CLIENT",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHello {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String sayHelloFromClientOne(@RequestParam(value = "name") String name);
}
