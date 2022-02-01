package com.company;

import java.lang.reflect.Method;

class Printer<T1> {
    public void printArray(T1[] t1){
        for(T1 ele:t1){
            System.out.println(ele);
        }
    }
}
public class HRJavaGenerics {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
    }
}
