package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CCDiscrepanciesInTheVotersList {
    //using Scanner and multiple print statement - 0.92 sec.
    //using BufferedReader and multiple print statement - 0.54 sec.
    //using BufferedReader and StringBuilder - 0.37 sec.

    public static void main(String[] args) throws IOException {
//        Scanner sc=new Scanner(System.in);
//        int n1=sc.nextInt();
//        int n2=sc.nextInt();
//        int n3=sc.nextInt();
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        String[] str=sc.readLine().split(" ");
        int n1=Integer.parseInt(str[0]);
        int n2=Integer.parseInt(str[1]);
        int n3=Integer.parseInt(str[2]);
        int input;
        Map<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> arl=new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n1+n2+n3;i++){
            input=Integer.parseInt(sc.readLine());
            if(hm.containsKey(input))  {
                hm.put(input,hm.get(input)+1);
            }else{
                hm.put(input,1);
            }
        }
        for(int key:hm.keySet()){
            if(hm.get(key)>1){
                arl.add(key);
            }
        }
        Collections.sort(arl);
        sb.append(arl.size()).append("\n");
        for(int ele:arl){
            sb.append(ele).append("\n");
        }
        System.out.println(sb);
    }
}
