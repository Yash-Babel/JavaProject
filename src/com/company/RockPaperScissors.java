package com.company;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter\n0 for rock\n1 for paper\n2 for scissors");
        int player=sc.nextInt();
//        System.out.println(player);
        Random ran=new Random();
        int random=ran.nextInt(3);
        int computer=random;         //0=rock ,1=paper ,2=scissors
        System.out.println("computer chooses: "+computer);
        switch(player)
        {
            case 0:
            {
                if(computer==0)
                    System.out.println("Tie");
                else if(computer==1)
                    System.out.println("computer wins");
                else if(computer==2)
                    System.out.println("player wins");
                break;
            }
            case 1:
            {
                if(computer==1)
                    System.out.println("Tie");
                else if(computer==2)
                    System.out.println("computer wins");
                else if(computer==0)
                    System.out.println("player wins");
                break;
            }
            case 2:
            {
                if(computer==2)
                    System.out.println("Tie");
                else if(computer==0)
                    System.out.println("computer wins");
                else if(computer==1)
                    System.out.println("player wins");
            }
        }
    }
}

