package com.company;
class My_eMPLOYEE {
    private int id;
    private int salary;
    private String name;
    public My_eMPLOYEE(){
        id = 45; salary=100000;
        name = "YOUR_NAME_PLEASE!";
    }
    public My_eMPLOYEE(String Myname, int MyId) {                                       //METHOD OVERLOADING!
        id = MyId;
        name = Myname;
    }
    public My_eMPLOYEE(String Myname, int MyId,int Mysalary) {                           //METHOD OVERLOADING!
        id = MyId;
        name = Myname;
        salary= Mysalary;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getSalary() {
        return salary;
    }
}
public class TASOO_13_OOPS_constructors {
    public static void main(String[] args) {
        My_eMPLOYEE tasso=new My_eMPLOYEE();

//        OR
//        My_eMPLOYEE tasso=new My_eMPLOYEE("Khushi",15);
        System.out.println("Employee's Name is :" +tasso.getName());
        System.out.println("Tasso's Id is :" +tasso.getId());
        System.out.println("Tasso's Salary is :"+tasso.getSalary());
    }
}
