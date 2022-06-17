package com.company;

import java.util.Scanner;

class Cylinder{
    private double radius,height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public  double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getHeight(){
        return  height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double surfaceArea(){
        return (2*Math.PI*radius*height) + (2*Math.PI*radius*radius);
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
class Rectangle{
    private int length,breadth;
    public int getLength() {
        return length;
    }
    public int getBreadth() {
        return breadth;
    }
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
public class CH_09_PS_QUESTIONS {
    public static void main(String[] args) {
//QUESTION 01:
//        Cylinder dimensions=new Cylinder();
//
//        Scanner S=new Scanner(System.in);
//        System.out.print("Enter the radius of cylinder:");
//        dimensions.setRadius(S.nextDouble());
//        System.out.print("Enter the height of cylinder:");
//        dimensions.setHeight(S.nextDouble());
//        System.out.println("The value of radius of the cylinder is "+dimensions.getRadius() +" m");
//        System.out.println("The value of height of the radius is "+dimensions.getHeight() +" m");

//QUESTION 02:
//        System.out.println("\nThe surface area of the cylinder is :"+dimensions.surfaceArea()+" sq m");
//        System.out.println("The volume of the cylinder is :"+dimensions.volume() +" cube m");

//QUESTION 03:
//        Cylinder dimension =new Cylinder(12,45);
//        System.out.println(dimension.getRadius());
//        System.out.println(dimension.getHeight());
//        System.out.println(dimension.surfaceArea());
//        System.out.println(dimension.volume());

//QUESTION 04:
        Rectangle dimension=new Rectangle(12,15);
        System.out.format("Given the length is %d m and breadth is %d m " +
                "of the rectangle\n\n",dimension.getLength(),dimension.getBreadth());

        System.out.print("Area of the rectangle is :"+dimension.area()+" sq m");
        System.out.println("\nPerimeter of the rectangle is :"+dimension.perimeter()+" m");
    }
}
