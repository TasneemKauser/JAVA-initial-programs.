package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class CH_04_PS_QUESTIONS {
    public static void main(String[] args) {
//QUESTION :01
//        int a=10;
//        if (a==11)
//            System.out.println("I am 11");
//        else
//            System.out.println("I am not 11");

//QUESTION 02:
//        byte  m1,m2,m3;
//        Scanner S=new Scanner(System.in);
//        System.out.println("Enter your marks in physics");
//        m1=S.nextByte();
//        System.out.println("Enter your marks in chemistry");
//        m2=S.nextByte();
//        System.out.println("Enter your marks in maths");
//        m3=S.nextByte();
//        float byte_avg=(m1+m2+m3)/3.0f;
//        System.out.println("Your overall percentage is : " +byte_avg);
//        if(byte_avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("YOu have been promoted!");
//        }
//        else{
//                System.out.println("SORRY ! you have not been promoted!");
//            }
//QUESTION 03:
//        System.out.println("To print the days of weeks:");
//        System.out.println("Enter the number.");
//        Scanner S=new Scanner(System.in);
//        int days=S.nextInt();
//        switch (days){
//            case 1-> System.out.println("Monday");
//            case 2-> System.out.println("Tuesday");
//            case 3-> System.out.println("Wednesday");
//            case 4-> System.out.println("Thursday");
//            case 5-> System.out.println("Friday");
//            case 6-> System.out.println("Saturday");
//            case 7-> System.out.println("Sunday");
//            default -> System.out.println("Enter between 1-7");
//
//QUESTION 04:
//            System.out.println("To print the total tax depends on the income ");
//            Scanner S=new Scanner(System.in);
//            System.out.println("Enter the income in LPA:");
//            float income=S.nextFloat();
//            float tax=0;
//            if(income<2.5f){
//                tax+=0;
//                System.out.println("No tax added!");
//        }
//            else if (income>2.5f &&income<=5.0f){
//                tax+=0.05*(income - 2.5);
//            }
//            else if (income>5.0f &&income<=10.0f){
//                tax+=0.05*(income - 2.5);
//                tax+=0.2*(income - 2.5);
//            }
//            else if (income>10.0f){
//                tax+=0.05*(income - 2.5);
//                tax+=0.2*(income - 2.5);
//            }
//        System.out.println("The total tax included are: " +tax);
//

//QUESTION 05:
//        System.out.println("To check whether the number entered is leap year or not!");
//        System.out.println("Enter a year");
//        Scanner S=new Scanner(System.in);
//        int leapYear=S.nextInt();
//        if((leapYear%4==0) && (leapYear%100!=0) ||(leapYear%400==0) ){
//            System.out.println("Yes! the entered year is leap.");
//        }
//        else {
//            System.out.println("No! the entered year is not leap.");
//        }

//QUESTION :05
        System.out.println("To check the types of websites!");
        System.out.println("Enter your website name");
        Scanner S=new Scanner(System.in);
        String website=S.next();
        if(website.endsWith(".org")){
            System.out.println("This is an organizational website.");
        }
       else if(website.endsWith(".com")){
            System.out.println("This is an commercial website.");
        }
       else if(website.endsWith(".in")){
            System.out.println("This is an Indian website.");
        }
       else{
            System.out.println("Invalid!");
        }
        }
}
