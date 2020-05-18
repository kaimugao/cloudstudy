package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @auther: lanxin
 * @date： 2020-05-15 6:32
 * @description： 自定义负载均衡器
 */
public interface LoadBalancer {

    ServiceInstance instances (List<ServiceInstance> serviceInstances);

}
