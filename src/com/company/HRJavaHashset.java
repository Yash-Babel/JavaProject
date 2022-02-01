package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HRJavaHashset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = 5;//s.nextInt();
//        String [] pair_left = new String[t];
//        String [] pair_right = new String[t];
//
//        for (int i = 0; i < t; i++) {
//            pair_left[i] = s.next();
//            pair_right[i] = s.next();
//        }

        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        pair_left[0]="john"; pair_right[0]="tom";
        pair_left[1]="john"; pair_right[1]="mary";
        pair_left[2]="john"; pair_right[2]="tom";
        pair_left[3]="mary"; pair_right[3]="anna";
        pair_left[4]="mary"; pair_right[4]="anna";

        int a=0;
        Set<String> hs=new HashSet<>();
        for(int i=0;i<t;i++) {
            if(hs.add(pair_left[i] + "," + pair_right[i])){
                a++;
            }
            System.out.println(a);
        }
        System.out.println(hs);
    }
}
