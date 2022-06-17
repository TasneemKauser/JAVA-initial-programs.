package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TASOO_64_OOPS_File_handling {
    public static void main(String[] args) {
       File MyFile=new File("tasso.txt");
        try {
            MyFile.createNewFile();
        }
        catch (IOException e){
            System.out.println("Unable to create new file!");
            e.printStackTrace();
        }
        /*
        try {
            FileWriter fileWriter=new FileWriter("tasso.txt");
            fileWriter.write("THIS IS MY FILE \n Now get lost!!!");
            fileWriter.close();
     }
        catch (IOException e){
            e.printStackTrace();
        }

        File MyFile=new File("tasso.txt");
        try {
            Scanner sc=new Scanner(MyFile);
            while (sc.hasNextLine()){
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch (FileNotFoundException E){
            E.printStackTrace();
        }

        File MyFile =new File("tasso.txt");
        if (MyFile.delete()){
            System.out.println("Deleted successfully!");
        }
        else {
            System.out.println("Error occurred!!!");
        }*/
    }
}
