package com.bailu.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Client {
    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        HashMap<String, Integer> var = getVal(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("the result is " + calculator.run(var));
    }

    public static String getExpStr() throws IOException {
        System.out.println("please input the expression:");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }

    public static HashMap<String, Integer> getVal(String expStr) throws IOException {
        HashMap<String, Integer> map = new HashMap<>();

        for (char ch : expStr.toCharArray()) {
            if (ch != '+' && ch != '-') {
                if (!map.containsKey(String.valueOf(ch))) {
                    System.out.println("please input value of " + String.valueOf(ch) + ":");
                    map.put(String.valueOf(ch), Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine()));
                }
            }
        }

        return map;
    }
}
