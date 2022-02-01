package com.company;

import java.util.Scanner;

public class HRValidUsernameRegularExpression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();             // OR USE        sc.useDelimiter("\n");
        for(int j=0;j<n;j++){
            boolean bl=true;
            String str=sc.next();
            int len=str.length();
            char ch=' ';
            if(!(len>=8&&len<=30)) {
                bl = false;
            }else {
                for (int i = 0; i < len; i++) {
                    ch = str.charAt(i);
                    if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9') || (ch == '_'))) {
                        bl = false;
                        break;
                    }
                }
                if (((str.charAt(0) >= '1' && str.charAt(0) <= '9') || (str.charAt(0) == '_'))) {
                    bl = false;
                }
            }
            if(bl){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");
            }
        }


    }
}

