package com.qf.entity;

import java.io.Serializable;

public class TProduct implements Serializable {
    private  long productId;

    private String name;

    private  long price;

    public TProduct() {
    }

    public TProduct(long productId, String name, long price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(long price) {
        this.price = price;
    }

}
