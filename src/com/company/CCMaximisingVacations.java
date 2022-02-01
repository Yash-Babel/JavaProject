package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCMaximisingVacations {
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(sc.readLine());
        while(t-->0) {
            String[] str = sc.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            int x=Integer.parseInt(str[1]);
            String sti=sc.readLine();
            int count=0;
            int answer=0;
            StringBuilder st=new StringBuilder();
            for(int i=0;i<n;i++){
                if(sti.charAt(i) == '0'){
                    count++;
                }else{
                    for(int j=0;j<count;j++){
                        st.append("0");
                    }
                    count=0;
                    st.append("1");
                }
                if(count==x){
                    answer++;
                    count=0;
                }
            }
            for(int j=0;j<count;j++){
                st.append("0");
            }
            count=0;
            System.out.println(st);
            boolean inversion = true;
            boolean extraCount=true;
            int countAfterInversion=0;
            for(int i=0;i<st.length();i++){
                if (st.charAt(i) == '0') {
                    if(inversion) {
                        count++;
                    }else{
                        countAfterInversion++;
                    }
                } else if(extraCount){
                    if(inversion){
                        count++;
                        inversion=false;
                    }else{
                        count=countAfterInversion+1;
                        countAfterInversion=0;
                    }
                }else{
                    count=0;
                }
                if(count+countAfterInversion==x){
                    answer++;
                    count=0;
                    if(!inversion){
                        extraCount=false;
                        inversion=true;
                        countAfterInversion=0;
                    }
                }
            }
            System.out.println(answer);
        }
    }
}
