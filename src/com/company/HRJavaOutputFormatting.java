package com.company;

import java.util.Scanner;

public class HRJavaOutputFormatting
{
    public static void main(String[] args)
    {
        //   METHOD 1:
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++) {
            String s1 = sc.next();
            int n1 = sc.nextInt();
            System.out.printf("%-15s%03d\n", s1, n1);
            //  EXPLATION:
            //("%-15s%03d%n", s1, x) % : used as a formatter. '-' : minus sign used for left indentation of the string.
            // 15s : here 15 denotes the string's minimum field width 15.
            // '0' : pads the extra 0s in the integer.
            // 3d : here 3 denotes integer's minimum field width 3. %n : prints the new line.
            //Hope, this helps!

        //   METHOD 2:
//        Scanner sc= new Scanner(System.in);
//        String s1= sc.next();int n1=sc.nextInt();sc.nextLine();
//        String s2= sc.next();int n2=sc.nextInt();sc.nextLine();
//        String s3= sc.next();int n3=sc.nextInt();
//        int l1=s1.length();int l2=s2.length();int l3=s3.length();
//        System.out.println("================================");
//        System.out.print(s1);
//        for(int i=1;i<=15-l1;i++)
//            System.out.print(" ");
//        if(n1>=0&&n1<=9)
//            System.out.println("00"+n1);
//        else if(n1>=10&&n1<=99)
//            System.out.println("0"+n1);
//        else
//            System.out.println(n1);
//        System.out.println();
//
//        System.out.print(s2);
//        for(int i=1;i<=15-l2;i++)
//            System.out.print(" ");
//        if(n2>=0&&n2<=9)
//            System.out.println("00"+n2);
//        else if(n2>=10&&n2<=99)
//            System.out.println("0"+n2);
//        else
//            System.out.println(n2);
//        System.out.println();
//
//        System.out.print(s3);
//        for(int i=1;i<=15-l3;i++)
//            System.out.print(" ");
//        if(n3>=0&&n3<=9)
//            System.out.println("00"+n3);
//        else if(n3>=10&&n3<=99)
//            System.out.println("0"+n3);
//        else
//            System.out.println(n3);
//        System.out.println("================================");
        }
    }
}
