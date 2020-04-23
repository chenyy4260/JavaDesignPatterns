package com.chenyy.gof.singleton;

/**
 * 饿汉模式（线程安全）
 *
 * @author chenyy
 */
public class Singleton4 {

    private static Singleton4 instance = new Singleton4();

    //限制通过new Singleton()产生多个对象
    private Singleton4() {
        //避免通过反射创建新对象
        if (null != instance) {
            throw new RuntimeException("当前对象不可以多次实例化");
        }
    }

    public static Singleton4 getInstance() {
        return instance;
    }
}
