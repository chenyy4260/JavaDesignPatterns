package com.chenyy.gof.factorymethod;

/**
 * @author chenyy
 */
public class Product1 extends AbstractProduct {

    @Override
    public void doBiz() {
        //处理业务逻辑
        System.out.println("产品1的功能");
    }
}
