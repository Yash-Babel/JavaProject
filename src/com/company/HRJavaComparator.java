package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}
class Checker implements Comparator<Player> {

    @Override
    public int compare(Player o1, Player o2) {
        if(o1.score>o2.score){
            return -1;
        }else if(o1.score<o2.score){
            return 1;
        }else{
            int mini;
            if(o1.name.length()>o2.name.length()){
                mini=o2.name.length();
            }else{
                mini=o1.name.length();
            }
            for(int i=0;i<mini;i++){
                if(o1.name.charAt(i)>o2.name.charAt(i)){
                    return 1;
                }else if(o1.name.charAt(i)<o2.name.charAt(i)){
                    return -1;
                }
            }
            return 0;
        }
    }
}

public class HRJavaComparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
