package com.company;

import java.util.Scanner;

public class CCChefandRainbowArray {
    public static boolean checkRainbow(int[] arr,int n){
        for(int ele:arr){
            if(ele<1||ele>7){
                return false;
            }
        }
        int a;
        if(n%2==0){
            a=n/2;
        }else{
            a=n/2+1;
        }
        int[] count=new int[7];
        for(int i=0;i<a;i++){
            count[arr[i]-1]++;
            if(arr[i]!=arr[n-i-1]){
                return false;
            }
        }
        for(int ele:count){
            if(ele==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int arr[]=new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            if(checkRainbow(arr,n)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
