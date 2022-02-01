package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class CCMaximumWeightDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n=sc.nextInt();
            int k=sc.nextInt();
            long answer=0;
            int [] weight=new int[n];
            for(int i=0;i<n;i++){
                weight[i]=sc.nextInt();
            }
            Arrays.sort(weight);
            for(int i=n-1;i>=Math.min(k,n-k);i--){
                answer+=weight[i];
            }
            for(int i=Math.min(k,n-k)-1;i>=0;i--){
                answer-=weight[i];
            }
            System.out.println(answer);
        }
    }
}
