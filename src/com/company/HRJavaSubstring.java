package com.company;

import java.util.Scanner;

public class HRJavaSubstring
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int start=sc.nextInt();
        int end=sc.nextInt();
        System.out.println(str.substring(start,end));
    }
}
