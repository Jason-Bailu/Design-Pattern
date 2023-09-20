package com.bailu.proxy.cglibproxy;

import com.bailu.proxy.staticproxy.TeacherDao;

/**
 * @Author: JasonD
 * @date: 2023/9/8 22:15
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        //需要add vm options
        TeacherDao teacherDao = new TeacherDao();
        TeacherDao proxyInstance = (TeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        proxyInstance.teach();
    }
}
