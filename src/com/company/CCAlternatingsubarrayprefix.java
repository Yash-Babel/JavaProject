package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CCAlternatingsubarrayprefix {
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(sc.readLine());
        while(t-->0) {
            int n=Integer.parseInt(sc.readLine());
            String[] str = sc.readLine().split(" ");
            StringBuilder sb=new StringBuilder();
            int count = 0;
            boolean b=false;
            for(int i=0;i<n;i++){
                int a=Integer.parseInt(str[i]);
                if(count==0){
                    b=a>0;
                    count++;
                }else if((b && a<0) || (!b && a>0)){
                    count++;
                    b=!b;
                }else{
                    for(int j=count;j>0;j--){
                        sb.append(j).append(" ");
                    }
                    count=0;
                    i--;
                }
            }
            for(int j=count;j>0;j--){
                sb.append(j).append(" ");
            }
            System.out.println(sb);
        }
    }
}
