package com.service;
import java.util.Scanner;
public class SumOfNaturalNumber
{
    static int sum(int n)
    {
        if(n==1)
            return 1;
        else
        return n+sum(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result = sum(n);
        System.out.println(result);

    }
}
