import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    
    public Window() {
        this.add(new shapeDrawer());
        this.pack();
        this.setSize(Game.SCREEN_WIDTH, Game.SCREEN_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setFocusable(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setAlwaysOnTop(true);
        this.getContentPane().setBackground(new Color(59, 0, 156));
    }
}
