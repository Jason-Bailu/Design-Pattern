package com.bailu.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<College> colleges = new ArrayList<>();
        colleges.add(new ComputerCollege());
        colleges.add(new InformationCollege());

        OutputImpl output = new OutputImpl(colleges);
        output.printColleges();
    }
}
