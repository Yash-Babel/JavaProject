package com.company;

import java.util.Scanner;

public class CFTriangle {
    public static boolean checkRight(int[] arr){
        int a1=(arr[0]-arr[2])*(arr[0]-arr[2])+(arr[1]-arr[3])*(arr[1]-arr[3]);
        int a2=(arr[4]-arr[2])*(arr[4]-arr[2])+(arr[5]-arr[3])*(arr[5]-arr[3]);
        int a3=(arr[0]-arr[4])*(arr[0]-arr[4])+(arr[1]-arr[5])*(arr[1]-arr[5]);
        int maxi=Math.max(a1,Math.max(a2,a3));
        if(a1+a2+a3==2*maxi){
            return true;
        }
        return false;
    }
    public static boolean checkAlmost(int[] arr) {
        for(int i=0;i<6;i++){
            arr[i]+=1;
            if(checkDegenerate(arr)&&checkRight(arr)){
                return true;
            }else{
                arr[i]-=2;
                if(checkDegenerate(arr)&&checkRight(arr)){
                    return true;
                }
                arr[i]+=1;
            }
        }
        return false;
    }
    public static boolean checkDegenerate(int[] arr) {
        if((arr[0]==arr[2]&&arr[0]==arr[4])||(arr[1]==arr[3]&&arr[1]==arr[5])){
            return false;
        }else{
            if((arr[0]==arr[2]&&arr[1]==arr[3])||(arr[4]==arr[2]&&arr[5]==arr[3])||(arr[0]==arr[4]&&arr[1]==arr[5])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[6];
        for(int i=0;i<6;i++){
            arr[i]=sc.nextInt();
        }
        if(checkRight(arr)){
            System.out.println("RIGHT");
        }else if(checkAlmost(arr)){
            System.out.println("ALMOST");
        }else{
            System.out.println("NEITHER");
        }
    }
}
