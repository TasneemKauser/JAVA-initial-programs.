package com.company;

import java.util.Scanner;

public class TASOO_31_OOPS_nested_TryCatch {
    public static void main(String[] args) {
        int[] marks = new int[4];
        marks[0] = 12;
        marks[1] = 5;
        marks[2] = 52;
        marks[3] = 10;
        Scanner sc = new Scanner(System.in);

        boolean flag = true;
        while (flag) {
            System.out.println("Enter the array index");
            int ind = sc.nextInt();
            try {
                System.out.println("Tutorial for nested try catch");
                try {
                    System.out.println(marks[ind]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");
                    System.out.println("Exception in level 2");
                }
            } catch (Exception e) {
                System.out.println("Some Exception occurred");
            }
        }
        System.out.println("Thanks for using this program!");
    }
}