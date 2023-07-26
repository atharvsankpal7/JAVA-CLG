package Experiment15;

import javax.swing.*;
import java.awt.event.*;

public class _01_actionEvent {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionEvent Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Click Me!");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button clicked!");
            }
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
