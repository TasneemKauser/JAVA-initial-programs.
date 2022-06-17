package com.company;
public class TASOO_09_VarArgs {
    static int sum(int x, int ...arr){
        int result=x;
        for(int a:arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 3 is "+sum(3));
        System.out.println("The sum of 3 and 7 is "+sum(3,7));
        System.out.println("The sum of 3,12 and 7 is "+sum(3,12,7));
        System.out.println("The sum of 3 ,34,22,67 and 7 is "+sum(3,34,22,67,7));

    }
}
