package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<String>();
        hs.add("A");
        hs.add("testing");
        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Alpha");
        hs.add(null);
        System.out.println(hs);
        System.out.println(hs.contains("testing"));
        System.out.println("--------");
        for(String e:hs){
            System.out.println(e);
        }
        System.out.println("--------");
        Iterator it=hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("--------");
        hs.remove("Beta");
        System.out.println(hs);
        hs.remove("Bet"); // Does not give error.
        System.out.println(hs);
        System.out.println("--------");
        Set<Integer> first = new HashSet<Integer>();
        first.addAll(Arrays.asList(0,1,2,3,4,5,6));

        Set<Integer> second = new HashSet<Integer>();
        second.addAll(Arrays.asList(2,3,4,5,6,7,8));

        //get the union
        Set<Integer> union=new HashSet<>(first);
        union.addAll(second);
        System.out.println(union);
        System.out.println("--------");

        //get the intersection
        Set<Integer> inter=new HashSet<>(first);
        inter.retainAll(second);
        System.out.println(inter);
        System.out.println("--------");

        //getting the extra elements in first then in second
        Set<Integer> diff=new HashSet<>(first);
        diff.removeAll(second);
        System.out.println(diff);


    }
}
