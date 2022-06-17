package com.company;
class employee{
    int salary;
    String name;

    public int getSalary(){
        return  salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
class cellPhone{
    String ring ,vibrate;
    public void ring(){
        System.out.println("Ringing....");
    }
    public void vibrate(){
        System.out.println("Vibrating...");    }
}

class square{
    int side;

    public  int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class TommyVercetti{
    String fire,hit ,run;
    public void fire(){
        System.out.println("Firing on the enemy.");
    }
    public void hit(){
        System.out.println("Hitting the enemy.");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
}
class rectangle{
    int length,breadth;

    public  int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
class circle{
    double radius;
    double pie=3.14;

    public  double area(){
        return pie*radius*radius;
    }
    public double perimeter(){
        return 2*pie*radius;
    }
}

public class CH_08_PS_QUESTIONS {
//QUESTION :01
    public static void main(String[] args) {
//        employee tasso=new employee();
//        tasso.salary=450000;
//        System.out.println(tasso.getSalary());
//        tasso.setName("Tasneem Kauser");
//        System.out.println(tasso.getName());


// QUESTION 02:
//        cellPhone asus=new cellPhone();
//        asus.ring();
//        asus.vibrate();


//QUESTION 03:
//        square S=new square();
//        S.side=2;
//        System.out.println("Area of the square is :" +S.area());
//        System.out.println("Perimeter of the square is :" +S.perimeter());


// QUESTION 04:
//        TommyVercetti pubg=new TommyVercetti();
//        pubg.fire();
//        pubg.hit();
//        pubg.run();


//QUESTION 05:
//        rectangle S=new rectangle();
//        S.length=2;
//        S.breadth=4;
//        System.out.println("Area of the rectangle is :" +S.area());
//        System.out.println("Perimeter of the rectangle is :" +S.perimeter());


//QUESTION 06:
        circle S=new circle();
        S.radius=3;
        System.out.println("Area of the circle is :" +S.area());
        System.out.println("Perimeter of the circle is :" +S.perimeter());
    }
}



