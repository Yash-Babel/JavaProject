package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class CCBuyingSweets {
    public static int maxSweets(ArrayList<Integer> arl, int n, int x){
        int i=0;
        int sum=0;
        for(;i<n;i++){
            sum+=arl.get(i);
        }
        int remainder=sum%x;
        i=0;
        for(;i<n;i++){
            if(arl.get(i)<=remainder){
                return -1;
            }
        }
        return sum/x;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(sc.readLine());
        ArrayList<String> arls = new ArrayList<>();
        ArrayList<Integer> arln = new ArrayList<>();
        while(t-->0) {
            arls.addAll(Arrays.asList(sc.readLine().split(" ")));
            int n=Integer.parseInt(arls.get(0));
            int x=Integer.parseInt(arls.get(1));
            arls.clear();
            arls.addAll(Arrays.asList(sc.readLine().split(" ")));
            for(int i=0;i<n;i++){
                arln.add(Integer.parseInt(arls.get(i)));
            }
            System.out.println(maxSweets(arln,n,x));
            arls.clear();
            arln.clear();
        }
    }
}
