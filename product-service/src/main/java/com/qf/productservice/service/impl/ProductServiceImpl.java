package com.qf.productservice.service.impl;

import com.qf.entity.TProduct;
import com.qf.productservice.service.IProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Override
    public List<TProduct> list() {
        List<TProduct> list = new ArrayList<>();
        list.add(new TProduct(1,"保时捷",200));
        list.add(new TProduct(2,"法拉利",300));
        return list;
    }
}
