package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

class factorial extends JFrame{
        JTextField t;
        JButton b;
        JLabel l;
        factorial(){
            t=new JTextField(30);
            b=new JButton("Factorial");
            l=new JLabel("Result:");

            setVisible(true);
            setLayout(new FlowLayout());
            setBackground(Color.cyan);
            setForeground(Color.BLUE);
            setSize(500,500);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            add(t);
            add(b);
            add(l);

            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int fact=1;
                    Scanner s=new Scanner(System.in);
                    int f=Integer.parseInt(t.getText());
//                    int n=s.nextInt();
                    for (int i=1;i<=f;i++){
                        fact=fact*i;
                    }
                    l.setText(fact+"");
                }
            });
        }
}
public class TASOO_56_OOPS_SWING_factorial {
    public static void main(String[] args) {
        factorial ft=new factorial();
    }
}
