package com.company;

import java.util.Scanner;

public class GCDAndLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextInt();
        long b=sc.nextInt();
        long mini=Math.min(a,b);
        long gcd=1,lcm=1;
        for(int j=2;j<mini/2;j++){
            if(a%j==0&&b%j==0){
                gcd=j;
            }
        }
        if(a%mini==0&&b%mini==0){
            gcd=mini;
        }
        lcm=a*b/gcd;
        System.out.println(gcd+" "+lcm);
    }
}
