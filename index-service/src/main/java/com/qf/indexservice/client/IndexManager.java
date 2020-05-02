package com.qf.indexservice.client;

import com.qf.entity.TProduct;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@FeignClient("PRODUCT-SERVICE")
public interface IndexManager {

    @RequestMapping("/index2/list")
    public List<TProduct> getProductList();
}
