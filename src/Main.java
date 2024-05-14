import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import Graphics.Window;
import Files.Save;

public class Main {
    public static void main(String[] args) {
        JFrame frame = Window.init();

        JTextArea textArea = new JTextArea(20, 50);

        JButton saveButton = new JButton("Save");

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Save.SavePrompt(textArea);
            }
        });

        

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);

        frame.add(textArea, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);
    }
}