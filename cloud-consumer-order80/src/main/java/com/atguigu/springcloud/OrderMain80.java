package com.atguigu.springcloud;

import com.atguigu.myrule.MySelefRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @auther: lanxin
 * @date： 2020-05-13 17:34
 * @description： TODO
 * 在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使该配置生效，形如：
 */
@EnableEurekaClient
@SpringBootApplication
//@RibbonClient(name="CLOUD-PAYMENT-SERVICE", configuration = MySelefRule.class)
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}
