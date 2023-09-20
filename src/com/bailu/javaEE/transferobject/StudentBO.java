package com.bailu.javaEE.transferobject;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {
    List<StudentVO> studentVOS;

    public StudentBO() {
        studentVOS = new ArrayList<>();
        StudentVO studentVO1 = new StudentVO("Robert", 0);
        StudentVO studentVO2 = new StudentVO("John", 1);
        studentVOS.add(studentVO1);
        studentVOS.add(studentVO2);
    }

    public void deleteStudent(StudentVO studentVO) {
        studentVOS.remove(studentVO.getRollNo());
        System.out.println("Student: Roll No "
                + studentVO.getRollNo() +", deleted from database");
    }

    public List<StudentVO> getStudentVOS() {
        return studentVOS;
    }

    public StudentVO getStudentVO(int rollNo) {
        return studentVOS.get(rollNo);
    }

    public void updateStudentVO(StudentVO studentVO) {
        studentVOS.get(studentVO.getRollNo()).setName(studentVO.getName());
        System.out.println("Student: Roll No "
                + studentVO.getRollNo() +", updated in the database");
    }
}
