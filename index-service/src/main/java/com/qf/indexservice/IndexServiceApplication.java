package com.qf.indexservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient//发现注册中心
@EnableFeignClients//开始feign调用
@EnableCircuitBreaker//开启熔断处理机制
@EnableHystrixDashboard//开启仪hystrix仪表盘
public class IndexServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(IndexServiceApplication.class, args);
    }

}
