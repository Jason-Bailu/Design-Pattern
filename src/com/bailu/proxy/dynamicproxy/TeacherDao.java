package com.bailu.proxy.dynamicproxy;

/**
 * @Author: JasonD
 * @date: 2023/9/8 21:54
 * @Description:
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("Teacher is teaching...");
    }
}
