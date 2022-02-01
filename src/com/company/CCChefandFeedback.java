package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCChefandFeedback {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(sc.readLine());
        int count=1;
        boolean b=false;
        while(t-->0){
            String str=sc.readLine();
            if(str.charAt(0)=='1'){
                b=true;
            }
            for(int i=1;i<str.length();i++){
                if(count < 3){
                    if(str.charAt(i)=='0' && b){
                        b=false;
                        count++;
                    }else if(str.charAt(i)=='1' && !b){
                        b=true;
                        count++;
                    }
                    else if(str.charAt(i)=='0' && !b){
                        count=1;
                    }else{
                        count=1;
                    }
                }else{
                    break;
                }
            }
            System.out.println(count==3?"Good":"Bad");
            b=false;
            count=1;
        }
    }
}
