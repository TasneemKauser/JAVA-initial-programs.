package com.company;

import java.util.Scanner;

public class TASOO_07_loops {
    public static void main(String[] args) {
        System.out.println("Methods of looping in java!");

//         WHILE LOOP
//        System.out.println("To print natural numbers from 100 to 200 using while loop!");
//        int a=100;
//        while (a<200){
//            a++;
//            System.out.println(a);

//            DO-WHILE LOOP
//            System.out.println("To print first n natural numbers using do-while loop!");
//            System.out.println("Enter the value of n");
//            Scanner S=new Scanner(System.in);
//            int n=S.nextInt();
//            int i=1;
//            do{
//                System.out.println(i);
//                i++;
//            }while (i<=n);

//            FOR LOOP
//        System.out.println("To print n odd number using for loop");
//        System.out.println("Enter the value of n");
//        Scanner S=new Scanner(System.in);
//        int n=S.nextInt();
//        for (int i=0;i<n;i++){                       //incrementing
//            System.out.println(2*i+1);
//        }

        System.out.println("To print n natural number in reverse using for loop");
        System.out.println("Enter the value of n");
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        for (int i=n;i!=0;i--){                          //decrementing
            System.out.println(i);
        }
        }
    }
