package com.company;

class Negative_radius_Exception extends Exception{
    public String toString(){
        return "Radius cannot be negative";
    }
    public String getMessage(){
        return "Radius cannot be negative";
    }
}
public class TASOO_33_OOPS_Throw_vs_Throws {
    public  static double area(int r) throws Negative_radius_Exception{
        if (r<0){
            throw new Negative_radius_Exception();
        }
        double result =Math.PI*r*r;
        return result;
    }
    public static int divide(int a, int b) throws  ArithmeticException{
        int result =a/b;
        return result;
    }
    public static void main(String[] args) {
        try {
//            int c= divide(6,0);System.out.println(c);
            double ar=area(5);
            System.out.println(ar);
        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }
}