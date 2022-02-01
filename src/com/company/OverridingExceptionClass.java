package com.company;

class MyException extends Exception{
    public String toString(){
        return super.toString()+"  to,,string";
    }
    public String getMessage(){
        return super.getMessage()+"  get,,message";
    }
}
public class OverridingExceptionClass {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            throw new MyException();
        }catch(Exception e){
            System.out.println("1   "+e.toString());
            System.out.println("2   "+e.getMessage());
            e.printStackTrace();                        //printed on the last line.
            System.out.println("4   "+e);
            System.out.println("Finished.");
        }
        System.out.println("Yes Finished.");
    }
}
