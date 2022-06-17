package com.company;

public class TASOO_10_Recursion {
    static int factorial(int n){
        if(n==0||n==1){
            return  1;
        }
        else {
            return  n*factorial(n-1);
        }
    }
    static  int factorial_iterative(int n){
        if(n==0||n==1){
            return 1;
        }
        else {
            int pro=1;
            for(int i=1;i<=n;i++){
                pro*=i;
            }
            return pro;
        }
    }
    public static void main(String[] args) {
        int a=4;
        System.out.println("The factorial of a given number by recursion method is : "+factorial(a));
        System.out.println("The factorial of a given number by recursion method is : "+factorial_iterative(a));
    }
}
