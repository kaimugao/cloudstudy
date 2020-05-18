package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther: lanxin
 * @date： 2020-05-14 16:52
 * @description： TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsuleOrderMain9003 {

    public static void main(String[] args) {
        SpringApplication.run(ConsuleOrderMain9003.class, args);
    }
}
