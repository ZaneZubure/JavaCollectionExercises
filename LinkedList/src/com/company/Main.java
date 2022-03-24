package com.company;

import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // 1. Write a Java program to append the specified element to the end of a linked list.
        System.out.println("----- 1 -----");
        LinkedList aa = new LinkedList();
        aa.add("one");
        aa.add("2");
        aa.add("three");
        aa.add(4);
        aa.add("five");
        System.out.println(aa);

        // 15. Write a Java program of swap two elements in a linked list.
        System.out.println("----- 15 -----");
        Collections.swap(aa, 0,4);
        System.out.println(aa);

        // 19. Write a Java program to remove and return the first element of a linked list.
        System.out.println("----- 19 -----");
        System.out.println(aa.remove()); //removes and retrieves the first element
        System.out.println(aa); //the list without the first element

        // 18. Write a Java program to compare two linked lists.
        System.out.println("----- 18 -----");
        LinkedList bb = (LinkedList)aa.clone() ;
        System.out.println(bb);

        // 21. Write a Java program to retrieve but does not remove, the last element of a linked list.
        System.out.println("----- 20 -----");
        System.out.println(aa.getLast()); //does not remove element
        System.out.println(aa);

    }
}
