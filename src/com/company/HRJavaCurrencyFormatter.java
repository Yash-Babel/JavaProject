package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class HRJavaCurrencyFormatter {
    static String toUSSystem(BigDecimal b){
        String str = b.toPlainString();
        String output = "";
        int l = str.length();
        int a=0;
        int rem;
        for (int i = 0; i < l; i++) {
            if (str.charAt(i) == '.') {
                a = i;
                break;
            }
        }
        rem=a%3;
        for(int i=0;i<a+3;i++) {
            if(str.charAt(i)!='.'&&i!=0) {
                if(i%3==rem){
                    output+=',';
                }
            }
            output+=str.charAt(i);
        }
        return output;
    }
    static String toIndianSystem(BigDecimal b){
        String str = b.toPlainString();
        String output = "";
        int l = str.length();
        int a=0;
        int rem;
        for (int i = 0; i < l; i++) {
            if (str.charAt(i) == '.') {
                a = i;
                break;
            }
        }
        rem=(a-3)%2;
        for(int i=0;i<a+3;i++){
            if(i%2==rem&&i!=0&&i<=a-3){
                output+=',';
            }
            output+=str.charAt(i);
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal d = sc.nextBigDecimal();

        String outputI=" ";
        int b=0;
        String inter=toUSSystem(d);
        String india=toIndianSystem(d);
        System.out.println("US: $"+inter);
        System.out.println("India: Rs."+india);
        System.out.println("China: ￥"+inter);
        System.out.println("France: "+inter+" €");

        //METHOD 2
        //        /* Read input */
//        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();
//
//        /* Create custom Locale for India.
//          I used the "IANA Language Subtag Registry" to find India's country code */
//        Locale indiaLocale = new Locale("en", "IN");
//
//        /* Create NumberFormats using Locales */
//        NumberFormat us     = NumberFormat.getCurrencyInstance(Locale.US);
//        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
//        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
//        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
//
//        /* Print output */
//        System.out.println("US: "     + us.format(payment));
//        System.out.println("India: "  + india.format(payment));
//        System.out.println("China: "  + china.format(payment));
//        System.out.println("France: " + france.format(payment));
    }
}
