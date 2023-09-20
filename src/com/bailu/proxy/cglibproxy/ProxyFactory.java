package com.bailu.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Author: JasonD
 * @date: 2023/9/8 22:04
 * @Description: 需要导入cglib依赖
 */
public class ProxyFactory implements MethodInterceptor {
    private final Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        //1 创建一个工具类
        Enhancer enhancer = new Enhancer();
        //2 设置父类
        enhancer.setSuperclass(target.getClass());
        //3 设置回调函数
        enhancer.setCallback(this);
        //4 创建子类对象，即代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib proxy ...");
        Object returnVal = method.invoke(target, objects);
        System.out.println("cglib upload ...");
        return returnVal;
    }
}
