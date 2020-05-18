package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @auther: lanxin
 * @date： 2020-05-13 17:41
 * @description： TODO
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    //@LoadBalanced //赋予restTemplate负载均衡调用服务的能力
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
