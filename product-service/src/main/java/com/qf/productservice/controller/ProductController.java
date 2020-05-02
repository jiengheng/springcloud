package com.qf.productservice.controller;

import com.qf.entity.TProduct;
import com.qf.productservice.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private IProductService productService;

    @RequestMapping("/list")
    public List<TProduct> getProductList(){
        System.out.println("------server.port:"+port);
        List<TProduct> list = productService.list();
        list.add(new TProduct(3,"端口",Integer.valueOf(port)));
        return list;
    }


}
