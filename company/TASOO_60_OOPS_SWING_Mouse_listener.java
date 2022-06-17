package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
class mouseL extends JFrame {
    mouseL(){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x=e.getX();
                int y=e.getY();
                System.out.println(x+" , "+y);
            }
        });
        setVisible(true);
        setLayout(new FlowLayout());
        setBackground(Color.cyan);
        setForeground(Color.BLUE);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class TASOO_60_OOPS_SWING_Mouse_listener {
    public static void main(String[] args) {
        mouseL m=new mouseL();
    }
}
