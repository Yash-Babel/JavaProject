package com.company;

import java.util.Scanner;

public class CCCountSubstrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String str=sc.next();
            long a=0;               //use long, not int.
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='1'){
                    a++;
                }
            }
            System.out.println((a*a+a)/2);
        }
    }
}
