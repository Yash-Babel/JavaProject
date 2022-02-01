package com.service;
import java.util.Scanner;

public class Practice2
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
        System.out.println("max marks of each subject?");
        float maxi=sc.nextInt();
        System.out.println("marks1?");
        float m1=sc.nextInt();
        System.out.println("marks2?");
        float m2=sc.nextInt();
        System.out.println("marks3?");
        float m3=sc.nextInt();
        float total=m1+m2+m3;
        if(total/(maxi*3)*100<40 || m1/maxi*100<33 || m2/maxi*100<33 || m3/maxi*100<33)
        {
            System.out.println("You are fail.");
        }
        else
        {
            System.out.println("You are pass.");
        }
    }
}
