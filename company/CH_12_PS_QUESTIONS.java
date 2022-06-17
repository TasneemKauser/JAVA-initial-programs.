package com.company;
class practice12A extends Thread{
    public void run(){
//        while (true){
//            try {
//                Thread.sleep(200);
//            }
//            catch (Exception e){
//                System.out.println(e);
//            }
//            System.out.println("WELCOME");
//        }
    }
}
class practice12B extends Thread{
    public void run(){
        while (true){
            System.out.println("GOOD MORNING!");
        }
    }
}
public class CH_12_PS_QUESTIONS {
    public static void main(String[] args) {
        practice12A pa=new practice12A();
        pa.setPriority(6);
        practice12B pb=new practice12B();
        pb.setPriority(9);
        System.out.println(pa.getPriority());

        System.out.println(pb.getPriority());
        System.out.println(pa.getState());
//        pa.start();
        pa.start();
        System.out.println(pb.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
