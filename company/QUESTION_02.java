package com.company;

import java.util.Scanner;

public class QUESTION_02 {
    public static void main(String[] args) {
        System.out.println("To write some expressions .");
//        EXPRESSION 1:
        System.out.print("Enter then value of x and y ");
        Scanner S=new Scanner(System.in);
        float x=S.nextFloat();float y=S.nextFloat();
        float ex1=(x-y)/2;
        System.out.println(ex1);

//        EXPRESSION 2:
        System.out.print("Enter then value of a,b and c ");
        float a=S.nextFloat();float b=S.nextFloat();float c=S.nextFloat();
        float ex2=(b*b-4*a*c)/(2*a);
        System.out.println(ex2);

//        EXPRESSION 3:
        System.out.print("Enter then value of v and u ");
        float v=S.nextFloat();float u=S.nextFloat();
        float ex3=(v*v-u*u)/2;
        System.out.println(ex3);

//        EXPRESSION 4:
        System.out.print("Enter then value of d ");
        float d=S.nextFloat();float ex4=a*b-d;
        System.out.println(ex4);

    }
}
