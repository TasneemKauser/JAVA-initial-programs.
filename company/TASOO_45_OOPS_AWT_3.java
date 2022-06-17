package com.company;
import java.awt.*;
class MyFrame extends Frame
{
    MyFrame()
    {
        this.setVisible(true);
        this.setSize(500,500);
        this.setBackground(Color.cyan);
        this.setTitle("FRAME");
    }
    public void paint(Graphics g)
    {
        Font f=new Font("arial",Font.BOLD,20);
        g.setFont(f);
        this.setForeground(Color.black);
        g.drawString("B_TECH",100,100);
        g.drawString("Boys & ",200,100);
        g.drawString("Girls",300,100);
    }
}
public class TASOO_45_OOPS_AWT_3
{
    public static void main(String[] args)
    {
        MyFrame f=new MyFrame();
    }
};