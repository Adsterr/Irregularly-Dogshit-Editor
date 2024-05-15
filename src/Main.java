import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Graphics.Window;
import Files.FileManager;

public class Main {
    public static void main(String[] args) {
        JFrame frame = Window.init();

        JTextArea textArea = new JTextArea(20, 50);

        JButton saveAsButton = new JButton("Save As");
        JButton openButton = new JButton("Open");

        saveAsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileManager.SaveAs(textArea);
            }
        });

        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileManager.Open(textArea);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveAsButton);
        buttonPanel.add(openButton);

        frame.add(textArea, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        SwingUtilities.updateComponentTreeUI(frame);
        Window.printUIManagerKeys();
    }
}
