package com.atguigu.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @auther: lanxin
 * @date： 2020-05-14 16:55
 * @description： TODO
 */
@RestController
public class PaymentController {

    private static final String INVOKE_SERVICE = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String paymentConsult() {
        return restTemplate.getForObject(INVOKE_SERVICE + "/payment/consul", String.class);
    }

}
