package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class HRJavaStringTokens                 //solve ,, METHOD 2 ,, METHOD 3
{
    private static void solve(String str){
        Set<Character> set = Set.of('!','@',',','.','?','\'','_',' ');
        List<String> list = new ArrayList<>();
        int size = str.length();
        String output = "";
        for(int i=0;i<size;i++){
            if(set.contains(str.charAt(i))){
                list.add(output);
                output = "";
            } else{
                output = output + str.charAt(i);
            }
        }
        System.out.println(list);
    }
    public static void main(String[] args)
    {
        solve("He is a very very good boy, isn't he?");

        //METHOD 2 ->
//        char arr[]={'!','@',',','.','?','\'','_',' '};          //He is a very very good boy, isn't he?
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        str=str.trim();
//        for(char ch:arr) str=str.replace(ch,'-');
//        str=str.replace("----","-");
//        str=str.replace("---","-");
//        str=str.replace("--","-");
//        if(str.length()>0)
//        {
//            String []result=str.split("-");
//            System.out.println(result.length);
//            for (String s : result) System.out.println(s);
//        }
//        else
//            System.out.println("0");

        //METHOD 3 ->
//        Scanner sc=new Scanner(System.in);
//        String str=sc.nextLine();
//        str=str.trim();
//        if(str.length()!=0)
//        {
//            String []result=str.split("[!,?._'@\\s]+");
//            System.out.println(result.length);
//            for (String s : result) System.out.println(s);
//        }
//        else
//            System.out.println("0");


    }
}
