package com.company;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class Student1{
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void anothermethod(){  }
}
public class HRJavaReflectionAttributes {
    public static void main(String[] args) {
//        Class student = ;
        Method[] methods = Student1.class.getDeclaredMethods();
        System.out.println(methods[0]);
        ArrayList<String> methodList = new ArrayList<>();
        String str;
        int last;
        int first;
        for (Method mt : methods) {
            str = mt.toString();
            last = str.lastIndexOf("(");
            first = str.lastIndexOf(".", last);
            methodList.add(str.substring(first + 1, last));
        }
        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }
}
