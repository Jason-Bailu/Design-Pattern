package com.bailu.iterator;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {
    List<College> colleges;

    public OutputImpl(List<College> colleges) {
        this.colleges = colleges;
    }

    public void printColleges() {
        Iterator<College> collegeIterator = colleges.iterator();
        while (collegeIterator.hasNext()) {
            College college = collegeIterator.next();
            System.out.println(college.getName());
            printDepartment(college.createIterator());
        }
    }

    public void printDepartment(Iterator<Department> iterator) {
        while (iterator.hasNext()) {
            Department department = iterator.next();
            System.out.println(department.getName());
        }
    }
}
