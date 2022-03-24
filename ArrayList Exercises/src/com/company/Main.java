package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

	    // 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
        System.out.println("----- 1 -----");
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("red");
        arr1.add("blue");
        arr1.add("orange");
        arr1.add("pink");
        arr1.add("black");
        System.out.println(arr1);
        System.out.println("----- 2 -----");

        // 2. Write a Java program to iterate through all elements in an array list.
        for(String color:arr1) System.out.println(color);
        System.out.println("----- 3 -----");

        // 3. Write a Java program to insert an element into the array list at the first position.
        arr1.add(0, "green");
        System.out.println(arr1);
        System.out.println("----- 4 -----");

        //4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        String elem = arr1.get(1);  //get 2nd element
        System.out.println(elem);
        elem = arr1.get(3);
        System.out.println(elem);   //get 4th element
        System.out.println("----- 5 -----");

        // 5. Write a Java program to update specific array element by given element.
        arr1.set(2, "purple");
        System.out.println(arr1);
        System.out.println("----- 6 -----");

        // 6. Write a Java program to remove the third element from an array list.
        arr1.remove(2);
        System.out.println(arr1);
        System.out.println("----- 7 -----");

        // 7. Write a Java program to search an element in an array list.
        if(arr1.contains("red")) System.out.println("Array contains color red");
        else System.out.println("Array does not contain color red");
        System.out.println("----- 8 -----");

        // 8. Write a Java program to sort a given array list.
        Collections.sort(arr1);
        System.out.println(arr1);
        System.out.println("----- 9 -----");

        // 9. Write a Java program to copy one array list into another.
        ArrayList<String> arr2 = new ArrayList<String>();
        for(String color:arr1) arr2.add(color);
        System.out.println(arr2);
        System.out.println("----- 10 -----");

        // 10. Write a Java program to shuffle elements in an array list.
        Collections.shuffle(arr1);
        System.out.println(arr1);
        System.out.println("----- 11 -----");

        // 11. Write a Java program to reverse elements in an array list
        Collections.reverse(arr1);
        System.out.println(arr1);
        System.out.println("----- 12 -----");

        // 12. Write a Java program to extract a portion of a array list.
        ArrayList<String> arr1Sublist = new ArrayList<String>();
        arr1Sublist.addAll(arr1.subList(1,4));
        System.out.println(arr1Sublist);
        System.out.println("----- 13 -----");

        // 13. Write a Java program to compare two array lists.

        System.out.println("----- 14 -----");

        // 14. Write a Java program of swap two elements in an array list.
        System.out.println(arr1);
        Collections.swap(arr1, 2,4);
        System.out.println(arr1);
        System.out.println("----- 15 -----");

        // 15. Write a Java program to join two array lists.
        ArrayList<String> arr3 = new ArrayList<String>();
        //for(String e:arr1) arr3.add(e);
        //for (String e:arr2) arr3.add(e);
        arr3.addAll(arr1);
        arr3.addAll(arr2);
        System.out.println(arr3);
        System.out.println("----- 16 -----");

        // 16. Write a Java program to clone an array list to another array list.
        ArrayList<String> arr4 = (ArrayList<String>)arr3.clone();
        System.out.println(arr4);
        System.out.println("----- 17 -----");

        // 17. Write a Java program to empty an array list.
        arr4.removeAll(arr4);
        System.out.println(arr4);
        System.out.println("----- 18 -----");

        // 18. Write a Java program to test an array list is empty or not.
        System.out.println("Is arr4 empty? " + (arr4.isEmpty() ? "Yes" : "No"));
        System.out.println("Is arr3 empty? " + (arr3.isEmpty() ? "Yes" : "No"));
        System.out.println("----- 19 -----");

        // 19. Write a Java program to trim the capacity of an array list the current list size.
        arr3.trimToSize();
        System.out.println(arr3);
        System.out.println("----- 20 -----");

        // 20. Write a Java program to increase the size of an array list.
        arr3.ensureCapacity(15);
        System.out.println(arr3);
        System.out.println("----- 21 -----");

        // 21. Write a Java program to replace the second element of a ArrayList with the specified element.
        arr3.set(3, "newColor");
        System.out.println(arr3);
        System.out.println("----- 22 -----");

        // 22. Write a Java program to print all the elements of a ArrayList using the position of the elements.
        for(int i = 0 ; i < arr3.size(); i++) System.out.println(arr3.get(i));

    }
}
