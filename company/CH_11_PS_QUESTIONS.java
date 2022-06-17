package com.company;
 abstract  class Pen{
     abstract void write();
     abstract void refill();
     abstract void change_nib();
 }
 abstract class Pen_Usage extends Pen{
     @Override
     void write() {
         System.out.println("This is the abstract class method to write with a pen!");
     }
     @Override
     void refill() {
         System.out.println("This is the abstract class method to refill the pen!");
     }
 }
 class Fountain_Pen extends Pen_Usage{
     @Override
     void change_nib() {
         System.out.println("Pen is now change to Fountain pen by changing it's nib.");
     }
 }
 class Monkey{
     void jump(){
         System.out.println("Jumping...");
     }
     void bite(){
         System.out.println("Biting...");
     }
 }
 interface Basic_Animal{
     void eat();
     void sleep();

 }
 class Human extends Monkey implements Basic_Animal{
     @Override
     public void eat() {
         System.out.println("Eating");
     }

     @Override
     public void sleep() {
         System.out.println("Sleeping");
     }
 }

 abstract class Telephone{
     abstract void ring();
     abstract void lift();
     abstract void disconnect();
 }
 class Smart_telephone extends Telephone{
     @Override
     void ring() {
         System.out.println("The telephone is ringing");
     }

     @Override
     void lift() {
         System.out.println("Pick or lift the telephone");
     }

     @Override
     void disconnect() {
         System.out.println();
         System.out.println("Disconnect the telephone");
     }
 }

 interface Tv_Remote{
     void on();
     void off();
 }
 interface Smart_Tv_Remote{
     void play();
     void volume();
 }

 class TV implements Smart_Tv_Remote{
     @Override
     public void play() {
         System.out.println("Playing....");
     }
     @Override
     public void volume() {
         System.out.println("Up/Down the volume");
     }
 }
 class Class_TV implements Tv_Remote{
     @Override
     public void on() {
         System.out.println("On the TV");
     }

     @Override
     public void off() {
         System.out.println("Off the TV");
     }
 }

public class CH_11_PS_QUESTIONS {
    public static void main(String[] args) {
        //QUESTION 01 & 02
//        Fountain_Pen P=new Fountain_Pen();
//        P.refill();
//        P.write();
//        P.change_nib();

        //QUESTION 03
//        Human H= new Human();
//        H.eat();
//        H.sleep();

        //QUESTION 05
//        Basic_Animal ba=new Human();
//        ba.eat();
//        ba.sleep();

//        Monkey m=new Human();
//        m.bite();
//        m.jump();


        //QUESTION 04
//        Telephone tp=new Smart_telephone();
//        tp.disconnect();tp.lift();tp.ring();

        //QUESTION 06
        TV tv=new TV();
        tv.play();

        //QUESTION 07
        Class_TV tv1=new Class_TV();
        tv1.off();tv1.on();

    }
}
