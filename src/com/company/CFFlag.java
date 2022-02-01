package com.company;

import java.util.Scanner;

public class CFFlag {
    public static boolean checkRow(String str,int m){
        char ch=str.charAt(0);
        for(int i=1;i<m;i++){
            if(ch!=str.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        boolean b= true;
        char before=' ';
        for(int i=0;i<n;i++){
            String str=sc.next();
            if(!checkRow(str,m)){
                b=false;
                break;
            }
            if(i!=0){
                if(before==str.charAt(0)){
                    b=false;
                    break;
                }
            }
            before=str.charAt(0);
        }
        if(b){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
