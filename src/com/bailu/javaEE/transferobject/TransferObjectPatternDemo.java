package com.bailu.javaEE.transferobject;

public class TransferObjectPatternDemo {
    public static void main(String[] args) {
        StudentBO studentBO = new StudentBO();

        for (StudentVO studentVO : studentBO.getStudentVOS()) {
            System.out.println("Student: [RollNo : "
                    +studentVO.getRollNo()+", Name : "+studentVO.getName()+" ]");
        }

        //更新学生
        StudentVO student = studentBO.getStudentVOS().get(0);
        student.setName("Michael");
        studentBO.updateStudentVO(student);

        //获取学生
        studentBO.getStudentVO(0);
        System.out.println("Student: [RollNo : "
                +student.getRollNo()+", Name : "+student.getName()+" ]");
    }
}
