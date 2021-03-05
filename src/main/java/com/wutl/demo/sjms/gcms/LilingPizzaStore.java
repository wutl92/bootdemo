package com.wutl.demo.sjms.gcms;

/**
 * @author wutl
 * @Title: 醴陵披萨店
 * @Package
 * @Description:
 * @date 2021-3-3 17:16
 */
public class LilingPizzaStore extends PizzaStore {
    /**
     * @Description:
     * @Author: wutl
     * @Date: 2021-3-4 16:52
     * @param type: asd
     * @return: com.wutl.demo.sjms.gcms.Pizza
     **/
    @Override
    public Pizza createPizza(String type) {

        Pizza pizza = null;
        if ("pukou".equals(type)) {
            pizza = new PukouPizza();
        }
        return pizza;
    }
}
