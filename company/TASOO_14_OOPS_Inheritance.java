package com.company;
class Base{
    int x;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am in base and setting a 'x' now!");
        this.x = x;
    }
     public void printMe(){
         System.out.println("I am a constructor!");
     }
}

class Derived extends Base{
    int y ;
    public void setY(int y) {
        this.y = y;
    }
    public  int getY(){
        return y;
    }
}
public class TASOO_14_OOPS_Inheritance {
    public static void main(String[] args) {
        Base b= new Base();
        b.setX(8);
//        System.out.println(b.getX());
        Derived d= new Derived();
        d.setX(12);
        System.out.println(d.getX());
        d.setY(10);
        System.out.println(d.getY() );

    }
}
