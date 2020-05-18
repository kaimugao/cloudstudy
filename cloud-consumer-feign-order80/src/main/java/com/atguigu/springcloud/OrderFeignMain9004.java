package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @auther: lanxin
 * @date： 2020-05-15 8:39
 * @description： TODO
 */
@SpringBootApplication
@EnableFeignClients  //使用feign，激活并开启
public class OrderFeignMain9004 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain9004.class, args);
    }
}
