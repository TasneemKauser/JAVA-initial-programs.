package com.company;

public class TASOO_08_Methods {

    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * x * 4;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=45;
        int b=34;
        int c;
        c =logic(a,b);
        System.out.println(c);
        int a1=21;
        int b1=89;
        int c1;
        c1=logic(a1,b1);
        System.out.println(c1);

    }
}