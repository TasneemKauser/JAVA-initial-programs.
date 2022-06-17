package com.company;

import java.util.Scanner;

public class TASOO_30_OOPS_specific_exceptions {
    public static void main(String[] args) {
        int [] marks = new int[4];
        marks [0]=12;
        marks [1]=5;
        marks [2]=52;
        marks [3]=10;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind= sc.nextInt();

        System.out.println("Enter the number you want to divide with");
        int num= sc.nextInt();
        try {
            System.out.println("The value of array index is : "+marks[ind]);
            System.out.println("The value of array value/number is : "+marks[ind/num]);
        }

        catch (ArithmeticException e){
            System.out.println("Arithmetic exception occurred!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bond occurred exception occurred!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception occurred!");
            System.out.println(e);
        }
    }
}