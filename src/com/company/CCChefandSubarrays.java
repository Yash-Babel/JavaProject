package com.company;

import java.util.Scanner;

public class CCChefandSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int answer=0;
            for(int i=1;i<=n;i++){
                for(int j=0;j<=n-i;j++){
                    int sum=0;
                    int product=1;
                    for(int k=j;k<i+j;k++){
                        sum+=arr[k];
                        product*=arr[k];
                    }
                    if(sum==product){
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
