package com.company;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(3);
        arr.add(0,20);
        arr.add(1,21);
        arr.add(2,22);
        arr.add(3,23);
        arr.add(4,24);
        arr.add(5,1);
        arr.add(6,26);
        System.out.println(arr.size());
        System.out.println(arr);
        ArrayList<Integer> arr1=arr;
        System.out.println(arr1);
        ArrayList<Integer> arr2=(ArrayList<Integer>)arr.clone();
        System.out.println(arr2);
        arr.add(100);
        arr.add(22);
        System.out.println(arr1);          // arr1 is pointing where arr is pointing.
        System.out.println(arr2);          // arr2 is pointing somewhere else.

        System.out.println(arr.contains(100));
        System.out.println(arr.indexOf(22));
        System.out.println(arr.indexOf(10));
        System.out.println(arr.lastIndexOf(22));
        System.out.println(arr.remove(1));
        System.out.println(arr);
        System.out.println(arr2);
        arr2.removeIf(num->num%2==0);
        System.out.println(arr2);


    }
}
