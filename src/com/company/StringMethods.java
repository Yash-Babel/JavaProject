package com.company;
import java.util.Locale;
import java.util.Scanner;
public class StringMethods

{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char grade='A';
//        System.out.println((char)(grade+2));
        String str="    My name is Yash    ";
        String trimmed=str.trim();
        System.out.println(trimmed);
        String line="Yash Babel";
//        System.out.println(line.substring(1));
//        System.out.println(line.charAt(2));
//        System.out.println(line.indexOf("a"));
        String st="Harryrryrry";
        System.out.println(st.lastIndexOf("rry",4));
//        System.out.println(st.lastIndexOf("rry",5));
//        System.out.println(line.equals("Yash Babel"));
//        System.out.println(line.equalsIgnoreCase("yaSh babEl"));
//        System.out.println(line.toLowerCase());
//        System.out.println(line.replace("a","-"));

//        String name=sc.next();
//        System.out.println("Dear "+name+", Thanks a lot");
//        int nums=104;
//        String s=Integer.toString(nums);
//        System.out.println(line);

    }

}
