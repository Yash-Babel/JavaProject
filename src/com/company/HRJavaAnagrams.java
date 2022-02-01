package com.company;

import java.util.Locale;
import java.util.Scanner;

public class HRJavaAnagrams
{
    public static boolean isAnagram(String A,String B)
    {
        int arr1[]=new int[26];
        int arr2[]=new int[26];
        String a=A.toLowerCase();
        String b=B.toLowerCase();
        int len1=a.length();
        int len2=b.length();
        if(len1!=len2)
            return false;
        else
        {
            for(int i=0;i<len1;i++) {
                arr1[a.charAt(i)-'a']+=1;
                arr2[b.charAt(i)-'a']+=1;
            }
            for(int j=0;j<26;j++) {
                if(arr1[j]!=arr2[j]) {
                   return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        if(isAnagram(str1,str2))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}
