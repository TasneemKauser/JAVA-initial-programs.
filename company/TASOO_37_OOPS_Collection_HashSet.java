package com.company;

import java.util.HashSet;

public class TASOO_37_OOPS_Collection_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> MyHashSet =new HashSet<>();
        HashSet<Integer> MyHashSet1 =new HashSet<>(30,0.5f);
        MyHashSet.add(34);
        MyHashSet.add(13);
        MyHashSet1.add(03);
        System.out.println(MyHashSet);
        System.out.println(MyHashSet1);
    }
}
