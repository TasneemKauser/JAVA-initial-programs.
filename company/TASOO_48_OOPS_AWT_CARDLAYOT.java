package com.company;
import java.awt.*;
class my_Frame extends Frame{
    Button b1,b2,b3,b4,b5;
    my_Frame(){
        this.setSize(400,400);
        this.setVisible(true);
        this.setBackground(Color.cyan);
        this.setTitle("TASNEEM KAUSER!");
        this.setLayout(new CardLayout());

        b1=new Button("button1");
        b2=new Button("button2");
        b3=new Button("button3");
        b4=new Button("button4");
        b5=new Button("button5");

        this.add("FIRST CARD",b1);
        this.add("SECOND CARD",b2);
        this.add("THIRD CARD",b3);
        this.add("FOURTH CARD",b4);
        this.add("FIFTH CARD",b5);
    }
}
public class TASOO_48_OOPS_AWT_CARDLAYOT {
    public static void main(String[] args) {
        my_Frame obj=new my_Frame();
    }
}
