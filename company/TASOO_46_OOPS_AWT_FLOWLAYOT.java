package com.company;
import java.awt.*;
class MY_FRAME extends Frame{
    Label l1,l2;
    Button b;
    TextField t1,t2;
    MY_FRAME(){
        this.setSize(300,400);
        this.setVisible(true);
        this.setBackground(Color.pink);
        this.setTitle("TASNEEM KAUSER!");
        l1=new Label("User name");
        l2=new Label("password:");
        t1=new TextField(25);
        t2=new TextField(25);
        b=new Button("Buttons");
        t2.setEchoChar('*');
        this.setLayout(new FlowLayout());
        this.add(b);
        this.add(l1);
        this.add(l2);
        this.add(t1);
        this.add(t2);
    }
}
public class TASOO_46_OOPS_AWT_FLOWLAYOT {
    public static void main(String[] args) {
        MY_FRAME obj = new MY_FRAME();
    }
}
