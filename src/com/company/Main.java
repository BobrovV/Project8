package com.company;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Main {

    //static ArrayList<String> list33 = new ArrayList<>(Arrays.asList("A","B","C"));
    static ArrayList<String> list = new ArrayList<String>();
        static {
        list.add("B");
        list.add("X");
        list.add("C");
        list.add("A");
        list.add("G");
        }

    public static void main(String[] args) {
/*        LinkedList<String> al = new LinkedList<String>();

        System.out.println(al.size());

        al.add("C");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.addFirst("A");
        al.addLast("Z");
        al.add("123");
        al.add(1, "A2");

        System.out.println(al.size());

        al.remove("F");
        al.remove(2);
        System.out.println(al.size());
        System.out.println(al);*/

        //TreeSet<String> strings = new TreeSet<String>((a, b) -> b.compareTo(a));
/*        Comparator<String> s = (a, b) -> b.compareTo(a);
        TreeSet<String> strings = new TreeSet<>(s);
        strings.add("B");
        strings.add("X");
        strings.add("C");
        strings.add("A");
        strings.add("G");

        System.out.println(strings);*/

        System.out.println(list);
    }
}
