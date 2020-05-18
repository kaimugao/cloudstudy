package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther: lanxin
 * @date： 2020-05-15 5:46
 * @description： 自己指定负载均衡算法，
 * 注意这个配置类不能放在被SpringBoot启动类包及子包下
 */
@Configuration
public class MySelefRule {

    @Bean
    public IRule getMyRule() {
        return new RandomRule();
    }
}
