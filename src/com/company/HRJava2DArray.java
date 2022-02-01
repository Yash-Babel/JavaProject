package com.company;

import java.util.Scanner;

public class HRJava2DArray {
    public static int SumOfHourGlass(int[][] array,int x,int y) {
        int sum = array[x][y] + array[x][y + 1] + array[x][y + 2] + array[x + 1][y + 1] + array[x + 2][y] + array[x + 2][y + 1] + array[x + 2][y + 2];
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr = new int[6][6];
        for(int i=0;i<6;i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int maxi=-63;
        for(int i=0;i<4;i++) {
            for (int j = 0; j < 4; j++) {
                if(SumOfHourGlass(arr,i,j)>maxi){
                    maxi=SumOfHourGlass(arr,i,j);
                }
            }
        }
        System.out.println(maxi);
    }
}
