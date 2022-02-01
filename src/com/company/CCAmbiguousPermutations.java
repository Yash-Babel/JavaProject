package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CCAmbiguousPermutations {

    public static boolean check(int[] arl, int n) {
        for(int i=0;i<n;i++){
            if(arl[arl[i]-1]!=i+1){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            } else {
                int[] arl=new int[n];

                for (int j = 0; j < n; j++) {
                    arl[j]=sc.nextInt();
                }
                if (check(arl, n)) {
                    System.out.println("ambiguous");
                } else {
                    System.out.println("not ambiguous");
                }
            }
        }
    }
}
