package com.company;

import java.util.Scanner;

public class QUESTION_01 {
    public static void main(String[] args) {
        System.out.println("To find out the percentage of a given student's marks in board examination.");
        System.out.print("Grand Total marks of an examination.");
        float Grand_total= 500;
        System.out.println(Grand_total);

        Scanner S=new Scanner(System.in);
        System.out.print("Marks of sub1 out of 100 is :");
        float A= S.nextFloat();

        System.out.print("Marks of sub2 out of 100 is :");
        float B= S.nextFloat();

        System.out.print("Marks of sub3 out of 100 is :");
        float C= S.nextFloat();

        System.out.print("Marks of sub4 out of 100 is :");
        float D= S.nextFloat();

        System.out.print("Marks of sub5 out of 100 is :");
        float E= S.nextFloat();

        float sum=A+B+C+D+E;
        System.out.print("Total marks obtained:");
        System.out.println(sum);
        float percentage=(sum/Grand_total)*100;
        System.out.print("Percentage is:");
        System.out.println(percentage);





    }
}
