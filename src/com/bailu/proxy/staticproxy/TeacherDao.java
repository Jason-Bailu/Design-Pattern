package com.bailu.proxy.staticproxy;

/**
 * @Author: JasonD
 * @date: 2023/9/8 21:49
 * @Description:
 */
public class TeacherDao implements ITeacherDao{
    @Override
    public void teach() {
        System.out.println("teacher is teaching...");
    }
}
