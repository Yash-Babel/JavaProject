package com.company;

import java.util.Scanner;

public class HRJava1DArrayPart2 {
    public static boolean canWin(int leap, int[] game) {
        for(int i=0;i<game.length-leap+1;i++){                  //NOT yet solved
            if(game[i]==1){
                int a=1;
                for(int j=i+1;j<i+leap;j++) {
                    if (game[j] == 0) {
                        break;
                    }
                    a++;
                }
                if(a==leap){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        int[] game={0,0,0,0,1,1,1,1,1};
//        int leap=6;
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }

    }
}
