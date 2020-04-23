package com.chenyy.gof.factorymethod;

/**
 * 工厂方法模式
 *
 * @author chenyy
 */
public class TestFactoryMethod {

    public static void main(String[] args) {

        Factory factory = new Factory();

        Product1 p1 = factory.createProduct(Product1.class);
        p1.common();
        p1.doBiz();

        Product2 p2 = factory.createProduct(Product2.class);
        p2.common();
        p2.doBiz();
    }
}
