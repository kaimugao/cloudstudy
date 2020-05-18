package com.atguigu.springcloud.exception;

import com.atguigu.springcloud.entities.CommonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @auther: lanxin
 * @date： 2020-05-13 21:29
 * @description： TODO
 */
@RestControllerAdvice(basePackages = "com.atguigu.springcloud.controller")
public class CommonExceptionControllerAdvice {

    @ExceptionHandler(value = Exception.class)
    public CommonResult handleValidException(Exception e) {

        return new CommonResult(400, "传入的数据非法");
    }
}
