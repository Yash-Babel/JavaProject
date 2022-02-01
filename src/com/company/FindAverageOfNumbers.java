package com.service;

public class FindAverageOfNumbers
{
    static float average(int ... arr)
    {
        float sum=0f;
        for(float num : arr)
        {
            sum += num ;
        }
        return sum/arr.length;
    }
    public static void main(String[] args)
    {
        float result=average(1,2,3,4,5,65);
        System.out.println(result);
    }
}
