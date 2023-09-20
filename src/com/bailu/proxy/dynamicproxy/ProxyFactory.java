package com.bailu.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: JasonD
 * @date: 2023/9/8 21:55
 * @Description:
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxytInstance() {
        /*
        1. ClassLoader loader: 指当前目标对象使用的类加载器，获取加载器的方法固定
        2. Class<?>[] interfaces: 目标对象实现接口类型，使用泛型方法确认类型
        3. InvocationHandler h: 事情处理，执行目标对象的方法时，会触发事情处理器方法，会把当前执行的目标对象方法作为参数传入
        * */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("dynamic proxy...");
                        //反射机制调用目标对象的方法
                        Object returnVal = method.invoke(target, args);
                        return returnVal;
                    }
                });
    }
}
