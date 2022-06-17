package com.company;

import java.util.Scanner;

public class CH_07_PS_QUESTIONS {
    static void mul(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d x %d = %d\n",n,i,n*i);
        }
    }
    static int sum(int n){
        if (n == 1) {
            return 1;
        }
        else {
            return n+sum(n-1);
            }
        }
        static int fib(int n) {
            if (n == 1 || n == 2) {
                return n - 1;
            } else {
                return fib(n - 1) + fib(n - 2);
            }
        }
        static void pattern1(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }
    static void pattern2(int n) {
        for (int i = n; i >0; i--) {
            for (int j = 0; j <i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    static  float avg(int ...arr){
        float sum=0;
        for(int a:arr){
            sum +=a;
        }
        float average=(sum)/ arr.length;
        return average;

    }
    static void pattern1_REC(int n) {
        if (n>0){
            pattern1_REC(n-1);
            for (int i=0;i<n;i++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
    static void pattern2_REC(int n) {
        if (n<1){
            System.out.print("* ");
            for (int i=n;i>=0;i--){
                pattern1_REC(n-1);
            }
            System.out.println(" ");
        }
    }
    static double tem(double C){
//        float C;
        double F;
        F= C * 9/5+ 32;
        return F;
    }
    static int sum_iterative(int n){
        if (n == 0) {
            return  -1;
        }
        else {
            int sum = (n * (n + 1)) / 2;
            return sum;
        }
    }


//QUESTION 01: To print multiplication table using java methods.

//        public static void main(String[] args) {
//        mul(5);
//        System.out.println("Multiplication of the given number is:");
//       }


//QUESTION 02: To print sum of natural numbers using recursion.
//    public static void main(String[] args) {
//        Scanner S=new Scanner(System.in);
//        int a= sum(3);
//        System.out.println(a);


//QUESTION 03: To print nth term of fibonacci series.

    public static void main(String[] args) {
        System.out.println(fib(6));
    }


//QUESTION 04: Print the pattern of:
//    public static void main(String[] args) {
//        pattern1(4);
//    }


//QUESTION 05: Print the pattern of:
//public static void main(String[] args) {
//    pattern2(4);
//}

//QUESTION 06: To find the average of given numbers using arguments.
//public static void main(String[] args) {
//    System.out.println("The average of the given numbers are: \t"+avg(23,29,74,99,100));
////    OR;
//    System.out.println(avg(27,43,12,66,78));
//}


//QUESTION 07: Repeat question no.3 using recursion
//public static void main(String[] args) {
//    pattern1_REC(5);
//}

//QUESTION 08: Repeat question no.3 using recursion
//    public static void main(String[] args) {
//        pattern2_REC(5);
//    }

//QUESTION 09: Write a function to convert celsius temperature into fahrenheit:
//public static void main(String[] args) {
//    System.out.println(tem(34.8));
//}

//    QUESTION NO.10: To find the sum of natural numbers using iterative approach:
//public static void main(String[] args) {
//        Scanner S= new Scanner(System.in);
//        System.out.println("Enter the value:");
//        int R=sum_iterative(S.nextInt());
//        System.out.println("The sum of nth value is : "+ R);
//}
}
