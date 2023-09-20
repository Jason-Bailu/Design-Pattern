package com.bailu.compostie;

/**
 * @Author: JasonD
 * @date: 2023/9/4 22:23
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        Organization university = new University("CQU", "Top university");

        Organization computerCollege = new College("computer college", "computer college");
        Organization inforColleg = new College("information college", "information college");

        computerCollege.add(new Department("software engineering", "good"));
        computerCollege.add(new Department("network engineering", "good"));
        computerCollege.add(new Department("computer science", "good"));

        inforColleg.add(new Department("connection engineering", "good"));
        inforColleg.add(new Department("information engineering", "good"));

        university.add(computerCollege);
        university.add(inforColleg);

        university.print();
    }
}
