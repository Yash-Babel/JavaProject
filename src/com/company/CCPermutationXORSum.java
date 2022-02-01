package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCPermutationXORSum {
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(sc.readLine());
        while(t-->0) {
            long n=Long.parseLong(sc.readLine());
            System.out.println(maxValue(n));
        }
    }

    public static long powerOf2(long a){
        if(a==0){
            return 1;
        }else{
            return 2*powerOf2(a-1);
        }
    }

    public static long intPartOfLogBase2(long a){
        if(a<2){
            return 0;
        }else{
            return 1+intPartOfLogBase2(a/2);
        }
    }
    public static long maxValue(long a){
        if(a==0||a==1){
            return 0;
        }else if(a==2||a==3){
            return 6;
        }else if(powerOf2(intPartOfLogBase2(a)+1)-a-2==-1){
            return maxValue(a-1);
        }else{
            long x=intPartOfLogBase2(a);
            return (powerOf2(x+1)-1)*(a-powerOf2(x)+1)*2+maxValue(powerOf2(x+1)-a-2);
        }
    }
}
