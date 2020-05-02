package com.qf.indexservice.client;

import com.qf.entity.TProduct;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@FeignClient(name = "PRODUCT-SERVICE",qualifier="producet",fallback = ProductService.ProducetServiceFallBack.class)
public interface ProductService {

    @RequestMapping("/product/list")
    public List<TProduct> getProductList();


    @Component("producetFallBack")
    static  class ProducetServiceFallBack implements ProductService{

        @Override
        public List<TProduct> getProductList() {
            System.out.println("index未调通,进行熔断处理....."+ LocalDateTime.now());
            return new ArrayList<>();
        }
    }
}
