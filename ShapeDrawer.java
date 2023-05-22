import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeDrawer extends JComponent {
    Collision collision = new Collision();
    Movement mv1 = new Movement();

    public static MenuFrame mf = new MenuFrame();
    public static GameOver gameOver = new GameOver();

    //for drawing instructions
    private int instTime = 0;
    private int instBlink = 0;

    public ShapeDrawer() {
        // Code zum Erstellen und Starten des Timers
        Timer timer = new Timer(Game.DELAY, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateBallPosition(getGraphics());
                repaint();
            }
        });
        timer.start();
    }


    public void paint(Graphics g)
    {
        if (Game.isRunning){
            Graphics2D g2 = (Graphics2D) g;

            //draws dotted line
            for (int i = 0; i < Game.SCREEN_HEIGHT; i += 64) {
                g.setColor(Color.YELLOW);
                g.fillRect(Game.SCREEN_WIDTH / 2 - 12, i, 12, 40);
            }

            if (instTime < 400 && instBlink % 30 != 0 && instBlink % 30 != 1 && instBlink % 30 != 2 && instBlink % 30 != 3 && instBlink % 30 != 4 && instBlink % 30 != 5){
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
            }
            if (!Game.isRestarted) {
                Game.ballXPos += Game.ballXInc;
                Game.ballYPos += Game.ballYInc;
                // Zeichne den Ball
                if (ThemeSettingsFrame.isClicked[3]) {
                    g.setColor(Color.RED);
                    g.fillRect(Game.ballXPos, Game.ballYPos, 15, 15);
                }
                if (ThemeSettingsFrame.isClicked[7]) {
                    g.setColor(Color.GREEN);
                    g.fillRect(Game.ballXPos, Game.ballYPos, 15, 15);
                }
                if (ThemeSettingsFrame.isClicked[11]) {
                    g.setColor(Color.BLUE);
                    g.fillRect(Game.ballXPos, Game.ballYPos, 15, 15);
                }
                if (ThemeSettingsFrame.isClicked[15]) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(Game.ballXPos, Game.ballYPos, 15, 15);
                }
                if (ThemeSettingsFrame.isClicked[19]) {
                    g.setColor(new Color(59,0,156));
                    g.fillRect(Game.ballXPos, Game.ballYPos, 15, 15);
                }
                if (ThemeSettingsFrame.isClicked[23]) {
                    g.setColor(Color.BLACK);
                    g.fillRect(Game.ballXPos, Game.ballYPos, 15, 15);
                }
                if (ThemeSettingsFrame.isClicked[27]) {
                    g.setColor(Color.WHITE);
                    g.fillRect(Game.ballXPos, Game.ballYPos, 15, 15);
                }
                if(!ThemeSettingsFrame.isClicked[3] && !ThemeSettingsFrame.isClicked[7] && !ThemeSettingsFrame.isClicked[11] && !ThemeSettingsFrame.isClicked[15] && !ThemeSettingsFrame.isClicked[19] && !ThemeSettingsFrame.isClicked[23] && !ThemeSettingsFrame.isClicked[27]) {
                    g.setColor(Color.BLACK);
                    g.fillRect(Game.ballXPos, Game.ballYPos, 15, 15);
                }
            }
            else {
                Game.ballXPos += Game.ballXInc;
                Game.ballYPos += Game.ballYInc;
                // Zeichne den Ball an der neuen Position
                if (ThemeSettingsFrame.isClicked[3]) {
                    g.setColor(Color.RED);
                    g.fillRect(Game.ballXPos, Game.ballYPos, 15, 15);
                }
                if (ThemeSettingsFrame.isClicked[7]) {
                    g.setColor(Color.GREEN);
                    g.fillRect(Game.ballXPos, Game.ballYPos, 15, 15);
                }
                if (ThemeSettingsFrame.isClicked[11]) {
                    g.setColor(Color.BLUE);
                    g.fillRect(Game.ballXPos, Game.ballYPos, 15, 15);
                }
                if (ThemeSettingsFrame.isClicked[15]) {
                    g.setColor(Color.YELLOW);
                    g.fillRect(Game.ballXPos, Game.ballYPos, 15, 15);
                }
                if (ThemeSettingsFrame.isClicked[19]) {
                    g.setColor(new Color(59,0,156));
                    g.fillRect(Game.ballXPos, Game.ballYPos, 15, 15);
                }
                if (ThemeSettingsFrame.isClicked[23]) {
                    g.setColor(Color.BLACK);
                    g.fillRect(Game.ballXPos, Game.ballYPos, 15, 15);
                }
                if (ThemeSettingsFrame.isClicked[27]) {
                    g.setColor(Color.WHITE);
                    g.fillRect(Game.ballXPos, Game.ballYPos, 15, 15);
                }
                if(!ThemeSettingsFrame.isClicked[3] && !ThemeSettingsFrame.isClicked[7] && !ThemeSettingsFrame.isClicked[11] && !ThemeSettingsFrame.isClicked[15] && !ThemeSettingsFrame.isClicked[19] && !ThemeSettingsFrame.isClicked[23] && !ThemeSettingsFrame.isClicked[27]) {
                    g.setColor(Color.BLACK);
                    g.fillRect(Game.ballXPos, Game.ballYPos, 15, 15);
                }
            }

            if (ThemeSettingsFrame.isClicked[0]) {

            }
            if (ThemeSettingsFrame.isClicked[1]) {

            }
            if (ThemeSettingsFrame.isClicked[2]) {

            }
            if (ThemeSettingsFrame.isClicked[4]) {

            }
            if (ThemeSettingsFrame.isClicked[5]) {

            }
            if (ThemeSettingsFrame.isClicked[6]) {

            }
            if (ThemeSettingsFrame.isClicked[8]) {

            }
            if (ThemeSettingsFrame.isClicked[9]) {

            }
            if (ThemeSettingsFrame.isClicked[10]) {

            }
            if (ThemeSettingsFrame.isClicked[12]) {

            }
            if (ThemeSettingsFrame.isClicked[13]) {

            }
            if (ThemeSettingsFrame.isClicked[14]) {

            }
            if (ThemeSettingsFrame.isClicked[16]) {

            }
            if (ThemeSettingsFrame.isClicked[17]) {

            }
            if (ThemeSettingsFrame.isClicked[18]) {

            }
            if (ThemeSettingsFrame.isClicked[20]) {

            }
            if (ThemeSettingsFrame.isClicked[21]) {

            }
            if (ThemeSettingsFrame.isClicked[22]) {

            }
            if (ThemeSettingsFrame.isClicked[24]) {

            }
            if (ThemeSettingsFrame.isClicked[25]) {

            }
            if (ThemeSettingsFrame.isClicked[26]) {

            }

            //draws player 1
            g.setColor(Color.BLACK);
            g.fillRect(Game.player1X, Game.player1Y, 25, 120);

            //draws player 2
            g.setColor(Color.BLACK);
            g.fillRect(Game.player2X, Game.player2Y, 25, 120);

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
            if (Game.isRestarted) {
                updateBallPosition(g);
            }

            //handles inputs for the menu
            mf.handleInputs();

            mf.sF.handleInputs();

            //increase for drawing String
            instTime++;
            instBlink++;

            //checks if GameOver should be activated
            if (Game.scoreP1 == Game.finalScorePlayer1){
                Game.player1Won = true;
                gameOver.setVisible(true);
                Game.openedRestart = true;
            }
            if (Game.scoreP2 == Game.finalScorePlayer2){
                Game.player2Won = true;
                gameOver.setVisible(true);
                Game.openedRestart = true;
            }
            if (Game.openedRestart){
                Game.openedRestart = false;
                gameOver.handleInputsGameOver();
            }
        }
    }

    public void updateBallPosition(Graphics g) {
        if (Game.isRestarted) {
            g.setColor(Color.BLACK);
            g.fillRect(Game.ballXPos,Game.ballYPos,15,15);

            // Überprüfen der Ballposition und Reaktion auf Kollisionen
            collision.checkCollision();
        }
    }
}
