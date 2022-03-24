package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        HashSet<String> hSet = new HashSet<String>();
        hSet.add("cat");
        hSet.add("dog");
        hSet.add("bird");
        hSet.add("cow");
        hSet.add("pig");
        System.out.println(hSet);

        // 2. Write a Java program to iterate through all elements in a hash list.
        System.out.println("----- 2 -----");
        Iterator<String> it = hSet.iterator();
        for(int i=0; i<hSet.size(); i++) System.out.println(it.next());

        // 3. Write a Java program to get the number of elements in a hash set.
        System.out.println("----- 3 -----");
        System.out.println("Number of elements: " + hSet.size());

        // 5. Write a Java program to test a hash set is empty or not.
        System.out.println("----- 5 -----");
        HashSet<String> hSet2 = new HashSet<String>();
        System.out.println("Is hSet empty? " + (hSet.isEmpty() ? "Yes" : "No"));
        System.out.println("Is hSet2 empty? " + (hSet2.isEmpty() ? "Yes" : "No"));

        // 6. Write a Java program to clone a hash set to another hash set.
        System.out.println("----- 6 -----");
        HashSet<String> hSet3 = (HashSet<String>)hSet.clone();
        System.out.println(hSet3);

        // 9. Write a Java program to convert a hash set to a List/ArrayList.
        System.out.println("----- 9 -----");
        ArrayList<String> arr = new ArrayList<String>(hSet3);
        System.out.println(hSet3);

    }
}
