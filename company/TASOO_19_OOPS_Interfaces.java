package com.company;

interface Bicycle{
    int a= 23;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface Motorcycle{                                                 //MULTIPLE INTERFACES!
    void pauseBrake(int increment);
    void accelarate(int decrement);
}
class  AVONcycle implements Bicycle,Motorcycle{

    void blowHorn(){
        System.out.print("Blowing horn...\t");
        System.out.println("PEEEEEEE PEEEEEEEE PEEEEEEEE");
    }
    @Override
    public void applyBrake(int increment) {                      //INTERFACES class must use 'public' in their methods
        System.out.println("Applying Brake!");
    }
    @Override
    public void speedUp(int decrement) {
        System.out.println("Speeding up!");
    }

    @Override
    public void pauseBrake(int increment) {
        System.out.println("Wait ! and pause");
    }
    @Override
    public void accelarate(int decrement) {
        System.out.println("Accelaration");
    }
}
public class TASOO_19_OOPS_Interfaces {
    public static void main(String[] args) {
        AVONcycle tasso=new AVONcycle();
        tasso.blowHorn();

        tasso.applyBrake(2);
        tasso.speedUp(3);
        System.out.println("\nThis is for the MOTOR CYCLE!!!\n");
        tasso.accelarate(1);
        tasso.pauseBrake(1);
    }
}
