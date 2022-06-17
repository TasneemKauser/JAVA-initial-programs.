package com.company;


public class TASOO_34_OOPS_Finally_key {
    public static int greet(){
        try {
            int a=50,b=10;
            int c=a/b;
            return c;
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Cleaning up resources");
        }
        return -1;
    }
    public static void main(String[] args) {
        int k=greet();
        System.out.println(k);
        int a=7,b=9;
        while (true){
            try {
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("I am finally for value of b="+b);
                System.out.println();
            }
            b--;
        }
//        TRY WITH FINAL ONLY!!!

        try {
            System.out.println(60/90);
        }
        finally {
            System.out.println("Whether the exception occurred or not ,the finally will be visible");

        }
    }
}
