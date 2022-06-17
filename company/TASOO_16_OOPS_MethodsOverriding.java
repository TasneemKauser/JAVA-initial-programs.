package com.company;
class A{
    public void meth1(){
        System.out.println("I am method 1 of class A");
    }
}

class B extends A{
    @Override
    public void meth1(){
        System.out.println("I am method 1 of class B");
    }
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
}
public class TASOO_16_OOPS_MethodsOverriding {
    public static void main(String[] args) {
        A a=new A();
        a.meth1();

        B b =new B();
        b.meth1();
        b.meth2();
    }
}
