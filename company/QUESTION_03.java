package com.company;

import java.util.Scanner;

public class QUESTION_03 {
    public static void main(String[] args) {
        System.out.println("To find the value of expression by using increment ");
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the value! ");
        float y=S.nextFloat();
        float exp=++y*8;
        System.out.println("Expression is :- "+exp);
        char ch='a';
        System.out.println(++ch);
    }
}
