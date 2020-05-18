package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @auther: lanxin
 * @date： 2020-05-13 16:37
 * @description： TODO
 */
public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
