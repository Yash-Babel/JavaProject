package com.company;

import java.util.Random;
import java.util.Scanner;

class Game
{   int computer;
    public Game()
    {   Random ran = new Random();
        computer=ran.nextInt(101);              // computer chosses in range of 0 and 100
    }
}
public class GuessTheNumber
{
    public static void main(String[] args)
    {
        int maxLimit=100;
        int minLimit=0;
        System.out.println("Let's Play GUESS THE NUMBER!!!");
        Game comp=new Game();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of guesses");
        int maxi=sc.nextInt();
        int a=1;
        for(int i=1;i<=maxi;i++) {
            System.out.println();
            System.out.println("Guess number : "+a);
            System.out.printf("Enter your guess in range %d to %d",minLimit,maxLimit);
            int player = sc.nextInt();
            if (player == comp.computer) {
                System.out.println("Guessed number is RIGHT!!");
                break;
            } else if (player > comp.computer) {
                System.out.println("Guessed number is BIGGER!!");
                maxLimit=player;
            } else if (player < comp.computer) {
                System.out.println("Guessed number is SMALLER!!");
                minLimit=player;
            }
            a+=1;
        }
        if(a>maxi)
            System.out.println("You have tried all guesses!!");
        else
            System.out.println("Number of tries : "+a);
        System.out.println("computer's choice was : "+comp.computer);
    }
}
