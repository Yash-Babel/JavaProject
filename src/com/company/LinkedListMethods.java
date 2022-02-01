package com.company;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {
        /*  LL is default class in java
            it can be used as List,Stack,Queue
            it allows null entry
            dynamic collection
            hence insertion and deletion can be easily implemented
            contains duplicate elements
            it is not syncronized(not thread safe)
            in LL,manipulation is faster than ArrayList because we don't need any shifting
        */
        LinkedList<String> names=new LinkedList<>();
        names.add("Tom");
        names.add("Yash");
        names.add("Robby");
        names.add("Lisa");
        System.out.println(names.size());
        System.out.println(names);
        System.out.println(names.get(1));
        Iterator it=names.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        names.add(3,"Steve");          //shifts all elements after that index
        System.out.println(names);

        LinkedList<String> users=new LinkedList<String>();
        users.add("Peter");
        users.add("Trump");
        names.addAll(users);
        System.out.println(names);

        names.addFirst("Kamala");
        names.addLast("Shivam");
        System.out.println(names);
        names.remove(2);
        System.out.println(names);
        names.removeAll(users);
        names.removeFirst();
        System.out.println(names);
        names.clear();
        System.out.println(names);

        LinkedList<String> lang=new LinkedList<>();
        lang.add("Java");
        lang.add("Python");
        lang.add("Ruby");
        lang.add("JavaScript");

        //reverse the linkedlist
        Iterator<String> itr=lang.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(String e:lang){
            System.out.println(e);
        }

        //sorting of ll
        Collections.sort(lang);
        System.out.println(lang);
    }
}
