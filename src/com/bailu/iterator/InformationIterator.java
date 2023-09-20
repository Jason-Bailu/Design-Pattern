package com.bailu.iterator;

import java.util.Iterator;
import java.util.List;

public class InformationIterator implements Iterator {
    List<Department> departments;
    int index = -1;

    public InformationIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (index >= departments.size() - 1) {
            return false;
        }
        index++;
        return true;
    }

    @Override
    public Object next() {
        return departments.get(index);
    }

    @Override
    public void remove() {
        //null
    }
}
