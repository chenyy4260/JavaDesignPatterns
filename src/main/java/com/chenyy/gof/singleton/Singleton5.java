package com.chenyy.gof.singleton;

/**
 * 静态类部类模式（线程安全）
 *
 * @author chenyy
 */
public class Singleton5 {

    private static class InnerSingleton {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {
        //避免通过反射创建新对象
        if (null != InnerSingleton.INSTANCE) {
            throw new RuntimeException("当前对象不可以多次实例化");
        }
    }

    public static Singleton5 getInstance() {
        return InnerSingleton.INSTANCE;
    }
}
