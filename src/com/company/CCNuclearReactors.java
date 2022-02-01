package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCNuclearReactors {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder answer=new StringBuilder();
        String[] arr=sc.readLine().split(" ");
        int a=Integer.parseInt(arr[0]);
        int n=Integer.parseInt(arr[1]);
        int k=Integer.parseInt(arr[2]);
        int i=0;
        while(i<k){
            answer.append(a%(n+1)).append(" ");
            a=a/(n+1);
            i++;
        }
        System.out.println(answer);
    }
}
