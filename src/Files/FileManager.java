package Files;

import javax.swing.*;
import java.io.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileManager {
    public static void Save(JTextArea mainTextArea) {
        JFileChooser fileChooser = new JFileChooser();

        int result = fileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

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

    public static void Open(JTextArea mainTextArea) {
        JFileChooser fileChooser = new JFileChooser();

        int result = fileChooser.showSaveDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            try {
                Scanner scanner = new Scanner(selectedFile);
                while (scanner.hasNextLine()) {
                    String data = scanner.nextLine();
                    mainTextArea.append(data + "\n");
                }
                scanner.close();
            } catch (IOException ex) {
                System.out.println("An error occurred.");
            }
        }
    }
}