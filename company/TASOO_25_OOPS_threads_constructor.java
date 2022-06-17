package com.company;

class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public MyThr(Runnable r){
        super(r);
    }
    public void run(){
        int i=34;
        System.out.println("WELCOME");
//        while (true){
//            System.out.println("I am a thread!");
//        }
    }
}
public class TASOO_25_OOPS_threads_constructor {
    public static void main(String[] args) {
        MyThr mt=new MyThr("Tasso");
        MyThr mt2=new MyThr("Khushi");
        mt.start();
        System.out.println("The id of thread is "+mt.getId());
        System.out.println("THe name of the thread is "+mt.getName());

        System.out.println("The id of thread is "+mt2.getId());
        System.out.println("THe name of the thread is "+mt2.getName());

    }
}
