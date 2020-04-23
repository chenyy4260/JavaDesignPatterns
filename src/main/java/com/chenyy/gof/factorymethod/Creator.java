package com.chenyy.gof.factorymethod;

/**
 * Created by tonychen on 2020/3/19.
 */
public abstract class Creator {
    //创建一个产品对象，参数自行设置
    public abstract  <T extends Product> T createProduct(Class<T> c);
}
