package Experiment15;

import javax.swing.*;
import java.awt.event.*;

public class _02_mouseListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MouseListener Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JLabel label = new JLabel("Click or Hover over me!");
        label.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(frame, "Mouse Clicked!");
            }

            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse Entered!");
            }

            public void mouseExited(MouseEvent e) {
                label.setText("Mouse Exited!");
            }
        });

        frame.add(label);
        frame.setVisible(true);
    }
}
