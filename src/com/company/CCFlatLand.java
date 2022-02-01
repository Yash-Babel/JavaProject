package com.company;

import java.util.Scanner;

public class CCFlatLand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr={961,900,841,784,729,676,625,576,529,484,441,400,361,324,289,256,225,196,169,144,121,100,81,64,49,36,25,16,9};
        while (t-- > 0) {
            int n=sc.nextInt();
            int answer=0;
            for(int ele:arr){
                if(ele<=n){
                    n-=ele;
                    answer++;
                }
            }
            while(n>=4){
                n-=4;
                answer++;
            }
            while(n>=1){
                n-=1;
                answer++;
            }
            System.out.println(answer);
        }
    }
}
