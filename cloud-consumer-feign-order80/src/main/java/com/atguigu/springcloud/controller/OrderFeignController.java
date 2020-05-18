package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.sevice.PaymentFeginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @auther: lanxin
 * @date： 2020-05-15 8:40
 * @description： TODO
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeginService paymentFeginService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        // Feign自带负载均衡功能
        return paymentFeginService.getPaymentById(id);
    }

    @GetMapping("/consumer/feign/timeout")
    public String paymentTimeout() {
        return paymentFeginService.paymentTimeout();
    }

}
