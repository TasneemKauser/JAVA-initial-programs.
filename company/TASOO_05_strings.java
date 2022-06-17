package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Locale;
import java.util.Scanner;

public class TASOO_05_strings {
    public static void main(String[] args) {
//STRINGS FORMATS:-
//1
        String name = new String("TASNEEM!");
        String name1 = new String("TASNEEMNEEM!");

        System.out.println(name);
//2
        String name2=(" Tasso! ");
        System.out.println(name2);
//3
        String name3= "Myself TASNEEM KAUSER!";
        System.out.println(name3);
//4
//        System.out.println("Enter anything / sentence ");
//        Scanner S= new Scanner(System.in);
//        String name4=S.nextLine();
//        System.out.println(name4);
//5
        String name5=" TASNEEM KAUSER ";
        int age=20;
        System.out.printf("Myself %s and my age is %d\n", name5,age);

//        STRINGS FORMATS:-
        int value=name.length();
        System.out.println("String lenghth is:"+ value);
        String lCase=name2.toLowerCase();
        System.out.println("String with lower case is:"+ lCase);
        String uCase=name3.toUpperCase();
        System.out.println("String with upper case is:"+ uCase);
        String trimString=name2.trim();
        System.out.println("Trimmed String is:"+ trimString);
        String subString=name2.substring(4);
        System.out.println("Sub String with 4:"+ subString);
        String sub_String=name2.substring(0,4);
        System.out.println("Sub String with 0,4:"+ sub_String);
        String repString=name2.replace('o','i');
        System.out.println("Replaced String is:"+ repString);
        String rep2String=name2.replace("so","neem");
        System.out.println("Replaced String is:"+ rep2String);
        System.out.println(name3.startsWith("Kas"));
        System.out.println(name3.endsWith("SER!"));
        System.out.println(name2.charAt(2));

        System.out.println(name1.indexOf("NEEM"));//gives first occurance
        System.out.println(name.indexOf("so", 2));
        System.out.println(name.indexOf("NEE", 2));
        System.out.println(name1.lastIndexOf("NEE"));//gives last occurance
        System.out.println(name1.lastIndexOf("NEE",6));//finds index in b/w six indexes!
        System.out.println(name.equals("TASNEEM!"));
        System.out.println(name.equalsIgnoreCase("tASneeM!"));

        System.out.println("I am escape sequence \" ,double quote");
        System.out.println("I am escape sequence \\ ,back slash");











    }
}
