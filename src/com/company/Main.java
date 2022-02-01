package com.company;

import com.service.SecondClass;

public class Main
{

    public static void main(String[] args)
    {
        char st='A';
        for(int j=1;j<=4;j++)
        {
            for(int i=1;i<=j;i++)
            {
                System.out.print((char)(st+i-1)+" ");
            }
            System.out.println();


        }
    }
}
