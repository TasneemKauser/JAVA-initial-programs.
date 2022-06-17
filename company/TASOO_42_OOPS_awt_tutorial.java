package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//public class TASOO_42_OOPS_awt_tutorial extends Frame{
//    public TASOO_42_OOPS_awt_tutorial() {
//      setSize(1000,300);
//      setVisible(true);
//    }
public class TASOO_42_OOPS_awt_tutorial {
    public void paint(Graphics g){
        Font f=new Font("arial",Font.ITALIC,25);
        g.setFont(f);
        g.drawString("HELLO! How are you!",100,100);
    }
    public TASOO_42_OOPS_awt_tutorial() {
        Frame frame =new Frame("Hello GUI!");
        TextArea textarea=new TextArea();
        textarea.setBounds(350,70,200,200);
        textarea.setText("LOVE THE WAY YOU ARE!");
        textarea.setBackground(Color.black);
        textarea.setForeground(Color.white);

        String s=textarea.getText();

        Label label=new Label("Hello TASSO!");
        label.setBounds(20,90,150,30);
        label.setBackground(Color.cyan);

        TextField textfield=new TextField();
        textfield.setBounds(20,120,150,30);

        Button button = new Button("Click me!");
        button.setBounds(20,40,80,30);
        button.setBackground(Color.red);
        button.setForeground(Color.black);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("button click successfully");
            }
        });
        Checkbox checkbox =new Checkbox("JAVA");
        checkbox.setBounds(20,200,50,30);
        Checkbox checkbox1 =new Checkbox("PYTHON");
        checkbox1.setBounds(20,230,70,30);
        System.out.println(checkbox.getLabel());
        System.out.println(checkbox1.getState());

        frame.add(textarea);
        frame.add(checkbox);
        frame.add(checkbox1);
        frame.add(textfield);
        frame.add(button);
        frame.add(label);
        frame.setSize(700,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBackground(Color.pink);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
//        frame.addWindowListener(this);
    }
//    @Override
//    public void windowOpened(WindowEvent e) {
//        System.out.println("WINDOW IS OPENED!");
//    }
//
//    @Override
//    public void windowClosing(WindowEvent e) {
//        Frame frame =(Frame)e.getSource();
//        frame.dispose();
//        System.out.println("WINDOW IS CLOSING!");
//    }
//    @Override
//    public void windowClosed(WindowEvent e) {
//        System.out.println("WINDOW IS CLOSED!");
//    }
//    @Override
//    public void windowIconified(WindowEvent e) {
//        System.out.println("WINDOW IS ICONIFIED!");
//    }
//
//    @Override
//    public void windowDeiconified(WindowEvent e) {
//        System.out.println("WINDOW IS DE ICONIFIED!");
//    }
//
//    @Override
//    public void windowActivated(WindowEvent e) {
//        System.out.println("WINDOW IS ACTIVATED!");
//    }
//    @Override
//    public void windowDeactivated(WindowEvent e) {
//        System.out.println("WINDOW IS DE ACTIVATED!");
//    }

    public static void main(String[] args) {
//        new TASOO_42_OOPS_awt_tutorial();
        TASOO_42_OOPS_awt_tutorial awt= new TASOO_42_OOPS_awt_tutorial();
    }

}