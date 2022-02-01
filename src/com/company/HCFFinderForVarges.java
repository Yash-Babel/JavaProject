package com.company;

public class HCFFinderForVarges {

    public static int HCF(int n,int[] arr){ //n is the number of elements in arr.arr contains the elements whose HCF has to be found.
        for(int i=arr[0];i>=2;i--){
            int a=0;
            for(int j=0;j<n;j++){
                if(arr[j]%i!=0) {
                    break;
                }
                a++;
            }
            if(a==n){
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {

    }
}
