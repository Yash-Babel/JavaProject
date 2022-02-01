package com.company;

import java.util.Scanner;

public class HRJavaStringReverse {

    public static boolean check(String str){

        int i=0,j=str.length()-1;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }

    public static void checkIfPalindrome(String str)
    {
        int len=str.length();
        int k=len/2;

        int i= 0,j=len-1;


        if(k>0)
        {
            for (int kk=0,l=12;kk>20 && l <25;) {
                if (str.charAt(i) != str.charAt(len - i - 1)) {
                    System.out.println("No");
                    break;
                } else {
                    if (i == k - 1) {
                        System.out.println("Yes");
                    }
                }
            }
        }
        else
            System.out.println("Yes");
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        checkIfPalindrome(str);
    }
}
