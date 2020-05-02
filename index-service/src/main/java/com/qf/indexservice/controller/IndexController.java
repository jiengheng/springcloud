package com.qf.indexservice.controller;

import com.qf.entity.TProduct;
import com.qf.indexservice.client.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("index")
public class IndexController {

//    private static String PRODUCT_URL = "http://127.0.0.1:8080/product/list";

    private static String PRODUCT_URL = "http://PRODUCT-SERVICE/product/list";

    @Autowired
    private RestTemplate restTemplate;

    @Resource(name = "producet")
    private ProductService productService;

    @RequestMapping("/show")
    public String show(Model model) {
        //调用服务商品
//       RestTemplate restTemplate = new RestTemplate();

//        String list = restTemplate.getForObject(PRODUCT_URL, String.class);

        List<TProduct> list = productService.getProductList();
        model.addAttribute("list", list);
        return "home";
    }
}
