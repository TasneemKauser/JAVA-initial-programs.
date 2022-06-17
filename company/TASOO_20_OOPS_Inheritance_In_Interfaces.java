package com.company;

interface Sample_Interface{
    void meth1();
    void meth2();

}
interface Child_SampleInterface extends Sample_Interface{        //INHERITANCE
    void meth3();
    void meth4();
}
class  MySample implements Child_SampleInterface{                //INTERFACE
    @Override
    public void meth1() {
        System.out.println("1");

    }

    @Override
    public void meth2() {
        System.out.println("2");


    }

    @Override
    public void meth3() {
        System.out.println("3");


    }

    @Override
    public void meth4() {
        System.out.println("4");


    }
}

public class TASOO_20_OOPS_Inheritance_In_Interfaces {
    public static void main(String[] args) {
        MySample t=new MySample();
        t.meth1();
        t.meth2();
        t.meth3();
        t.meth4();
    }
}
