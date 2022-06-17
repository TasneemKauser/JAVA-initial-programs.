package com.company;

import java.util.ArrayDeque;

public class TASOO_37_OOPS_Collection_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1=new ArrayDeque<>();
        ad1.add(2);
        ad1.add(90);
        ad1.add(61);
        ad1.addFirst(9);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
