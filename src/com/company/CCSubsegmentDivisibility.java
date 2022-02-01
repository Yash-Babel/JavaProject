package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCSubsegmentDivisibility {
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(sc.readLine());
        while(t-->0) {
            int n=Integer.parseInt(sc.readLine());
            StringBuilder sb=new StringBuilder();
            int current=1;
            for(int i=0;i<n/2;i++){
                sb.append(current).append(" ").append(current+1).append(" ");
                current+=4;
            }
            if(n%2==1){
                sb.append(current);
            }
            System.out.println(sb);
        }
    }
}
