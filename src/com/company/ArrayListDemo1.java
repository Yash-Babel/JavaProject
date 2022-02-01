package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(100,234,567,1,2,5,3,4,100,567,234));
        LinkedHashSet<Integer> lhs=new LinkedHashSet<>(arr);
        System.out.println(lhs);
        ArrayList<Integer> arrWithOutDuplicate=new ArrayList<>(lhs);
        System.out.println(arrWithOutDuplicate);

        ArrayList<String> l1=new ArrayList<>(Arrays.asList("A","B","C","D","E"));
        ArrayList<String> l2=new ArrayList<>(Arrays.asList("A","C","B","D","E"));

        //  checking if same.
        System.out.println(l1.equals(l2));

        //  sorting and then checking.
        Collections.sort(l1);
        Collections.sort(l2);
        System.out.println(l1.equals(l2));

        ArrayList<String> l3=new ArrayList<>(Arrays.asList("A","B","C","D","E"));
        ArrayList<String> l4=new ArrayList<>(Arrays.asList("A","C","B","D","F"));


        //finding the additional element in l3.
        l3.removeAll(l4);
        System.out.println(l3);


        ArrayList<String> l5=new ArrayList<>(Arrays.asList("A","B","C","D","E"));
        ArrayList<String> l6=new ArrayList<>(Arrays.asList("A","C","B","D","F"));
        //finding the missing element in l5.
        l6.removeAll(l5);
        System.out.println(l6);


        ArrayList<String> l7=new ArrayList<>(Arrays.asList("A","B","C","D","E"));
        ArrayList<String> l8=new ArrayList<>(Arrays.asList("A","C","B","D","F"));
        //finding the common element in l7 and l8.
        l7.retainAll(l8);
        System.out.println(l7);
        System.out.println(l8);
    }
}
