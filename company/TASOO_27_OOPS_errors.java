package com.company;

import java.util.Scanner;

public class TASOO_27_OOPS_errors {
    public static void main(String[] args) {

//        SYNTAX ERROR!!!
//        int a=12                              syntax error
        int b=10;
//        c=2;                                  syntax error
//        System.out.println(a+b);              syntax error

//        LOGICAL ERROR!!!
        System.out.println(2);
        for (int i=0;i<5;i++){
            System.out.println(2*i+1);            //logical error
        }

        /* RUNTIME ERROR!!! */
        int k;
        Scanner c=new Scanner(System.in);
        k=c.nextInt();
        System.out.println("Integer part of the 1000 divided by k is "+ 1000/k);


    }
}
