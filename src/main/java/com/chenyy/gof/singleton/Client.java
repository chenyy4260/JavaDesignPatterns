package com.chenyy.gof.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author chenyy
 */
public class Client {

    public static void main(String[] args) throws Exception {

        //Singleton singleton = new Singleton();

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

//        Singleton2 singleton1 = Singleton2.getInstance();
//        Singleton2 singleton2 = Singleton2.getInstance();

//        Singleton3 singleton1 = Singleton3.getInstance();
//        Singleton3 singleton2 = Singleton3.getInstance();

//        Singleton4 singleton1 = Singleton4.getInstance();
//        Singleton4 singleton2 = Singleton4.getInstance();
//
//        Singleton5 singleton1 = Singleton5.getInstance();
//        Singleton5 singleton2 = Singleton5.getInstance();

//        Singleton6 singleton1 = Singleton6.INSTANCE;
//        Singleton6 singleton2 = Singleton6.INSTANCE;


//        Class clazz = Class.forName("com.chenyy.gof.singleton.Singleton");
//        Constructor c = clazz.getDeclaredConstructor(null);
//        c.setAccessible(true);
//
//        Singleton singleton1 = Singleton.getInstance();
//        Singleton singleton2 = (Singleton) c.newInstance();

        if (singleton1 == singleton2) {
            System.out.println("获取到的是同一个对象");
        } else {
            System.out.println("获取到的不是同一个对象");
        }
    }
}
