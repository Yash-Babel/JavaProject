package com.company;

import java.util.Scanner;

class NegIntExe extends Exception{
    public String toString(){
        return "java.lang.Exception: n or p should not be negative.";
    }
}
class ZeroIntExe extends Exception{
    public String toString(){
        return "java.lang.Exception: n and p should not be zero.";
    }
}

public class HRJavaExceptionHandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            try {
                if (n < 0 || p < 0) {
                    throw new NegIntExe();
                }
                if (n==0 && p==0) {
                    throw new ZeroIntExe();
                }
                int pr = 1;
                for (int i = 0; i < p; i++) {
                    pr *= n;
                }
                System.out.println(pr);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}
