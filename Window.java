import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    
    public Window() {
        this.add(new ShapeDrawer());
        this.pack();
        this.setSize(Game.SCREEN_WIDTH, Game.SCREEN_HEIGHT + 50);
        this.setTitle("Pong 2 Player");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.setFocusable(true);
        this.setAlwaysOnTop(true);
        this.getContentPane().setBackground(new Color(59, 0, 156));
        this.addKeyListener(new Movement.Player1KeyAdapter());
        this.addKeyListener(new Movement.Player2KeyAdapter());

        ImageIcon icon = new ImageIcon("assets//PongIcon.png");
        this.setIconImage(icon.getImage());
    }

}
