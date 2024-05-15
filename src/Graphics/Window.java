package Graphics;

import javax.swing.*;
import java.awt.*;
import javax.swing.UIManager;
import java.awt.Color;
// Importing new files
import java.io.File;
import java.util.*;

public class Window {
    public static JFrame init() {
        JFrame frame = new JFrame("Irregularly Dogshit Editor");
        frame.setSize(400, 360);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

            // Derive a new font with the desired size, e.g., size 14
            Font font = Font.createFont(Font.TRUETYPE_FONT, new File("Fonts/JetBrainsMonoNL-Bold.ttf")).deriveFont(14f);

            // Put the sized font into the UIManager for TextArea
            UIManager.put("TextArea.font", font);
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
    public static void printUIManagerKeys()
    {
        UIDefaults defaults = UIManager.getDefaults();
        Enumeration<Object> keysEnumeration = defaults.keys();
        ArrayList<Object> keysList = Collections.list(keysEnumeration);
        for (Object key : keysList)
        {
            System.out.println(key);
        }
    }
}