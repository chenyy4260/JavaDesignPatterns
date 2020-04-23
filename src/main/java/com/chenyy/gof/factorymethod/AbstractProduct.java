package com.chenyy.gof.factorymethod;

/**
 * 抽象产品类
 *
 * @author chenyy
 */
public abstract class AbstractProduct {

    /**
     * 产品类的公共方法
     */
    public void common() {
        //业务逻辑处理
        System.out.println("产品都有的功能");
    }

    /**
     * 抽象方法
     */
    public abstract void doBiz();
}
