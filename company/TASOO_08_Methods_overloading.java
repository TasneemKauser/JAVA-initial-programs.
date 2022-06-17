package com.company;

public class TASOO_08_Methods_overloading {
    static  void foo(){
        System.out.println("GOOD MORNING GIRL!");
    }
    static  void foo(int a,int b){
        System.out.println("GOOD MORNING " +a+ " GIRL!");
        System.out.println("GOOD MORNING " +b+ " GIRL!");
    }
    static  void change(int a){
        a=98;
    }
    static void change1(int [] arr){
        arr[0]=52;
        arr[3]=33;
    }
    static void tellJoke() {
        System.out.println("I invented a new word ," +
                "that is, plagiarism");
    }

    public static void main(String[] args) {
//        tellJoke();
        int [] marks={23,55,6,89,19};
//CASE :1 :- CHANGING THE INTEGER.
//        int x=45;
//        change(x);
//        System.out.println("The value of change after x is:"+ x);

// CASE:2:- CHANGING THE ARRAY:
//        change1(marks);
//        System.out.println("The value after changing the array value is:"+ marks[3]);

//CASE:3:- METHOD OVERLOADING:
        foo();
        foo(200,12); //Arguments are actual values.

    }

}
