package com.bailu.iterator;

import java.util.Iterator;

public class ComputerCollege implements College{
    Department[] departments;
    int index = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("java", "for java");
        addDepartment("php", "for php");
        addDepartment("go", "for go");
    }

    @Override
    public String getName() {
        return "computer college";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[index] = department;
        index++;
    }

    @Override
    public Iterator createIterator() {
        return new ComputerIterator(departments);
    }
}
