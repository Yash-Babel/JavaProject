package com.service;
import java.util.Scanner;
public class FibonacciSequence
{
    static int fibonacci(int n)                     //To print nth fibonacci number
    {   if(n==0)
        { return 0; }
        else
        { int a=0; int b=1; int c;
        for(int i=1;i<=n-2;i++)
        { c=a;  a=b;  b=b+c;}
        return b;   }
    }
    static int fibonacciRecursion(int n)                    //To print nth fibonacci number using recursion
    {   if(n==0 || n==1)                                     //    this can also be written as
        { return n-1;  }                                     //    if (n == 1) {return 0}    else if (n == 2) { return 1; }
        else
        { return fibonacci(n-1)+fibonacci(n-2);}
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=fibonacci(n);
        System.out.println(result);

        int result1=fibonacciRecursion(n);
        System.out.println(result1);

    }
}
