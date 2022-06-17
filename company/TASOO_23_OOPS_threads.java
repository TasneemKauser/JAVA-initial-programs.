package com.company;
import java.security.cert.TrustAnchor;
class MyThread1 extends Thread{
    @Override
    public  void run(){
        int i=0;
        while (i<20000){
            System.out.println("My thread1 is running!");
            System.out.println("I am happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public  void run(){
        int i=0;
        while (i<20000){
            System.out.println("My thread2 is working!");
            System.out.println("I am sad!");
            i++;
        }
    }
}
public class TASOO_23_OOPS_threads {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();
    }
}