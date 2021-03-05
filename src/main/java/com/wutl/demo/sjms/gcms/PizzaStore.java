package com.wutl.demo.sjms.gcms;

/**
 * @author wutl
 * @Title: 工厂模式
 * @Package
 * @Description: 披萨超类
 * @date 2021-3-3 17:05
 */
public abstract class PizzaStore {

    /**
     * 创建披萨
     * @Author: wutl
     * @Date: 2021-3-4 16:52
     * @param type: asd
     * @return: com.wutl.demo.sjms.gcms.Pizza
     **/
    public abstract Pizza createPizza(String type);

    /**
     * final 子类无法重写
     */
    public final void orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        System.out.println("orderPizza ...");
    }
}
