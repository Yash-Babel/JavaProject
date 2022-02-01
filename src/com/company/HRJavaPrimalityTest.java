package com.company;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class HRJavaPrimalityTest {
    public static void main(String[] args) {//throws IOException{
        Scanner sc=new Scanner(System.in);
        BigInteger d=sc.nextBigInteger();
        if(d.isProbablePrime(100)){                 //should read about this method. search "https://docs.oracle.com/javase/7/docs/api/java/math/BigInteger.html#isProbablePrime%28int%29"
                                                            //and find this method
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
//        try{
//            if(!sc.hasNextBigInteger()){
//                throw new IOException();
//            }
//            BigInteger d=sc.nextBigInteger();
//            BigInteger i=new BigInteger("2");
//            boolean bl=true;
//            BigInteger q=new BigInteger("1");
//            while(d.compareTo(i)==1) {
//                if (d.mod(i).equals(new BigInteger("0"))) {
//                    bl = false;
//                    break;
//                }
//                i=i.add(new BigInteger("1"));
//            }
//            if(bl){
//                System.out.println("prime");
//            }else{
//                System.out.println("not prime");
//            }
//        }
//        catch(IOException e){
//
//        }
    }
}
