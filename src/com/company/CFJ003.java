package com.company;

import java.util.Scanner;

public class CFJ003 {

    public static int check(int a,int b){
        int mini=Math.min(a,b);
        int maxi=a+b-mini;
        if (mini<=maxi/3) {
            return mini;
        }else{
            return (mini+maxi)/4;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a =sc.nextInt();
            int b =sc.nextInt();
            System.out.println(check(a,b));
        }

        /*method 2
        * answer is Minimum of (a,b,(a+b)/4)
        */
    }
}
