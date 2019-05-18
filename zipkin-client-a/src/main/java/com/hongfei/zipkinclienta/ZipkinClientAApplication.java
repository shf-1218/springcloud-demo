package com.hongfei.zipkinclienta;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class ZipkinClientAApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinClientAApplication.class, args);
	}

	//LoadBalanced 注解表明restTemplate使用LoadBalancerClient执行请求
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
