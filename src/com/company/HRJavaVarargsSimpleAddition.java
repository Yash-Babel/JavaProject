package com.company;

import java.util.Scanner;

class Add {
    void add(int... arr) {
        String st = Integer.toString(arr[0]);
        for (int j = 1; j < arr.length; j++) {
            st = st + "+" + arr[j];
        }
        int sum = 0;
        for (int k : arr) {
            sum += k;
        }
        System.out.println(st + "=" + sum);
    }
}
public class HRJavaVarargsSimpleAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[6];
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
        Add ad=new Add();
        ad.add(arr[0],arr[1]);
        ad.add(arr[0],arr[1],arr[2]);
        ad.add(arr[0],arr[1],arr[2],arr[3],arr[4]);
        ad.add(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]);
    }
}
