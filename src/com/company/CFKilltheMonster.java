package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CFKilltheMonster {
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(sc.readLine());
        while(t-->0) {
            String[] str = sc.readLine().split(" ");
            long hc=Long.parseLong(str[0]);
            long dc=Long.parseLong(str[1]);
            String[] str1 = sc.readLine().split(" ");
            long hm=Long.parseLong(str1[0]);
            long dm=Long.parseLong(str1[1]);
            String[] str2 = sc.readLine().split(" ");
            long k=Long.parseLong(str2[0]);
            long w=Long.parseLong(str2[1]);
            long a=Long.parseLong(str2[2]);
            if(ifWin(hc,dc,hm,dm)||usingCoins(hc,dc,hm,dm,k,w,a)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
    public static boolean usingCoins(long hc,long dc,long hm,long dm,long k,long w,long a){
        for(int i=0;i<=k;i++){
            if(ifWin(hc+i*a,dc+(k-i)*w,hm,dm)){
                return true;
            }
        }
        return false;
    }
    public static boolean ifWin(long hc,long dc,long hm,long dm){
        long cMoves,mMoves;
        if(hm%dc==0){
            cMoves=hm/dc;
        }else{
            cMoves=hm/dc+1;
        }
        if(hc%dm==0){
            mMoves=hc/dm;
        }else{
            mMoves=hc/dm+1;
        }
        return cMoves <= mMoves;
    }
}
