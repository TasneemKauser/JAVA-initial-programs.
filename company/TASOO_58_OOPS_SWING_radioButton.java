package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class radio extends JFrame{
    JTextField t1;
    JButton b;
    JRadioButton r1,r2;
    JLabel l;
    radio(){
        t1=new JTextField(15);
        b=new JButton("OK");
        r1=new JRadioButton("MALE");
        r1=new JRadioButton("FEMALE");
        l=new JLabel("GREETING!");

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        add(t1);
        add(r1);
        add(r2);
        add(b);
        add(l);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name= t1.getText();
                if (r1.isSelected())
                {
                    name="Mr ."+name;
                }
                else {
                    name="Ms."+name;
                }
                l.setText(name);
            }
        });
    }
}
public class TASOO_58_OOPS_SWING_radioButton {
    public static void main(String[] args) {
        radio r=new radio();
    }
}
