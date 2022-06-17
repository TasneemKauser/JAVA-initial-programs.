package com.company;

public class CH_03_PS_QUESTIONS {
    public static void main(String[] args) {

// QUESTION:-01
        System.out.println("To print in lower case:");
        String name= "Tasneem  Kauser";
        System.out.println(name.toLowerCase());

// QUESTION 02:-
        System.out.println("To remove spaces with underscore:");
        System.out.println(name.replace(" ","_"));

// QUESTION 03:-

        System.out.println("To print by replacing:");
        String letter= "Dear <|name|> ,Thanks a lot!";
        letter=letter.replace("<|name|>","Khushi");
        System.out.println(letter);

// QUESTION 04:
        System.out.println("To detect double and triple spaces:");
        String S="Heya!  my name is Tasneem Kauser.";
        System.out.println(S.indexOf("  "));
        System.out.println(S.indexOf("   "));

//QUESTION 05:
        System.out.println("Using of escape sequence:");
        String string="Heya! \n\tMy name is Tasneem Kauser.\nThanks!";
        System.out.println(string);
    }
}
