import java.awt.*;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;

import java.io.File;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        Frame frame = new JFrame("Hello World Swing Example");
        frame.setLayout(new FlowLayout());
        frame.setSize(400, 360);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);


        JButton saveButton = new JButton("Save");
        saveButton.setBounds(100, 100, 100, 100);

        JTextArea textArea = new JTextArea(50, 50);

        int tabSize = textArea.getTabSize();
        tabSize = 4;
        textArea.setTabSize(tabSize);

        saveButton.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                try {
                    File file = new File("/test.txt");
                    if (file.createNewFile()) {
                        System.out.println("File created: " + file.getName());
                    } else {
                        System.out.println("File already exists.");
                    }
                } catch (IOException ex) {
                    System.out.println("An error occurred.");
                }

                try {
                    FileWriter writer = new FileWriter("test.txt");
                    writer.write(textArea.getText());
                    writer.close();
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException exx) {
                    System.out.println("An error occurred.");
                }
            }
        });

        frame.add(saveButton);
        frame.add(textArea);
        frame.setVisible(true);
    }
}
