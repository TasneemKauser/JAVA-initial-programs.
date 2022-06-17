package com.company;
import java.awt.*;
class MyyFrame extends Frame {
    MyyFrame() {
        this.setVisible(true);
        this.setSize(500, 500);
        this.setTitle("rattaiah");
        this.setBackground(Color.red);
        this.setLayout(new GridLayout(4, 4));
        for (int i = 0; i < 12; i++) {
            Button b = new Button("" + i);
            this.add(b);
        }
    }
}
public class TASOO_49_OOPS_AWT_GRIDLAYOT {
    public static void main(String[] args) {
        MyyFrame obj = new MyyFrame();
    }
}