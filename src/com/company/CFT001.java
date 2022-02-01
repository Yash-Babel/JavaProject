package com.company;

import java.util.Scanner;

public class CFT001 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                if(i*n+i+j+1>(i+1)*n){
                    System.out.print(i*n+i+j+1-n+" ");
                }else{
                    System.out.print(i*n+i+j+1+" ");
                }
            }
            System.out.println();
        }
    }
}
