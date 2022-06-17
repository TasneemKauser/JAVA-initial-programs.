package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class caller extends JFrame {
    caller(){
        JButton b=new JButton("Add form");
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(b);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new  addition();
                dispose();
            }
        });
    }
}
public class TASOO_62_OOPS_SWING_Calling {
    public static void main(String[] args) {
        caller c=new caller();

    }
}
