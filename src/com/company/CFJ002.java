package com.company;

import java.util.Scanner;

public class CFJ002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer = "";
        int len = str.length();
        boolean slash = false;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (!slash) {
                stringBuilder.append(str.charAt(i));
            }
            if (str.charAt(i) == '/') {
                slash = true;
            } else {
                if (slash) {
                    stringBuilder.append(str.charAt(i));
                }
                slash = false;
            }
        }
        answer = stringBuilder.toString();
        if(answer.length() > 1 && answer.charAt(answer.length() - 1) == '/'){
            answer = answer.substring(0, answer.length() -1);
        }
        System.out.println(answer);
    }
}
