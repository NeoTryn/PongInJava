import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class shapeDrawer extends JComponent {
    public void paint(Graphics g)
    {
        if (Game.isRunning){
            repaint();
            Graphics2D g2 = (Graphics2D) g;
            //draws dotted line
            for (int i = 0; i < Game.SCREEN_HEIGHT; i += 60) {
                g.setColor(Color.YELLOW);
                g.fillRect(Game.SCREEN_WIDTH / 2 - 12, i, 12, 40);
            }

            //draws circle
            g2.setColor(Color.BLACK);
            g2.fillRect(Game.SCREEN_WIDTH/2,Game.SCREEN_HEIGHT / 2,15,15);

            if (Game.pressedKeys.contains(KeyEvent.VK_W) && Game.player1Y > 0) {
                Game.player1Y -= 15;
            }
            if (Game.pressedKeys.contains(KeyEvent.VK_S) && Game.player1Y + 170 < Game.SCREEN_HEIGHT) {
                Game.player1Y += 15;
            }
            if (Game.pressedKeys.contains(KeyEvent.VK_UP) && Game.player2Y > 0) {
                Game.player2Y -= 15;
            }
            if (Game.pressedKeys.contains(KeyEvent.VK_DOWN) && Game.player2Y + 170 < Game.SCREEN_HEIGHT) {
                Game.player2Y += 15;
            }

            //draws player 1
            g.setColor(Color.BLACK);
            g2.fillRect(Game.player1X, Game.player1Y, 25, 120);

            //draws player 2
            g.setColor(Color.BLACK);
            g2.fillRect(Game.player2X, Game.player2Y, 25, 120);

            try {
                Thread.sleep(25);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
