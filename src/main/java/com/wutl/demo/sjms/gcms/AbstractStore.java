package com.wutl.demo.sjms.gcms;

/**
 * @author wutl
 * @Title:
 * @Package
 * @Description: 抽象工厂-提供1个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类
 * @date 2021-3-4 17:14
 */
public abstract class AbstractStore {

    abstract Food createFood(String type);

    abstract Cat createCat(String type);
}
