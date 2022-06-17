package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class addition extends Frame {
    JTextField t1,t2;
    JButton b;
    JLabel l;
    public addition(){
        t1=new JTextField(20);
        t2=new JTextField(20);
        b=new JButton("OK");
        l=new JLabel("Result");

        add(t1);
        add(t2);
        add(b);
        add(l);

//        ActionListener al=new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                    int num1=Integer.parseInt(t1.getText());
//                    int num2=Integer.parseInt(t2.getText());
//
//                    int value=num1+num2;
//                    l.setText(value+"");
//                }
//        };

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num1=Integer.parseInt(t1.getText());
                int num2=Integer.parseInt(t2.getText());

                int value=num1+num2;
                l.setText(value+"");
            }
        });

        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
    }

}
public class TASOO_54_OOPS_SWING_AddTwoNo {
    public static void main(String[] args) {
        addition obj=new addition();
    }
}
