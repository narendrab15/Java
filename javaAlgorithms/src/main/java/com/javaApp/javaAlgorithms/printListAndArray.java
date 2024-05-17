package com.javaApp.javaAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class printListAndArray {

    public static void main(String[] args)
    {

        // Arrays
        String[] gfg = { "G", "E", "E", "K", "S" };

        // Trying printing the above array
        System.out.print(gfg);

        // New Line
        System.out.println();

        // Collection
        // Let us arbitarly create an empty ArrayList
        // of string type
        List<String> al = new ArrayList<String>();

        // Adding elements to above List
        // using add() method
        al.add("g");
        al.add("e");
        al.add("e");
        al.add("k");
        al.add("s");

        // Printing all elements of Collection (ArrayList)
        System.out.println(al);
    }
}
