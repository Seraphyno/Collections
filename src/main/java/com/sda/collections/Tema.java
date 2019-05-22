package com.sda.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Se da ca input un text salvat ca String
 * Vreau sa aflu ce cuvinte sunt folosite
 * si de cate ori
 */
public class Tema {

    public static void main(String[] args) {
        String[] cuvinte = cleanUpText().split(" ");
        Map<String, Integer> dictionar = new HashMap<String, Integer>();

        System.out.println(cuvinte.length);

        for (String cuvant : cuvinte) {
            if (dictionar.containsKey(cuvant)) {
                Integer occurences = dictionar.get(cuvant);
                dictionar.put(cuvant, ++occurences);
            } else {
                dictionar.put(cuvant, 1);
            }
        }

        printMap(dictionar);
    }

    private static void printMap(Map<String, Integer> dictionar) {
        for (String key : dictionar.keySet()) {
            System.out.println("[" + key + ", " + dictionar.get(key) + "]");
        }
    }

    private static String cleanUpText() {
        return TextTema.TEXT.toLowerCase()
                .replace(",", "")
                .replace("?", " ")
                .replace(".", " ")
                .replace("  ", " ")
                .replace("\\\"", "")
                .replace("(", "")
                .replace(")", "")
                .trim();
    }
}
