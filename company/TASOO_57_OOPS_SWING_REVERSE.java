package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class reverse extends JFrame{
    JTextField t;
    JButton b;
    JLabel l;
    reverse(){
        t=new JTextField(30);
        b=new JButton("REVERSE");
        l=new JLabel("RESULT");

        setVisible(true);
        setSize(500,500);
        setBackground(Color.cyan);
        setForeground(Color.black);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(t);
        add(b);
        add(l);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int r=0;
                int a =Integer.parseInt(t.getText());
                while (a!=0){
                    int digit=a%10;
                    r= r* 10+digit;
                   a=a/10;
                }
                l.setText(r+" ");
            }
        });
    }
}
public class TASOO_57_OOPS_SWING_REVERSE {
    public static void main(String[] args) {
        reverse obj= new reverse();
    }

}
