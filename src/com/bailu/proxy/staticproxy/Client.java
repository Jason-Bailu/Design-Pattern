package com.bailu.proxy.staticproxy;

/**
 * @Author: JasonD
 * @date: 2023/9/8 21:51
 * @Description:
 */
public class Client {
    public static void main(String[] args) {
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(new TeacherDao());
        teacherDaoProxy.teach();
    }
}
