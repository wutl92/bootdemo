package com.wutl.demo.sjms.zszms;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description:
 * @date 2021-3-1 16:20
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Milk(darkRoast);
        darkRoast = new Milk(darkRoast);
        double cost = darkRoast.cost();
        System.out.println(cost);
    }
}
