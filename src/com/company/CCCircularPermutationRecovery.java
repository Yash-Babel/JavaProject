package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CCCircularPermutationRecovery {            // Unsolved, Problem of January Lunchtime
    public static void main(String[] args) throws IOException {
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(sc.readLine());
        while(t-->0) {
            String[] str = sc.readLine().split(" ");
            int n=Integer.parseInt(str[0]);
            int k=Integer.parseInt(str[1]);
            String[] str1= sc.readLine().split(" ");
            int[] Ai=new int[n];
            for(int i=0;i<n;i++){
                Ai[i]=Integer.parseInt(str1[i]);
            }
            ArrayList<ArrayList<Integer>> possibleValuesOfPi=new ArrayList<>();
            for(int i=0;i<n;i++){
                ArrayList<Integer> arl=new ArrayList<>();
                for(int j=Ai[i]+1;j<n-k+Ai[i]+1;j++){
                    arl.add(j);
                }
                possibleValuesOfPi.add(arl);
            }
            ArrayList<ArrayList<Integer>> preAnswerOfPi=new ArrayList<>();
            for(int i=0;i<n;i++){
                ArrayList<Integer> preAnswer = new ArrayList<>();
                for(int h=0;h<possibleValuesOfPi.get(i).size();h++){
                    int workingVariable=possibleValuesOfPi.get(i).get(h);
                    int count=0;
                    for(int j=0;j<k;j++){
                        if(possibleValuesOfPi.get(((i+j)%n)).get(0)<workingVariable){
                            count++;
                        }
                    }
                    if(count<Ai[i]){
                        continue;
                    }
                    preAnswer.add(workingVariable);
                }
                preAnswerOfPi.add(preAnswer);
            }
            for(ArrayList<Integer> arele:preAnswerOfPi){
                System.out.println(arele);
            }

        }
    }
}
