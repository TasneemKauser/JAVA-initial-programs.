package com.company;

import java.util.Scanner;

public class CH_02_PS_QUESTIONS {
    public static void main(String[] args) {
//QUESTION 01:- 01 To find out the result of following expression.
//        System.out.println("Find the result of given expressions.");
//        float a=7/4*9/2;
//        float b=7/4.0f*9/2.0f;
//        System.out.println(a);
//        System.out.println(b);

//QUESTION 02:- W.A.P to encrypt a grade by adding 8 to it . Decrypt it to show the correct grade.
//        System.out.println("For encrypting");
//        char grade='A';
//        grade=(char)(grade+8);
//        System.out.println(grade);
//        System.out.println("For Decrypting:");
//        grade=(char)(grade-8);
//        System.out.println(grade);

//QUESTION 03:- To check whether the given number is greater than the user entered number or not!
//        double num=12.3432;
//        System.out.println("Enter the number :");
//        Scanner S= new Scanner(System.in);
//        double a=S.nextDouble();
//        System.out.println(a>num);

//        QUESTION 04:- Find the value of given expression:
        System.out.println("Find the value :x*49/x+35/x");
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the value ox 'x' ");
        double x=S.nextDouble();
        double a= x*49/x+35/x;
        System.out.println("Result is "+a);
    }
}
