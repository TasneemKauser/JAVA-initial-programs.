package com.company;
class MyEMPLOYEE{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;

    }
    public int getId(){
        return id;
    }
    public void setId(int n ){
        id=n;
    }

}

public class TASOO_12_OOPS_getters_setters {
    public static void main(String[] args) {
        MyEMPLOYEE tasso=new MyEMPLOYEE();
//        tasso.id=24;
//        tasso.name="Myself Tasneem Kauser";
        tasso.setName("Myself Tasneem Kauser!");
        tasso.setId(25);

        System.out.println(tasso.getName());
        System.out.println(tasso.getId());

    }

}
