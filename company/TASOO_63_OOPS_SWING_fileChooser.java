package com.company;
import javax.swing.*;

import java.awt.*;
import javax.swing.table.*;
class TASOO_63_OOPS_SWING_filechooser
{
    public static void main(String[] args)
    {
        JFrame f=new JFrame();
        f.setVisible(true);
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=f.getContentPane();
        String[] header={"ENO","ENAME","ESAL"};
        Object[][]
                body={{"111","aaa",5000},{"222","bbb",6000},{"333","ccc",7000},{"444","ddd",8000}};
        JTable t=new JTable(body,header);
        JTableHeader th=t.getTableHeader();
        c.setLayout(new BorderLayout());
        c.add("North",th);
        c.add("Center",t);
    }
}