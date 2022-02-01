package com.company;

import java.util.*;

public class HRJavaArraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList> arl=new ArrayList();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            for(int j=0;j<d;j++){
                int ele=sc.nextInt();
                arr.add(ele);
            }
            arl.add(arr);
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            try{
                int x=sc.nextInt();
                int y=sc.nextInt();
                System.out.println(arl.get(x-1).get(y-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
