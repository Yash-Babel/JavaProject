package com.company;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        hm.put("India","New Delhi");
        hm.put("USA","Washington DC");
        hm.put("UK","London");
        System.out.println(hm.size());
        System.out.println(hm.get("USA"));
        System.out.println(hm.get("Germany"));
        hm.put("USA","Washington DC11");
        System.out.println(hm.get("USA"));          //gives the updated value of a key.
        hm.put(null,"Berlin");
        System.out.println(hm.get(null));
        hm.put("Russia",null);
        hm.put("France",null);
        System.out.println(hm);

        //Iterator
        Iterator<String> it=hm.keySet().iterator();
        while(it.hasNext()){
            String k=it.next();
            String v=hm.get(k);
            System.out.println("key="+k+" value="+v);
        }
        System.out.println("--------");

        //for each method
        hm.forEach((k,v)->System.out.println("key="+k+" value="+v));
    }
}
