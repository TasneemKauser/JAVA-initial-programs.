package com.company;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.zip.CheckedOutputStream;
class  TASOO_44_OOPS_AWT_2  extends Frame
    {
        public static void main(String[] args)
        {
            TASOO_44_OOPS_AWT_2  t =new TASOO_44_OOPS_AWT_2();

//            Choice choice=new Choice();
//            choice.add("ROSHNI");
//            choice.add("KHUSHI");
//            choice.add("SHAQUIB");
//            choice.add("KISHU");
////            choice.remove("KHUSHI");
////            choice.remove(0);
//            choice.insert("KASHISH",3);
//            System.out.println(choice.getItem(0));
//            System.out.println(choice.getSelectedItem());
//            System.out.println(choice.getSelectedIndex());

            CheckboxGroup cg=new CheckboxGroup();
            Checkbox cb1=new Checkbox("male",cg,true);
            cb1.setBounds(120,100,30,10);
            System.out.println(cb1.getLabel());
            System.out.println(cb1.getState());

            Scrollbar scroll=new Scrollbar(Scrollbar.HORIZONTAL);

            List list=new List(5,true);
            list.add("A");
            list.add("B");
            list.add("C");
            list.add("D");
            list.remove(1);
            System.out.println(list.getSelectedItem());
            t.add(list);
            t.add(scroll);
//            t.add(choice);
            t.add(cb1);
            t.setLayout(new FlowLayout());
            t.setVisible(true);
            t.setSize(500,500);
            t.setTitle("MY_FRAME");
            t.setBackground(Color.red);
            t.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    t.dispose();
                }
            });
        }
        public void paint(Graphics g)
        {
            Font f=new Font("arial",Font.BOLD,25);
    g.setFont(f);
    g.drawString("Hey! Ratan how are you",100,100);
    }
    }

