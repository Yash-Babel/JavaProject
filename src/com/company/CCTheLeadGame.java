package com.company;

import java.util.Scanner;

public class CCTheLeadGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int maxDiff=0;
        boolean b=true;
        int p1=0,p2=0;
        for(int i=0;i<t;i++) {
            p1+=sc.nextInt();
            p2+=sc.nextInt();
            if(p1>p2){
                if((p1-p2)>maxDiff) {
                    maxDiff=p1-p2;
                    b = true;
                }
            }else {
                if((p2-p1)>maxDiff) {
                    maxDiff=p2-p1;
                    b = false;
                }
            }
        }
        if(b){
            System.out.println("1 "+maxDiff);
        }else{
            System.out.println("2 "+maxDiff);
        }
    }
}
