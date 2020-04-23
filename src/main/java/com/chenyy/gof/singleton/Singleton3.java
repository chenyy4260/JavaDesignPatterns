package com.chenyy.gof.singleton;

/**
 * 懒汉模式（双重检验锁，DCL，即double-checked locking，线程安全）
 *
 * @author chenyy
 */
public class Singleton3 {

    private static volatile Singleton3 instance;

    //限制通过new Singleton()产生多个对象
    private Singleton3() {
        //避免通过反射创建新对象
        if (null != instance) {
            throw new RuntimeException("当前对象不可以多次实例化");
        }
    }

    //通过getInstance方法返回实例
    public static synchronized Singleton3 getInstance() {

        if (null == instance) {
            instance = new Singleton3();
        }

        return instance;
    }
}
