package com.company;

import java.util.Scanner;

public class HRJavaSubarray {                               //sample input 1
    public static void main(String[] args) {                //5
        Scanner sc=new Scanner(System.in);                  //1 -2 4 -5 1
        int n=sc.nextInt();
        int negArrSum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i+1;j++){
                int sum=0;
                for(int k=0;k<i;k++){
                    sum+=arr[j+k];
                }
                if(sum<0){
                    negArrSum+=1;
                }
            }
        }
        System.out.println(negArrSum);
    }
}
