package com.bailu.proxy.staticproxy;

/**
 * @Author: JasonD
 * @date: 2023/9/8 21:50
 * @Description:
 */
public class TeacherDaoProxy implements ITeacherDao{
    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao teacherDao) {
        this.target = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("static proxy...");
        target.teach();
        System.out.println("upload...");
    }
}
