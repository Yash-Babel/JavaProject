package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class HRPatternSyntaxChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0) {
            try {
                String pattern = in.nextLine();
                java.util.regex.Pattern pat = Pattern.compile(pattern);
                System.out.println("Valid");
                testCases--;
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
    }
}
