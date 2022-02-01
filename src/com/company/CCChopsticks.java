package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CCChopsticks {
    //with Scanner - 0.55 sec
    //with BufferedReader - 0.28 sec
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
//        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
//        String[] str=sc.readLine().split(" ");
//        int n=Integer.parseInt(str[0]);
//        int d=Integer.parseInt(str[1]);
        ArrayList<Integer> arl=new ArrayList<>();
        int answer=0;
        for(int i=0;i<n;i++){
            arl.add(sc.nextInt());
        }
        Collections.sort(arl);
        for(int i=1;i<n;i++){
            if(arl.get(i)-arl.get(i-1)<=d){
                answer++;
                i++;
            }
        }
        System.out.println(answer);
    }
}
