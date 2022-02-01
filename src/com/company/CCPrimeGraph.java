package com.company;

import java.io.IOException;
import java.util.Scanner;

public class CCPrimeGraph {
    public static long primeFinder(int n){
        long num;
        boolean b=true;
        if(n%2== 0) {
            num = n - 1;
        }else{
            num=n-2;
        }
        while(num>2){
            for(int i=2;i<Math.sqrt(num)+1;i++){
                if(num%i==0){
                    b=false;
                    break;
                }
            }
            if (b) {
                return num;
            }
            num -= 2;
            b=true;
        }
        return 2;
    }
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0) {
            int n = sc.nextInt();
            long prime=primeFinder(n);
            if(n%2==0){
                System.out.println(prime*n/2);
            }else{
                System.out.println(1+(prime*(n-1)/2));
            }
        }
    }
}
