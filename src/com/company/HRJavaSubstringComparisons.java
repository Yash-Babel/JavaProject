package com.company;

import java.util.Scanner;

public class HRJavaSubstringComparisons {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int k = sc.nextInt();
        String mini = st.substring(0, k);
        for (int i = 1; i <= st.length() - k; i++) {
            String st1 = st.substring(i, k + i);
            for (int j = 0; j < k; j++) {
                if (mini.charAt(j) > st1.charAt(j)) {
                    mini = st1;
                    break;
                } else if (mini.charAt(j) == st1.charAt(j))
                    continue;
                else
                    break;
            }
        }
        System.out.println(mini);

        String maxi = st.substring(0, k);
        for (int i = 1; i <= st.length() - k; i++) {
            String st2 = st.substring(i, k + i);
            for (int j = 0; j < k; j++) {
                if (maxi.charAt(j) < st2.charAt(j)) {
                    maxi = st2;
                    break;
                } else if (maxi.charAt(j) == st2.charAt(j))
                    continue;
                else
                    break;
            }
        }
        System.out.println(maxi);
    }
}