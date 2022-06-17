package com.company;
class Employee{
    int id,salary;
    String name;
    public void printDetails(){
        System.out.println("MY id is " + id);
        System.out.println("My name is " + name);
    }
//    public int getSalary(){
//        return  salary;
////        System.out.println("My salary is:"+ salary);
//    }
}
public class TASOO_11_OOPS_class {
    public static void main(String[] args) {
        System.out.println("This is a new employee\n");
        Employee tasso= new Employee();
        Employee khushi= new Employee();

//        SETTING ATTRIBUTES:
        tasso.id=15;
        tasso.name="TASNEEM KAUSER";
        tasso.salary=400000;
        khushi.id=75;
        khushi.name="TASNEEM is a sweet girl!";
        khushi.salary=20000;

//        PRINTING THE ATTRIBUTES:
        tasso.printDetails();
        khushi.printDetails();
//        tasso.getSalary();
//        System.out.println(tasso.getSalary());

//        System.out.println(tasso.id);                           //PRINTING MANUALLY
//        System.out.println(tasso.name);
    }
}
