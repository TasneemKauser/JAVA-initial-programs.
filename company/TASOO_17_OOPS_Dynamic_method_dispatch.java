package com.company;
class  Phone{
    public void greet(){
        System.out.println("Hello! Good Morning Beautiful");
    }
    public void on(){
        System.out.println("Turning on your Phone...");
    }
}
class SmartPhone extends Phone{
    public void greetings(){
        System.out.println("Heya!!! Wake up dear.");
    }
    @Override
    public void on(){

        System.out.println("Turning on Smart phone...");
    }
}
public class TASOO_17_OOPS_Dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone reference=new SmartPhone();
        reference.greet();
        reference.on();
//        reference.greetings();                //Gives error as it is overrides class from super class and need to
                                               //call the subclass method differently to run the method!!!
        SmartPhone sp=new SmartPhone();
        System.out.println("\nMoving to the subclass methods!");  //New reference for subclass!
        sp.greetings();
    }
}
