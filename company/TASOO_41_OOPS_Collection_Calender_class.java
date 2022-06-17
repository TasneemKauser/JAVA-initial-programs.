package com.company;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TASOO_41_OOPS_Collection_Calender_class {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":" +c.get(Calendar.SECOND));

        GregorianCalendar g=new GregorianCalendar();
        System.out.println(g.isLeapYear(2017));
        for (int i=0;i<6;i++){
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }
    }
}
