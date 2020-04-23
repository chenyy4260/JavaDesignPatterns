package com.chenyy.gof.factorymethod;

/**
 * Created by tonychen on 2020/3/19.
 */
public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception ex) {
            //TODO handle Exception
        }
        return (T) product;
    }
}
