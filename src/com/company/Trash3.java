package com.company;
// Working program using Reader Class
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Trash3 {
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(sc.readLine());
        while(t-->0) {
            int n=Integer.parseInt(sc.readLine());
            int turnNumber=0;
            while(n>1) {
                for (int i = n - 1; i > 0; i--) {
                    if (isPrimeOr1(i)) {
                        n -= i;
                        turnNumber++;
                        break;
                    }
                }
            }
            if(turnNumber%2==0){
                System.out.println("ALICE");
            }else{
                System.out.println("BOB");
            }
        }
    }
    public static boolean isPrimeOr1(int a){
        if(a == 2 || a == 1){
            return true;
        }
        for(int i=2;i<Math.sqrt(a)+1;i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
}



