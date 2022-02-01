package com.company;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetDemo {
    /*its not syncronized
          its a highly performance java collection member
          faster than HashSet
          all the methods are implemented using bitwise arithmetic operations
         */

    enum Lang{
        JAVA,
        CSHARP,
        JAVASCRIPT,
        PYTHON,
        RUBY
    }
    public static void main(String[] args) {
        EnumSet<Lang> langs=EnumSet.allOf(Lang.class);
        System.out.println(langs);

        //empty enum set
        EnumSet<Lang> l=EnumSet.noneOf(Lang.class);
        System.out.println(l);

        //range(e1,e2)
        EnumSet<Lang> enumrange=EnumSet.range(Lang.JAVA,Lang.PYTHON);
        System.out.println(enumrange);

        //of method
        EnumSet<Lang> CSHARPEnum=EnumSet.of(Lang.CSHARP);
        System.out.println(CSHARPEnum);

        EnumSet<Lang> multipleEnum=EnumSet.of(Lang.CSHARP,Lang.RUBY);
        System.out.println(multipleEnum);

        //add and addAll methods
        EnumSet<Lang> lang1=EnumSet.allOf(Lang.class);
        EnumSet<Lang> lang2=EnumSet.noneOf(Lang.class);
        lang2.add(Lang.JAVASCRIPT);
        lang2.addAll(lang1);
        System.out.println(lang2);

        //iterating using iterator
        EnumSet<Lang> fullLang=EnumSet.allOf(Lang.class);
        Iterator<Lang> it=fullLang.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
