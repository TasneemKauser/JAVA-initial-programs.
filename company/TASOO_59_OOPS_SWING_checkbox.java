package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class checkB extends  JFrame{
    JTextField t1,t2;
    JButton b;
    JLabel l;
    JCheckBox c1,c2;
     checkB(){
         t1=new JTextField(20);
         t2=new JTextField(20);
         b=new JButton("OK");
         l=new JLabel("Result");
         c1=new JCheckBox("SINGING");
         c2=new JCheckBox("DANCING");

         setVisible(true);
         setLayout(new FlowLayout());
         setBackground(Color.cyan);
         setForeground(Color.BLUE);
         setSize(500,500);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         c1.addItemListener(new ItemListener() {
             @Override
             public void itemStateChanged(ItemEvent e) {
                 System.out.println("My self Tasneem Kauser!");
             }
         });


         add(t1);
         add(t2);
         add(b);
         add(l);
         add(c1);
         add(c2);

     }
 }
public class TASOO_59_OOPS_SWING_checkbox {
    public static void main(String[] args) {
        checkB c=new checkB();
    }
}
