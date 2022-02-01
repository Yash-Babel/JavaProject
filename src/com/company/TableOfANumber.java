package com.service;
import java.util.Scanner;
public class TableOfANumber
{
    static void table(int a)
    {
        for(int i=1;i<11;i++)
        {
            System.out.printf("%d X %d = %d\n",a,i,a*i);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
                                                //Printing table of n
//        for(int i=1;i<11;i++)
//        {
////            System.out.println(n+" X "+i+" = "+n*i);
//            System.out.printf("%d X %d = %d\n",n,i,n*i);
//        }
                                                // Finding factorial of n
//        int fact=1;
//        for(int j=n;j>=1;j--)
//        {
//           fact *= j;
//        }
//        System.out.println(fact);

                                    //table using methods
        table(n);
    }
}
