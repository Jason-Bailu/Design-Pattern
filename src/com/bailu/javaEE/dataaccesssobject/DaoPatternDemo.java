package com.bailu.javaEE.dataaccesssobject;

public class DaoPatternDemo {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        for (Student student : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    +student.getRollNo()+", Name : "+student.getName()+" ]");
        }

        Student student = studentDao.getAllStudents().get(0);
        student.setName("Micheal");
        studentDao.updateStudent(student);

        for (Student studentnew : studentDao.getAllStudents()) {
            System.out.println("Student: [RollNo : "
                    +studentnew.getRollNo()+", Name : "+studentnew.getName()+" ]");
        }
    }
}
