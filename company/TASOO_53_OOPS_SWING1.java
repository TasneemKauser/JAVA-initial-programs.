package com.company;
import javax.swing.*;
import java.awt.*;

class swing extends JFrame{           //Follows card layout by default!
    public swing(){
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1=new JLabel("Hello Swing!");
        JLabel l2=new JLabel("Welcome Khushi");
        add(l1);
        add(l2);
    }
}
public class TASOO_53_OOPS_SWING1 {
    public static void main(String[] args) {
        swing obj=new swing();
    }
}
