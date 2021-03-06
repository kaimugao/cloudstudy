package com.atguigu.springcloud.alibaba.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @auther: lanxin
 * @date： 2020-05-22 10:36
 * @description： TODO
 */
@RestController
@Slf4j
public class NacosOrderController {

    @Resource
    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serviceURL;

    @GetMapping(value = "/consumer/payment/nacos/{id}")
    public String echo(@PathVariable String id) {
        log.info("service url: " + serviceURL);
        return restTemplate.getForObject(serviceURL + "/payment/nacos/" + id, String.class);
    }
}
