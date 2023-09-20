package com.bailu.javaEE.dataaccesssobject;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao{
    List<Student> students;

    public StudentDaoImpl() {
        this.students = new ArrayList<>();
        Student student1 = new Student("Robert", 0);
        Student student2 = new Student("John", 1);
        students.add(student1);
        students.add(student2);
    }

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("updated");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("deleted");
    }
}
