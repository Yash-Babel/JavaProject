package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CFMaxMinSubarray {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(sc.readLine());
        String[] arr= sc.readLine().split(" ");
        long[] nums=new long[t];
        for(int i=0;i<t;i++){
            nums[i]=Long.parseLong(arr[i]);
        }
        long maxi=nums[0];
        for(int i=1;i<t;i++){
            if(maxi<nums[i]){
                maxi=nums[i];
            }
        }
        System.out.println(maxi*maxi);
    }
}
