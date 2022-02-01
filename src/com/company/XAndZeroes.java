package com.company;

import java.util.Scanner;

class Game3
{

//    String a = "a", b = "b", c = "c", d = "d", e = "e", f = "f", g = "g", h = "h", i = "i";
//    boolean bool=false;
//    public void give()
//    {
//        System.out.printf("%s|%s|%s", a, b, c);
//        System.out.println();
//        System.out.printf("%s|%s|%s", d, e, f);
//        System.out.println();
//        System.out.printf("%s|%s|%s", g, h, i);
//        System.out.println();
//    }
//    public void check()
//    {
//        if (a == b && b == c && a == "X" || d == e && e == f && d == "X" || g == h && h == i && g == "X" || a == d && d == g && a == "X" || b == e && e == h && b == "X"
//                || c == f && f == i && i == "X" || a == e && e == i && a == "X" || c == e && e == g && c == "X")
//        {
//            System.out.println("Player with X wins!!");
//            bool=true;
//        }
//        if (a == b && b == c && a == "0" || d == e && e == f && d == "0" || g == h && h == i && g == "0" || a == d && d == g && a == "0" || b == e && e == h && b == "0"
//                || c == f && f == i && i == "0" || a == e && e == i && a == "0" || c == e && e == g && c == "0")
//        {
//            System.out.println("Player with 0 wins!!");
//            bool=true;
//        }
//    }

    public char arr[][]={
            {'.','.','.'},
            {'.','.','.'},
            {'.','.','.'}
    };

    public Game3(){

        // initialize array;
    }

    public void placeCharacter(char ch, int i, int j){
            arr[i][j] = ch;
        }


    public boolean checkWinner(char ch){
        return false;
    }

    public void printBoard(){
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print("|"+arr[i][j]+"|");
            }
            System.out.println();
        }
    }

}
public class XAndZeroes {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i = 0;
        Game3 game3 = new Game3();
        game3.printBoard();
        while (i < 9) {
            char ch='X';
            if(i%2==1){
                ch='0';
            }
            System.out.printf("Enter for %s: rowNumber(0,1,2) columnNumber(0,1,2)",ch);
            int rowNumber= sc.nextInt();
            int columnNumber= sc.nextInt();
            if(rowNumber>=0&&rowNumber<3&&columnNumber>=0&&columnNumber<3) {
                if(game3.arr[rowNumber][columnNumber]=='.') {
                    game3.placeCharacter(ch, rowNumber, columnNumber);
                    game3.checkWinner(ch);
                    i++;
                }
                else{
                    System.out.println("Already Filled Space.");
                }
            } else{
                System.out.println("Invalid Input.");
            }
            game3.printBoard();
            // X 1 0
            // validate if input is correct
            // place the character
            // check winner
            // print board
        }

//        int[][] array = new int[3][3];
//
//
//
//        Game3 game=new Game3();
//        Scanner sc=new Scanner(System.in);
//        game.give();
//        game.check();
//        for(int i=1;i<=5;i++)
//        {
//            System.out.println("Chosse a place a make it X");
//            String p1=sc.next();
//            switch (p1)
//            {
//                case "a" -> {game.a = "X";}
//                case "b" -> {game.b = "X";}
//                case "c" -> {game.c = "X";}
//                case "d" -> {game.d = "X";}
//                case "e" -> {game.e = "X";}
//                case "f" -> {game.f = "X";}
//                case "g" -> {game.g = "X";}
//                case "h" -> {game.h = "X";}
//                case "i" -> {game.i = "X";}
//            }
//            game.give();
//            game.check();
//            if(game.bool)
//                break;
//            System.out.println("Chosse a place a make it 0");
//            String p2=sc.next();
//            switch (p2)
//            {
//                case "a" -> {game.a = "0";}
//                case "b" -> {game.b = "0";}
//                case "c" -> {game.c = "0";}
//                case "d" -> {game.d = "0";}
//                case "e" -> {game.e = "0";}
//                case "f" -> {game.f = "0";}
//                case "g" -> {game.g = "0";}
//                case "h" -> {game.h = "0";}
//                case "i" -> {game.i = "0";}
//            }
//            game.give();
//            game.check();
//            if(game.bool)
//                break;
//        }
    }
}

