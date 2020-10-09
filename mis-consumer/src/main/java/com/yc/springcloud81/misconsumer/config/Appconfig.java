package com.yc.springcloud81.misconsumer.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//配置类
@SpringBootConfiguration
public class Appconfig {

    @Bean//Map  "restTemplate",RestTemplate对象
    @LoadBalanced  //启动ribbon的客户端负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
