package com.chenyy.gof.factorymethod;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by tonychen on 2020/3/19.
 */
public class TestFactoryMethod {
    public static void main(String[] args) {
//        Creator creator = new ConcreteCreator();
//        ConcreteProduct1 product = creator.createProduct(ConcreteProduct1.class);
//        product.method1();
//        product.method2();

        Set<String> strings = new HashSet<>();
        strings.add("111");
        strings.add("222");
        strings.add("333");
        strings.add("444");
        Iterator iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
