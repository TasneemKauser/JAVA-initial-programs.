package com.company;

import org.w3c.dom.NameList;

interface MyCamera{
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
interface MYWifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void CallNumber(int phoneNumber){
        System.out.println("Calling..."+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}

class MySmartPhone extends MyCellPhone implements MyCamera,MYWifi{
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

public class TASOO_19_OOPS_Multiple_Interfaces {
    public static void main(String[] args) {
        MySmartPhone ms=new MySmartPhone();

//        ms.record4KVideo();
//        ms.greet();         ------------------> Throws an error!

//        ms.takeSnap();
        String [] arr= ms.getNetwork();
        for (String item:arr) {
            System.out.println(item);
        }
    }
}
