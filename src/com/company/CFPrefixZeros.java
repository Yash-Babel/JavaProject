package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CFPrefixZeros {
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(sc.readLine());
        while(t-->0) {
            String[] str = sc.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            int k=Integer.parseInt(str[1]);
            String str1= sc.readLine();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=str1.charAt(i)-'0';
            }
            int answer=0;
            int value;
            for(int i=0;i<n;i++) {
                if(arr[i]==0){
                    value=10;
                }else{
                    value=arr[i];
                }
                if (k >= 10-value) {
                    answer++;
                    k= ((k-10+value)/10)*10 + 10-value;
                } else {
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}
