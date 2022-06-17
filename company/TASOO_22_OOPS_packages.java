package com.company;

//import java.util.Scanner;
//import java.util.*;

import java.util.Scanner;

public class TASOO_22_OOPS_packages {
    public static void main(String[] args) {
        int e=0,o=0;
        System.out.println("Enter the number of elements in an array!");
        Scanner oe=new Scanner(System.in);
        int n= oe.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements in an array!");
        for (int i=0;i<n;i++){
           a[i]=oe.nextInt();
        }
        for (int i=0;i<n;i++){
            if (a[i]%2==0){
                e=e+a[i];
            }
            else {
                o=o+a[i];
            }
        }
        System.out.println(e);
        System.out.println(o);
    }
}

