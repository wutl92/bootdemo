package com.wutl.demo.sjms.zszms;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-3-1 16:13
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * 消费金额
     *
     * @return
     */
    @Override
    public double cost() {
        return beverage.cost() + 0.22;
    }
}
