package Files;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Save {
    public static void SavePrompt(JTextArea mainTextArea) {
        JFileChooser fileChooser = new JFileChooser();

        int result = fileChooser.showSaveDialog(null); // Show save dialog

        if (result == JFileChooser.APPROVE_OPTION) { // If user selects a file
            File selectedFile = fileChooser.getSelectedFile(); // Get selected file

            try {
                FileWriter writer = new FileWriter(selectedFile);
                writer.write(mainTextArea.getText());
                writer.close();
                System.out.println("File saved: " + selectedFile.getAbsolutePath());
            } catch (IOException ex) {
                System.out.println("An error occurred.");
            }
        }
    }
}