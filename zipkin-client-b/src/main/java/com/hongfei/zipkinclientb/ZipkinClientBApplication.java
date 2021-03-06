package com.hongfei.zipkinclientb;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class ZipkinClientBApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinClientBApplication.class, args);
    }
    //LoadBalanced 注解表明restTemplate使用LoadBalancerClient执行请求
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
