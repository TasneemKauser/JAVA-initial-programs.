package com.company;
class MyNewThr1 extends Thread{
    public  void run(){
        int i=0;
        while(i<20000){
            System.out.println("WELCOME in THREAD-1");
            i++;
        }
    }
}
class MyNewThr2 extends Thread{
    public  void run(){
        int i=0;
        while(true){
            System.out.println("WELCOME in THREAD-2");
            try {
                Thread.sleep(455);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class TASOO_28_OOPS_threads_methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();

    }
}

