package com.bailu.javaEE.mvc;

public class StudentController {
    private Student model;
    private StudentView studentView;

    public StudentController(Student model, StudentView studentView) {
        this.model = model;
        this.studentView = studentView;
    }

    public String getModelName() {
        return model.getName();
    }

    public void setModelName(String name) {
        this.model.setName(name);
    }

    public String getStudentRollNo() {
        return model.getRollNo();
    }

    public void setStudentView(String rollNo) {
        this.model.setRollNo(rollNo);
    }

    public void updateView() {
        studentView.printStudentDetails(model.getName(), model.getRollNo());
    }
}
