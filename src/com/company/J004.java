package com.company;

import java.util.Scanner;

public class J004 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
        while (t-->0) {
            if(sc.nextInt()*sc.nextInt()-1==sc.nextInt()){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
