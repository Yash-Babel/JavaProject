package com.company;
import java.util.Scanner;
public class Pattern
{
   static void pattern(int n)
   {
      for(int i=1;i<=n;i++)
      {
         for(int j=1;j<=n-i+1;j++)
         {
            System.out.print("* ");
         }
         System.out.println();
      }
   }
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int n=sc.nextInt();
      pattern(n);
   }
}
