package com.bailu.iterator;

import java.util.Iterator;

public class ComputerIterator implements Iterator {
    Department[] departments;
    int index = 0;

    public ComputerIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.length || departments[index] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[index];
        index++;
        return department;
    }

    @Override
    public void remove() {
        //null
    }
}
