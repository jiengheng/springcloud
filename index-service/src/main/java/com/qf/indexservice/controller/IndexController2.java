package com.qf.indexservice.controller;

import com.qf.entity.TProduct;
import com.qf.indexservice.client.IndexManager;
import com.qf.indexservice.client.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController2 implements IndexManager {


    @Autowired
    private ProductService productService;

    @Override
    public List<TProduct> getProductList() {
        List<TProduct> list = productService.getProductList();
        return list;
    }
}
