package com.chenyy.gof.singleton;

/**
 * 懒汉模式（单锁，线程安全）
 *
 * @author chenyy
 */
public class Singleton2 {

    private static Singleton2 instance;

    //限制通过new Singleton()产生多个对象
    private Singleton2() {
        //避免通过反射创建新对象
        if (null != instance) {
            throw new RuntimeException("当前对象不可以多次实例化");
        }
    }

    //通过getInstance方法返回实例
    public static synchronized Singleton2 getInstance() {

        if (null == instance) {
            instance = new Singleton2();
        }

        return instance;
    }
}
