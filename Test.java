import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Draw String Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(400, 200));

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 400, 200);

        JTextField textField1 = new JTextField(10);
        JTextField textField2 = new JTextField(10);

        panel.add(textField1);
        panel.add(textField2);

        layeredPane.add(panel, JLayeredPane.DEFAULT_LAYER);

        JPanel stringPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Draw strings
                g.drawString("Hello", 150, 100);
                g.drawString("World!", 150, 100);
            }
        };
        stringPanel.setBounds(0, 0, 400, 200);
        layeredPane.add(stringPanel, 100);

        frame.add(layeredPane);
        frame.setVisible(true);
    }
}








