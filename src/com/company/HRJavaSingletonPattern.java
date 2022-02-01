package com.company;

import java.util.Scanner;

class Singleton{
    public static String str;
    private Singleton(){

    }

    static String getSingleInstance(){
        return str;
    }
}

public class HRJavaSingletonPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Singleton.str=sc.nextLine();
        System.out.println("Hello I am a singleton! Let me say "+Singleton.getSingleInstance()+" to you");
    }
}
