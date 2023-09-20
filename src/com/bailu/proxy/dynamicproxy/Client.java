package com.bailu.proxy.dynamicproxy;

/**
 * @Author: JasonD
 * @date: 2023/9/8 22:01
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDao();

        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(teacherDao).getProxytInstance();

        proxyInstance.teach();
    }
}
