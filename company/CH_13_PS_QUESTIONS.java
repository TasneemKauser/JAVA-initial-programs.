package com.company;

import java.util.Scanner;

class Exception_on_retry extends Exception{
    public String getMessage(){
        return "ERROR";
    }
}
public class CH_13_PS_QUESTIONS {
    public static void MaxException(int i) throws Exception_on_retry{}
    public static void main(String[] args) {
//        PROBLEM 2:
//        try {
//            int a=2132/12;
//        }
//        catch (IllegalArgumentException i){
//            System.out.println("HAHAHAHAHAHA");
//        }
//        catch (ArithmeticException e){
//            System.out.println("HEHEHEHEHEHEHE");
//        }

//        PROBLEM 3:
        boolean flag=true;int [] marks =new int[3];
        marks[0]=21;
        marks[1]=91;
        marks[2]=29;
        Scanner s=new Scanner(System.in);
        int index,i=0;
        while (flag && i<5) {
            try {
                System.out.println("Enter the value of index");
                index = s.nextInt();
                System.out.println("The value of marks[index] is :" + marks[index]);
                break;
            }
            catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if (i>=5){
//            System.out.println("ERROR!!!");

//            PROBLEM 4:
            try {
                throw new Exception_on_retry();
            }
            catch (Exception_on_retry e){
                System.out.println(e.getMessage());
            }
        }

    }
}
