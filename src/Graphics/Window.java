package Graphics;

import javax.swing.*;
import java.awt.*;
import javax.swing.UIManager;
import java.awt.Color;


public class Window {
    public static JFrame init() {
        JFrame frame = new JFrame("Irregularly Dogshit Editor");
        frame.setSize(400, 360);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            UIManager.put("TextArea.font", new Font("Arial", Font.PLAIN, 14));
            UIManager.put("TextArea.foreground", Color.WHITE);
            UIManager.put("TextArea.caretForeground", Color.WHITE);
            UIManager.put("TextArea.margin", new java.awt.Insets(20, 20, 20, 20));
            UIManager.put("Panel.background", new Color(30, 30, 30));
            UIManager.put("Button.background", new Color(100, 100, 100));
            UIManager.put("TextArea.background", new Color(50, 50, 50));


        } catch (Exception e) {
            e.printStackTrace();
        }

        SwingUtilities.updateComponentTreeUI(frame);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        return frame;
    }
}