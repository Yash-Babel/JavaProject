package com.company;

import java.util.Scanner;
import java.util.Stack;

public class HRJavaStack {
    public static void main(String[] args) {
        Stack<Character> sk=new Stack<>();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                sk.push(ch);
            }else if(ch==')' && !sk.isEmpty() && sk.peek()=='('){
                sk.pop();
            }else if(ch=='}' && !sk.isEmpty() && sk.peek()=='{'){
                sk.pop();
            }else if(ch==']' && !sk.isEmpty() && sk.peek()=='['){
                sk.pop();
            }else if(ch==')' || ch=='}' || ch==']'){
                sk.push(ch);
            }
            System.out.println(sk.isEmpty());
        }
    }
}
