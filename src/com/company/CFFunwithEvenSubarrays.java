package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CFFunwithEvenSubarrays {
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(sc.readLine());
        while(t-->0) {
            int n=Integer.parseInt(sc.readLine());
            String[] str = sc.readLine().split(" ");
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=Integer.parseInt(str[i]);
            }
            System.out.println(count(arr));
        }
    }
    public static int count(int[] arr){
        int len=arr.length;
        int answer=0;
        int count=1;
        int element=arr[len-1];
        for(int i=len-2;i>=0;i--){
            if(arr[i]==element){
                count++;
            }else{
                answer++;
                count*=2;
                i=len-2*(len-1-i);
            }
            if(count>=len){
                break;
            }
        }
        return answer;
    }
}
