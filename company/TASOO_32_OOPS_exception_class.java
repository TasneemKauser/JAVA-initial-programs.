package com.company;

import java.util.Scanner;

//class MyException extends Exception{
//    public String toString(){
//        return "I am toString";
//    }
//    public String getMessage(){
//        return "I am getMessage";
//    }
//}

class MaxAge extends Exception{
    public String toString(){
        return "Age cannot be greater then 125";
    }
    public String getMessage(){
        return "Make sure that age entered is correct";
    }
}
public class TASOO_32_OOPS_exception_class {
    public static void main(String[] args) {
        int a,age;
        Scanner sc=new Scanner(System.in);
//        a= sc.nextInt();
        age=sc.nextInt();
        if (age>125){
            try {
                throw new Exception("The entered age is wrong and is not matching the criteria!");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }
//        if (a<99) {
//            try {
////                throw new MyException();
//                throw new ArithmeticException("This is an exception");
//            }
//            catch (Exception e){
//                System.out.println(e.getMessage());
//                System.out.println(e.toString());
//                e.printStackTrace();
//                System.out.println("Finished");
//            }
//        }
    }
}
