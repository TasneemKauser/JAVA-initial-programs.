package com.company;

public class TASOO_29_OOPS_try_catch {
    public static void main(String[] args) {
        int a=6,b=0;

        try {
            int c=a/b;
            System.out.println("THe result is "+c);
        }
        catch (Exception e){
            System.out.println("We failed to divide, reason is :");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
