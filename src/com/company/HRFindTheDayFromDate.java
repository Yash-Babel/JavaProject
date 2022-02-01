package com.company;

import java.util.Objects;
import java.util.Scanner;
class Result
{
    public static boolean checkLeapYear(int year)
    {
        return ((year % 4) == 0 && (year % 100) != 0) || ((year % 4) == 0 && (year % 100) == 0 && (year % 400) == 0);
    }
    public static String findDay(int month, int day, int year)
    {
        int n=5;
        for(int i=2000;i<year;i++)
        {
            if(checkLeapYear(i))
                n=n+366;
            else
                n=n+365;
        }
        for(int j=1;j<month;j++)
        {
            if(j==1||j==3||j==5||j==7||j==8||j==10||j==12)
                n=n+31;
            else if(j==2)
            {
                if(checkLeapYear(year))
                    n=n+29;
                else
                    n=n+28;
            }
            else
                n=n+30;
        }
        n=n+day;
        switch (n % 7)
        {
            case 0 -> {
                return "SUNDAY";
            }
            case 1 -> {
                return "MONDAY";
            }
            case 2 -> {
                return "TUESDAY";
            }
            case 3 -> {
                return "WEDNESDAY";
            }
            case 4 -> {
                return "THURSDAY";
            }
            case 5 -> {
                return "FRIDAY";
            }
            case 6 -> {
                return "SATURDAY";
            }
            default -> {
                return "Error";
            }
        }
    }
}
public class HRFindTheDayFromDate
{
    public static void main(String[] args)
    {
        String result = Result.findDay(11,20,2021);
        System.out.println(result);
    }
}


