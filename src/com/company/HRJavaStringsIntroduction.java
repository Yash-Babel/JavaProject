package com.company;

import java.util.Scanner;

public class HRJavaStringsIntroduction
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        String G;
        if(A.length()>B.length())
            G=B;
        else
            G=A;
        for(int i=0;i<G.length();i++)
        {
           if(A.charAt(i)>B.charAt(i))
           {
               System.out.println("Yes");
               break;
           }
           else
           {
               System.out.println("No");
               break;
           }
        }
        String answer=(char)(A.charAt(0)-32)+A.substring(1)+" "+(char)(B.charAt(0)-32)+B.substring(1);
        System.out.println(answer);
    }
}
