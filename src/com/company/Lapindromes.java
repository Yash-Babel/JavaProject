package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lapindromes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
//        String st=sc.next();
//        System.out.println(st);
        List<Character> arl=new ArrayList<>();
        for(int i=0;i<t;i++) {
            String str=sc.next();
            System.out.println(str);
            int len=str.length();
            for(int j=0;j<len/2;j++){
                arl.add(str.charAt(j));
            }
            for(int k=0;k<len/2;k++){
                char ch=str.charAt(len-k-1);
                if(arl.contains(ch)){
//                    boolean b=arl.remove(ch);
                }else{
                    System.out.println("NO");
                    break;
                }
            }
            if(arl.isEmpty()){
                System.out.println("YES");
            }else{
                arl.clear();
            }
        }
    }
}

