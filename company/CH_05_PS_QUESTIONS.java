package com.company;

public class CH_05_PS_QUESTIONS {
    public static void main(String[] args) {

//QUESTION:01
// ****
// ***
// **
// *
//        System.out.println("Write a java program to print the following pattern.");
//
//        int n = 4;
//        for (int i = n; i >= 1; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//QUESTION 02:
//        System.out.println("To print first n even numbers using while loop.");
//        System.out.println("Enter the value of n");
//        Scanner S= new Scanner(System.in);
//        int n= S.nextInt();
//        int i=0;
//        while(i<n){
//            System.out.println(2*i);
//            i++;
//        }

//QUESTION 03:
//        System.out.println("To print THE MULTIPLICATION TABLE.");
//        System.out.println("Enter the value of n");
//        Scanner S= new Scanner(System.in);
//        int n= S.nextInt();
//        int i=1;
//        while(i<=10){
//            System.out.printf("%d * %d = %d\n",n,i,n*i);
//            i++;
//        }

//QUESTION 04:
//        System.out.println("To print THE MULTIPLICATION TABLE IN REVERSE ORDER.");
//        System.out.println("Enter the value of n");
//        Scanner S= new Scanner(System.in);
//        int n= S.nextInt();
//        for (int i=n;i!=0;i--){
//            System.out.printf("%d * %d = %d\n",n,i,n*i);
//        }

//QUESTION 04:
//        System.out.println("To print factorial of a given number.");
//        System.out.println("Enter the value of n");
//        Scanner S= new Scanner(System.in);
//        int n= S.nextInt();
//        int fact=1;
//        for (int i=1;i<=n;i++){
//            fact*=i;
//        }
//        System.out.println(fact);

//QUESTION 04:
        System.out.println("Write a java program to print the following pattern.");
        int j=0;
        int i=4;
        while(i>=1){
            while(j<i){
                System.out.print("*");
                i--;
            }
            System.out.println("\n");


        }

    }
}
