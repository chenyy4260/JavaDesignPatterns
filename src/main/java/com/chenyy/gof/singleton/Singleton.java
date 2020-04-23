package com.chenyy.gof.singleton;

/**
 * 懒汉模式（无锁，线程不安全）
 *
 * @author chenyy
 */
public class Singleton {

    private static Singleton instance;

    //限制通过new Singleton()产生多个对象
    public Singleton() {
        //避免通过反射创建新对象
        if (null != instance) {
            throw new RuntimeException("当前对象不可以多次实例化");
        }
    }

    //通过getInstance方法返回实例
    public static Singleton getInstance() {

        if (null == instance) {
            instance = new Singleton();
        }

        return instance;
    }
}
