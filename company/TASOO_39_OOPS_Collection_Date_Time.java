package com.company;
import java.util.Date;
public class TASOO_39_OOPS_Collection_Date_Time {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);
        System.out.println(System.currentTimeMillis());

        System.out.println("Maximum value of long is "+Long.MAX_VALUE);

        //Date class
        Date d= new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getYear());
        System.out.println(d.getDay());
    }
}
