package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CFStrangeTest {
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(sc.readLine());
        while(t-->0) {
            String[] str = sc.readLine().split(" ");
            int a=Integer.parseInt(str[0]);
            int b=Integer.parseInt(str[1]);
            int answer=b-a;
            int diff=Integer.MAX_VALUE;
            if(intPartOfLogBase2(b)>intPartOfLogBase2(a)) {
                if (b - powerOf2(intPartOfLogBase2(b)) > a) {
                    diff = b - powerOf2(intPartOfLogBase2(b)) - a + 1;
                } else {
                    diff = a - b + powerOf2(intPartOfLogBase2(b)) + 1;
                }
            }
            if(answer>diff) {
                answer =diff;
            }
            if(answer>(a|b)-b+1) {
                answer = (a | b) - b + 1;
            }
            System.out.println(answer);
        }
    }
    public static int intPartOfLogBase2(int a){
        if(a<2){
            return 0;
        }else{
            return 1+intPartOfLogBase2(a/2);
        }
    }
    public static int powerOf2(int a){
        if(a==0){
            return 1;
        }else{
            return 2*powerOf2(a-1);
        }
    }
}
