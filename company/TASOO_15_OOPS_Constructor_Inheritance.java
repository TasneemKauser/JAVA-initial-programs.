package com.company;
class Base1{
    Base1() {
        System.out.println("I am a constructor!");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of x:"+x);
    }
}
class derived extends Base1{
    derived(){
        System.out.println("I am a derived class constructor!");
    }
    derived(int x ,int y){
        super(x);
        System.out.println("I am an overloaded constructor of derived with value of y:"+y);
    }
}
class child_derived extends derived{
    child_derived(){
        System.out.println("I am a child derived constructor!");
    }
    child_derived(int x,int y,int z){
        super(x,y);
        System.out.println("I am an over loaded constructor of child derived with value of z:"+z);
    }
}

public class TASOO_15_OOPS_Constructor_Inheritance {
    public static void main(String[] args) {
//        Base1 b=new Base1();
//        derived d=new derived(12,15);
        child_derived c= new child_derived(10,20,40);


    }
}
