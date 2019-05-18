package com.sda.collections;

import java.util.HashMap;
import java.util.Map;

public class JavaMaps {
    
    public static void main(String[] args) {
    
        Map<Integer, String> alfabet = new HashMap<Integer, String>();
        
        alfabet.put(1, "a"); //adaugare cu put, nu add
        alfabet.put(2, "b");
    
        System.out.println(alfabet.keySet());
        System.out.println(alfabet.values());
        System.out.println(alfabet.containsKey(2));
        System.out.println(alfabet.containsValue("a"));
        System.out.println(alfabet.get(2));
    }
}
