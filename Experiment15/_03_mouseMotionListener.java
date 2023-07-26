package Experiment15;

import javax.swing.*;
import java.awt.event.*;

public class _03_mouseMotionListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MouseMotionListener Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JLabel label = new JLabel("Move the mouse!");
        label.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
               label.setText(String.valueOf( e.getLocationOnScreen()));
            }
        });

        frame.add(label);
        frame.setVisible(true);
    }
}
