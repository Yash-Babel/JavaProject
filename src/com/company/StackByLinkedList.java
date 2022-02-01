package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackByLinkedList {
    Node head;

    class Node{
        int value;
        Node next;
    }
    StackByLinkedList(){
        head=null;
    }
    //push : add value to the beginning of the list
    public void push(int value){
        Node extraHead=head;
        head=new Node();
        head.value=value;
        head.next=extraHead;
    }
    public int pop(){
        if(head==null){
            System.out.println("Stack is empty");
        }
        int value = head.value;
        head=head.next;
        return value;
    }
    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.value + " ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        StackByLinkedList sll=new StackByLinkedList();
        StackByLinkedList sll1=new StackByLinkedList();
        sll.push(10);
        sll.push(20);
        sll.push(30);
        sll.push(40);
        printList(sll.head);
        System.out.println("Element poped is from stack is "+sll.pop());
        System.out.println("Element poped is from stack is "+sll.pop());
        List<Integer> li=new ArrayList<>();
        li.add(0);
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        Stack st=new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.empty());
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.addAll(li);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
