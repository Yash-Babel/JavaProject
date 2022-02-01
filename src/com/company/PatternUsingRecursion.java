package com.service;

public class PatternUsingRecursion
{
    static void patternRecursion(int n)
    {   if(n==1)
        {    System.out.println("*");   }
        else
        {    for (int i = 1; i <= n; i++)
            {   System.out.print("* "); }
            System.out.println();
            patternRecursion(n-1);  }
    }
    static void patternRecursion1(int n)
    {   if(n>0)
        {   patternRecursion1(n-1);
             for(int i=0;i<n;i++)
             {    System.out.print("* ");  }
            System.out.println();   }
    }
    public static void main(String[] args)
    {
        patternRecursion(4);
        System.out.println();
        System.out.println();
        patternRecursion1(4);
    }
}
