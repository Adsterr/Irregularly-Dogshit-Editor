package Graphics;

import javax.swing.*;

public class Window {
    public static JFrame init() {
        JFrame frame = new JFrame("Irregularly Dogshit Editor");
        frame.setSize(400, 360);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
            UIManager.put("nimbusBase", new java.awt.Color(18, 30, 49));
            UIManager.put("nimbusBlueGrey", new java.awt.Color(128, 128, 128));
            UIManager.put("control", new java.awt.Color(30, 30, 30));
            UIManager.put("text", new java.awt.Color(200, 200, 200));
            UIManager.put("nimbusLightBackground", new java.awt.Color(30, 30, 30));
            UIManager.put("nimbusFocus", new java.awt.Color(100, 100, 100));
        } catch (Exception e) {
            e.printStackTrace();
        }

        frame.setVisible(true);
        return frame;
    }
}
