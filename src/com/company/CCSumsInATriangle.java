package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CCSumsInATriangle {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n= sc.nextInt();
            int[][] arr=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<i+1;j++){
                    arr[i][j]= sc.nextInt();
                }
            }
            for(int i=n-1;i>0;i--){
                for(int j=0;j<n-1;j++){
                    arr[i-1][j]+=Math.max(arr[i][j],arr[i][j+1]);
                }
            }
            System.out.println(arr[0][0]);
        }
    }
}
