package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialUsingBigInteger {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = BigInteger.valueOf(1);
            BigInteger c = b;
            while (a.compareTo(c) == 1) {
                b = b.multiply(a);
                a = a.subtract(c);
            }
            System.out.println(b);
        }
    }
}
