package com.wutl.demo.sjms.zszms;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-3-1 16:12
 */
public class Milk extends CondimentDecorator{

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 消费金额
     *
     * @return
     */
    @Override
    public double cost() {
        return beverage.cost()+0.11;
    }
}
