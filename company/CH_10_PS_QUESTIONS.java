package com.company;
class Circle{
    public int radius;
    public Circle(){
        System.out.println("This is non-Parameterized circle");
        System.out.println("\n The area of circle is : "+area());
    }
    public Circle(int radius){
        this.radius = radius;
        System.out.println("I am Parameterized circle");
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
class Cylinder1 extends Circle{
    public int height;

    public Cylinder1(int height,int radius) {
        super(radius);
        System.out.println("I am parameterized cylinder");
        this.height=height;
        System.out.println("\n The volume of cylinder is : "+volume());
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
public class CH_10_PS_QUESTIONS {
    public static void main(String[] args) {
//        Circle Ci=new Circle();
        Cylinder1 C=new Cylinder1(12,30);
    }
}
