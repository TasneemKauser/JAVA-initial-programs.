package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TASOO_42_OOPS_Collection_API {
    public static void main(String[] args) {
        LocalDate d= LocalDate.now();
        System.out.println(d);

        LocalTime t= LocalTime.now();
        System.out.println(t);

        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        //Date Time Formatter
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yy--E H:m:s a");
        DateTimeFormatter df2=DateTimeFormatter.ISO_LOCAL_DATE;

        String MyDate=dt.format(df);

        System.out.println("My style of date time format:");
        System.out.print("Today's date is : \t");
        System.out.println(MyDate);
    }
}
