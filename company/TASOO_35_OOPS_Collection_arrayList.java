package com.company;
import java.util.*;
public class TASOO_35_OOPS_Collection_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        l2.add(34);
        l2.add(49);
        l2.add(89);
        l1.add(3);
        l1.add(9);
        l1.add(4);
        l1.add(3);

        l1.add(0,5);
        l1.addAll(0,l2);
        System.out.println(l1.contains(6));
        l1.set(3,25);

        System.out.println(l1.indexOf(3));
        System.out.println(l1.get(3));
        System.out.println(l1.indexOf(0));
        System.out.println(l1.lastIndexOf(3));
        //l1.clear();               to delete all the elements
        for (int i =0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");

        }

    }
}
