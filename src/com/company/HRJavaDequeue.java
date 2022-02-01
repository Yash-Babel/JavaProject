package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

// METHOD 1 takes more because of which some testcases failed.
public class HRJavaDequeue {
    //    public static int uniqueIntegerCount(Deque deq){
//        HashSet<Integer> hs=new HashSet<>(deq);
//        return hs.size();
//    }
    public static void main(String[] args) {
        //METHOD 1
//        Scanner sc=new Scanner(System.in);
//        int maxi=0;
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//        Deque<Integer>dq=new ArrayDeque<>(m);
//        for(int i=0;i<m;i++){
//            dq.add(sc.nextInt());
//        }
//        int a=uniqueIntegerCount(dq);
//        if(maxi<a){
//            maxi=a;
//        }
//        for(int j=m;j<n;j++){
//            dq.poll();
//            dq.add(sc.nextInt());
//            int b=uniqueIntegerCount(dq);
//            if(maxi<b){
//                maxi=b;
//            }
//        }
//        System.out.println(maxi);


        //METHOD 2
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();

            deque.add(input);
            set.add(input);

            if (deque.size() == m) {
                if (set.size() > max) max = set.size();
                int first = deque.remove();
                if (!deque.contains(first)) set.remove(first);
            }
        }

        System.out.println(max);
    }
}
