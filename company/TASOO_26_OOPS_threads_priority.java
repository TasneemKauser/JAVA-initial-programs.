package com.company;

class MyThr1 extends Thread{
    public MyThr1(String name){
        super(name);
    }
    public  void run(){
        int i=30;
        while(true){
            System.out.println("WELCOME "+this.getName());
        }
    }
}
public class TASOO_26_OOPS_threads_priority {
    public static void main(String[] args) {
        MyThr1 t1=new MyThr1("Tasneem1");
        MyThr1 t2=new MyThr1("Tasneem2");
        MyThr1 t3=new MyThr1("Tasneem3");
        MyThr1 t4=new MyThr1("Tasneem4");
        MyThr1 t5=new MyThr1("Tasneem Kauser (most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
