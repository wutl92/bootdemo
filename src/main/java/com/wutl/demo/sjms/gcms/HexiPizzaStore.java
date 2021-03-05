package com.wutl.demo.sjms.gcms;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-3-4 17:17
 */
public class HexiPizzaStore extends AbstractStore{
    @Override
    Food createFood(String type) {
        //利用工厂模式获取food
        return null;
    }

    @Override
    Cat createCat(String type) {
        //利用工厂模式获取cat
        return null;
    }
}
