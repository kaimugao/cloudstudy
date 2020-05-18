package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @auther: lanxin
 * @date： 2020-05-18 23:14
 * @description： TODO
 */
@SpringBootApplication
@EnableConfigServer  //这是一个配置中心服务
public class ConfigCenterMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class);
    }
}
