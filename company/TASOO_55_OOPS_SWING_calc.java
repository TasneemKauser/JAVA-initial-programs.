package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class calci extends Frame {
    JTextField t1,t2;
    JButton b1,b2;
    JLabel l;
    public calci(){
        t1=new JTextField(20);
        t2=new JTextField(20);
        b1=new JButton("ADD");
        b2=new JButton("SUB");
        l=new JLabel("Result");

        add(t1);
        add(t2);
        add(b1);
        add(b2);
        add(l);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());
                int value=num1+num2;
                l.setText(value+"");
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());
                int value1=num1-num2;
                l.setText(value1+"");            }
        });
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
    }
}
public class TASOO_55_OOPS_SWING_calc {
    public static void main(String[] args) {

        calci obj=new calci();
    }
}
