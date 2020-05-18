package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther: lanxin
 * @date： 2020-05-18 16:01
 * @description： 自定义的配置gateway，如果不想用yml方式可以采用此种方式
 */
@Configuration
public class GateWayConfig {

    @Bean
    public RouteLocator custumerRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_atguigu",
                r -> r.path("/guonei")
                .uri("https://news.baidu.com/guonei"));
        return routes.build();
    }

}
