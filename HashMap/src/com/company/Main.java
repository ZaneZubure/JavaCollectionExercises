package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Integer> animal = new HashMap<String, Integer>();
        animal.put("cat", 10);
        animal.put("dog", 2);
        animal.put("cow", 5);
        animal.put("bird", 8);
        System.out.println(animal);

        // 1. Write a Java program to associate the specified value with the specified key in a HashMap.
        System.out.println("----- 1 -----");
        animal.put("cow", 1);
        System.out.println(animal);
        System.out.println("Another way how to print put: ");
        for(Map.Entry a:animal.entrySet()) System.out.println(a.getKey() + " " + a.getValue());

        // 3. Write a Java program to copy all of the mappings from the specified map to another map.
        System.out.println("----- 3 -----");
        HashMap<String, Integer> animal2 = (HashMap<String, Integer>)animal.clone();
        System.out.println(animal2);

        // 4. Write a Java program to remove all of the mappings from a map.
        System.out.println("----- 4 -----");
        System.out.println("animal2 original: " + animal2);
        animal2.clear();
        System.out.println("animal2 now: " + animal2);

        // 5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
        System.out.println("----- 5 -----");
        System.out.println("Is animal empty? " + (animal.isEmpty() ? "Yes" : "No"));
        System.out.println("Is animal2 empty? " + (animal2.isEmpty() ? "Yes" : "No"));

        // 11. Write a Java program to get a set view of the keys contained in this map
        System.out.println("----- 11 -----");
        for(Map.Entry a:animal.entrySet()) System.out.println(a.getKey());

        System.out.println(animal.keySet());

        // 12. Write a Java program to get a collection view of the values contained in this map.
        System.out.println("----- 12 -----");
        System.out.println(animal.values());


    }
}
