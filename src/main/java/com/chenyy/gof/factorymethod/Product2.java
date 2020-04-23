package com.chenyy.gof.factorymethod;

/**
 * 产品类2
 *
 * @author chenyy
 */
public class Product2 extends AbstractProduct {

    @Override
    public void doBiz() {
        //处理业务逻辑
        System.out.println("产品2的功能");
    }
}
