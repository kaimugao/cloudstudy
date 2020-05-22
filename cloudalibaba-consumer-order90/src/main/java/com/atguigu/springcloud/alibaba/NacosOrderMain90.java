package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @auther: lanxin
 * @date： 2020-05-22 10:35
 * @description： TODO
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosOrderMain90 {
    public static void main(String[] args) {
        SpringApplication.run(NacosOrderMain90.class, args);
    }
}
