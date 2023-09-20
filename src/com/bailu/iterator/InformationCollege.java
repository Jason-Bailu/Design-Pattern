package com.bailu.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InformationCollege implements College{
    List<Department> departments;

    public InformationCollege() {
        departments = new ArrayList<>();
        departments.add(new Department("net work", "for net work"));
        departments.add(new Department("info work", "for info work"));
        departments.add(new Department("server work", "for server work"));
    }

    @Override
    public String getName() {
        return "information college";
    }

    @Override
    public void addDepartment(String name, String desc) {
        departments.add(new Department(name, desc));
    }

    @Override
    public Iterator createIterator() {
        return new InformationIterator(departments);
    }
}
