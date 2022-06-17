package com.company;

import org.w3c.dom.NameList;

interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void  greet(){
        System.out.println("Good morning!");
    }
    default void record4KVideo(){                     //This is default methods! and used to quick fix the methods!
        greet();                                      // Private methods can be used in default methods in any emergency
        System.out.println("Recording the video in 4K quality!");
    }
}
interface MYWifi2{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void CallNumber(int phoneNumber){
        System.out.println("Calling..."+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class MySmartPhone2 extends MyCellPhone implements MyCamera2,MYWifi2{
    @Override
    public void takeSnap() {
        System.out.println("Taking Snap !");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording the Video!");
    }

//    @Override
//    public void record4KVideo() {
//        System.out.println("Recording the 4K Video!");
//    }                                                         //When this works, then  default one does not work

    @Override
    public String[] getNetwork() {
        System.out.println("Getting list of the networks!");
        String [] Nlist={"Tasneem","Khushi","Kishu","Roshni"};
        return Nlist;
    }

    @Override
    public void connectToNetwork(String network) {
    }
}

public class TASOO_21_OOPS_Polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam2=new MySmartPhone2();                     //Can only use MyCamera2 method!
        cam2.record4KVideo();
        cam2.takeSnap();
//        cam2.getNetwork();                                    ---------->  Cannot work as it is polymorphism!

    }
}
