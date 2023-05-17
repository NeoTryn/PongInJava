import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapeDrawer extends JComponent {
    Collision collision = new Collision();
    static PongPopUpMenu menu = new PongPopUpMenu();
    Movement mv1 = new Movement();
    //for drawing instructions
    private int instTime = 0;
    // Create buttons
    JButton closeButton = new JButton("Close");
    JButton exitButton = new JButton("Exit");

    public ShapeDrawer() {
        menu.show(Game.window, Game.SCREEN_WIDTH - Game.SCREEN_WIDTH / 4 - 55, Game.SCREEN_HEIGHT - Game.SCREEN_HEIGHT/ 4 - 55);
        menu.setVisible(false);
    }

    public void paint(Graphics g)
    {

        if (Game.isRunning){
            repaint();
            Graphics2D g2 = (Graphics2D) g;
            //draws dotted line
            for (int i = 0; i < Game.SCREEN_HEIGHT; i += 64) {
                g.setColor(Color.YELLOW);
                g.fillRect(Game.SCREEN_WIDTH / 2 - 12, i, 12, 40);
            }
            if (instTime < 700){
                //draw instructions for player 1
                g.setColor(Color.YELLOW);
                g.setFont(new Font("Arial", 1, 20));
                FontMetrics insp1Metrics = getFontMetrics(g.getFont());
                g.drawString("Use 'W' and 'S' to move up and down", Game.SCREEN_WIDTH_CENTER / 2 - insp1Metrics.stringWidth("Use 'W' and 'S' to move up and down") / 2, Game.SCREEN_HEIGHT - 20);

                //draw instructions for player 2
                g.setColor(Color.YELLOW);
                g.setFont(new Font("Arial", 1, 20));
                FontMetrics insp2Metrics = getFontMetrics(g.getFont());
                g.drawString("Use 'ArrowUP' and 'arrowDOWN' to move up and down", Game.SCREEN_WIDTH - Game.SCREEN_WIDTH_CENTER / 2 - insp1Metrics.stringWidth("Use 'ArrowUP' and 'arrowDOWN' to move up and down") / 2, Game.SCREEN_HEIGHT - 20);
                //increase for drawing String
                instTime++;
            }
            if (menu.buttonsClicked[0]) {
                menu.setVisible(false);
            }
            else if(menu.buttonsClicked[1]) {
                menu.setVisible(false);
            }

            //draws circle
            g2.setColor(Color.BLACK);
            g2.fillRect(Game.ballXPos,Game.ballYPos,15,15);
            Game.ballXPos += Game.ballXInc;
            Game.ballYPos += Game.ballYInc;

            //draws player 1
            g.setColor(Color.BLACK);
            g2.fillRect(Game.player1X, Game.player1Y, 25, 120);

            //draws player 2
            g.setColor(Color.BLACK);
            g2.fillRect(Game.player2X, Game.player2Y, 25, 120);

            //draws Score player1
            g.setColor(Color.YELLOW);
            g.setFont(new Font("Arial", Font.BOLD, 55));
            g.drawString("" + Game.scoreP1 , Game.SCREEN_WIDTH / 4, 60);

            //draws Score player2
            g.setColor(Color.YELLOW);
            g.setFont(new Font("Arial", Font.BOLD, 55));
            g.drawString("" + Game.scoreP2 , Game.SCREEN_WIDTH / 2 + Game.SCREEN_WIDTH / 4, 60);

            //moves players
            mv1.movePlayers();

            //checks collision
            collision.checkCollision();


            //makes the game update every 16ms (~60 fps)
            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}