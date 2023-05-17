import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class shapeDrawer extends JComponent {
    public void paint(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        //draws circle
        g2.setColor(Color.BLACK);
        g2.fillRect(Game.SCREEN_WIDTH/2,Game.SCREEN_HEIGHT / 2,10,10);

        //draws player 1
        g.setColor(Color.BLACK);
        g2.fillRect(20, Game.SCREEN_HEIGHT /  2 - 60, 25, 120);

        //draws player 2
        g.setColor(Color.BLACK);
        g2.fillRect(Game.SCREEN_WIDTH - 45, Game.SCREEN_HEIGHT /  2 - 60, 25, 120);
    }
}
