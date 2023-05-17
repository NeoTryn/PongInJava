import javax.swing.*;
import java.awt.*;

public class shapeDrawer extends JComponent {
    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        //draws dotted line
        for (int i = 0; i < Game.SCREEN_HEIGHT; i += 50) {
            g.setColor(Color.YELLOW);
            g.fillRect(Game.SCREEN_WIDTH / 2 - 12, i, 12, 40);
        }

        repaint();
        //draws circle
        g2.setColor(Color.BLACK);
        g2.fillRect(Game.SCREEN_WIDTH/2,Game.SCREEN_HEIGHT / 2,15,15);

        //draws player 1
        g.setColor(Color.BLACK);
        g2.fillRect(Game.player1X, Game.player1Y, 25, 120);

        //draws player 2
        g.setColor(Color.BLACK);
        g2.fillRect(Game.player2X, Game.player2Y, 25, 120);

    }
}
