package com.company;

public class IfElse
{
    public static void main(String[] args)
    {
        int n=5;
        if(n%2!=0)
        {
            System.out.println("Weird");
        }
        else
        {
           if(n>=2)
           {
               if(n<=5)
               {
                   System.out.println("Not Weird");
               }
               else if(n<=20)
               {
                   System.out.println("Weird");
               }
               else
               {
                   System.out.println("Not Weird");
               }
           }
        }
    }
}
