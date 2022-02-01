package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class CCTheMinimumNumberOfMoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        //Increasing everyone except one is same as decreasing anyone,
        int t = sc.nextInt();                       // so just bring every number equal to the smallest number.
        while (t-- > 0) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            int answer=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int cd=0;
            for(int i=1;i<n;i++){
                cd=cd+arr[i]-arr[0];
            }
            System.out.println(cd);
        }
    }
}
