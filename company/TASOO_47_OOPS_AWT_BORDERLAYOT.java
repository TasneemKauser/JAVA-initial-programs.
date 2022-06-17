package com.company;

import java.awt.*;

class myFrame extends Frame{
    Button b1,b2,b3,b4,b5;
    myFrame(){
        this.setSize(400,400);
        this.setVisible(true);
        this.setBackground(Color.cyan);
        this.setTitle("TASNEEM KAUSER!");
        this.setLayout(new BorderLayout());

        b1=new Button("BOYS");
        b2=new Button("GIRLS");
        b3=new Button("MANAGEMENT");
        b4=new Button("TEACHING STAFF");
        b5=new Button("NON-TEACHING STAFF");

        this.add("North",b1);
        this.add("Center",b2);
        this.add("South",b3);
        this.add("East",b4);
        this.add("West",b5);
    }
}
public class TASOO_47_OOPS_AWT_BORDERLAYOT {
    public static void main(String[] args) {
        myFrame obj=new myFrame();
    }
}
