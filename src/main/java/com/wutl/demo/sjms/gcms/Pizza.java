package com.wutl.demo.sjms.gcms;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description: 定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个，工厂方法让类把实例化推迟到子类。
 * @date 2021-3-3 17:06
 */
public abstract class Pizza {
    /**
     * 价格
     */
    private String price;

    public void prepare(){

    }

    public void bake(){

    }

    public void cut(){

    }

    public void box(){

    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
