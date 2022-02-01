package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CFRoofConstruction {
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(sc.readLine());
        while(t-->0) {
            int n=Integer.parseInt(sc.readLine());
            System.out.println(answer(n));
        }
    }
    public static int intPartOfLogBase2(int a){
        if(a<2){
            return 0;
        }else{
            return 1+intPartOfLogBase2(a/2);
        }
    }
    public static int powerOf2(int a){
        if(a==0){
            return 1;
        }else{
            return 2*powerOf2(a-1);
        }
    }
    public static String answer(int a){
        StringBuilder sb= new StringBuilder();
        int maxExponentOf2=intPartOfLogBase2(a-1);
        int specialNumbers=a-powerOf2(maxExponentOf2);
        for(int i=powerOf2(maxExponentOf2)-1;i>=specialNumbers;i--){
            sb.append(i).append(" ");
        }
        int first=0;
        int second=powerOf2(maxExponentOf2);
        for(int i=0;i<specialNumbers*2;i++){
            if(i%4==0||i%4==3){
                sb.append(first).append(" ");
                first++;
            }else{
                sb.append(second).append(" ");
                second++;
            }
        }
        return sb.toString();
    }
}
