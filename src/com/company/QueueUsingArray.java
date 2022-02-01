package com.company;

public class QueueUsingArray {
    int capacity;
    int queueArr[];
    int front;
    int rear;
    int currentSize;

    public QueueUsingArray(int sizeOfQueue){
        capacity=sizeOfQueue;
        front=0;
        rear=-1;
        queueArr =new int[capacity];
    }
    public void enqueue(int data){
        if(this.isFull()){
            System.out.println("Queue is already full.");
        }else {
            rear++;
            if (rear == capacity) {
                rear = 0;
            }
            queueArr[rear] = data;
            currentSize++;
            System.out.println(data + " added to the queue.");
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Your is empty.");
        }else{
            front++;
            if(front==capacity){
                System.out.println(queueArr[front-1]+" removed from the queue");
                front=0;
            }else{
                System.out.println(queueArr[front-1]+" removed from the queue");
            }
            currentSize--;
        }
    }
    public boolean isFull(){
        return (currentSize==capacity);
    }
    public boolean isEmpty(){
        return (currentSize==0);
    }

    public static void main(String[] args) {
        QueueUsingArray obj=new QueueUsingArray(5);
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.dequeue();
        obj.enqueue(60);
        obj.dequeue();


    }
}
