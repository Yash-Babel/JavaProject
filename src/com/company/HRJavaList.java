package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class HRJavaList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> lst=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            lst.add(i,sc.nextInt());
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            String str=sc.next();
            if(Objects.equals(str, "Delete")){
                lst.remove(sc.nextInt());
            }
            if(Objects.equals(str, "Insert")){
                lst.add(sc.nextInt(),sc.nextInt());
            }
        }
        for(int i=0;i<lst.size();i++){
            System.out.print(lst.get(i)+" ");
        }
    }
}
