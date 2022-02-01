package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCPrimeGenerator {
    public static String primeNumbers(int m,int n){
        StringBuilder sb=new StringBuilder();
        int i;
        boolean prime=true;
        if(m==1||m==2){
            sb.append(2).append("\n");
            m=3;
        }
        if (m % 2 == 0) {
            i=m+1;
        }else {
            i=m;
        }
        for(;i<=n;i=i+2){
            for(int j=2;j<Math.sqrt(i)+1;j++){
                if(i%j==0){
                    prime=false;
                    break;
                }
            }
            if(prime) {
                sb.append(i).append("\n");
            }
            prime=true;
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(sc.readLine());
        while(t-->0) {
            String[] str=sc.readLine().split(" ");
            System.out.println(primeNumbers(Integer.parseInt(str[0]),Integer.parseInt(str[1])));
        }
    }
}
