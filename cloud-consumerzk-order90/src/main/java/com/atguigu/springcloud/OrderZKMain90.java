package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther: lanxin
 * @date： 2020-05-14 15:17
 * @description： TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain90 {
    public static void main(String[] args) {
        SpringApplication.run(OrderZKMain90.class, args);
    }
}
