package com.chenyy.gof.factorymethod;

/**
 * 具体工厂类
 *
 * @author chenyy
 */
public class Factory extends AbstractFactory {

    @Override
    public <T extends AbstractProduct> T createProduct(Class<T> c) {
        AbstractProduct product = null;
        try {
            product = (AbstractProduct) Class.forName(c.getName()).newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return (T) product;
    }
}
