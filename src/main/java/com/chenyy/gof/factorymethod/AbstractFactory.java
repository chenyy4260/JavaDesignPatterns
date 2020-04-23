package com.chenyy.gof.factorymethod;

/**
 * 抽象工厂类
 *
 * @author chenyy
 */
public abstract class AbstractFactory {
    /**
     * 通过createProduct创建一个产品对象
     * @param clazz
     * @param <T>
     * @return
     */
    public abstract <T extends AbstractProduct> T createProduct(Class<T> clazz);
}
