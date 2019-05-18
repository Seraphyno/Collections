package com.sda.collections;

import java.util.*;

import com.google.common.collect.ImmutableList;

public class JavaCollections {
    
    static List<String> stringList = new LinkedList<String>();
    static Set<String> stringSet = new HashSet<String>();
    
    public static void main(String[] args) {
        String elem1 = "a";
        String elem2 = "b";
        String elem3 = "c";
        String elem4 = "a";
        
        stringList.add(elem1);
        stringList.add(elem2);
        stringList.add(elem3);
        stringList.add(elem4);
        printCollection(stringList);
    
        System.out.println("===================");
        stringList.remove(elem4);
        stringList.remove(0);
        printCollection(stringList);
    
        System.out.println(stringList.size());
        System.out.println(stringList.isEmpty());
        System.out.println(stringList.contains(elem2));
        System.out.println(stringList.get(1));
        System.out.println(stringList.indexOf(elem2)); //-1 daca nu gaseste element
    
        System.out.println("===================");
        
        stringSet.add(elem1);
        stringSet.add(elem2);
        stringSet.add(elem3);
        stringSet.add(elem4);
        printCollection(stringSet);
        //metode similare cu listele
    
        int dimensiune = stringList.size(); //nr de elemente de care am nevoie
        String[] array = new String[dimensiune]; //creez un array cu nr fix de elemente
        array = stringList.toArray(array);
    
//        String[] strings = stringList.toArray(new String[stringList.size()]);
    
    
        ImmutableList<String> list = ImmutableList.of(elem1);
    }

    private static void printCollection(Collection<String> collection) {
        for (String elem : collection) {
            System.out.println(elem);
        }
    }

}
