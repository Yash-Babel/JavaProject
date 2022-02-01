package com.company;

public class StackByArray {
    int size;
    int arr[];
    int top;

    StackByArray(int size){
        this.size=size;
        this.arr=new int[size];
        this.top=-1;
    }
    //time complexity : O(1)
    public void push(int element){
        if(!isFull()){
            top++;
            arr[top]=element;
            System.out.println("pushed element : "+element);
        } else{
            System.out.println("Stack is full now");
        }
    }
    public int pop(){
        if(!isEmpty()){
            top--;
            System.out.println("poped element : "+arr[top+1]);
            return arr[top+1];
        } else{
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public int peak(){
        if(!this.isEmpty()){
            return arr[top];
        } else{
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return (size-1==top);
    }


    public static void main(String[] args) {
        StackByArray sk=new StackByArray(10);
        sk.pop();
        System.out.println("-----------");
        sk.push(100);
        sk.push(200);
        sk.push(300);
        sk.push(400);
        System.out.println("-----------");
        System.out.println(sk.peak());
        sk.pop();
        sk.pop();
        sk.pop();
        System.out.println();
        System.out.println(sk.isEmpty());
        System.out.println(sk.isFull());

    }
}
