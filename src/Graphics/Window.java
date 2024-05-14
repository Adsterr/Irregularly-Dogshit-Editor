package Graphics;

import javax.swing.*;

public class Window {
    public static JFrame init() {
        JFrame frame = new JFrame("Irregularly Dogshit Editor");
        frame.setSize(400, 360);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        frame.setVisible(true);
        return frame;
    }
}
