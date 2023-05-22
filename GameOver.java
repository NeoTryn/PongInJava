import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameOver extends JFrame{
    JButton restart = new JButton("Restart");

    JButton quitGame = new JButton("Quit Game");

    boolean[] isClickedGameOver = {false,false};

    public GameOver() {
        this.setLayout(new GridLayout(1, 0));

        quitGame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                quitGame.setVisible(true);
                isClickedGameOver[0] = true;
            }
        });

        restart.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                restart.setVisible(true);
                isClickedGameOver[1] = true;
            }
        });

        this.add(restart);
        this.add(quitGame);

        this.addMouseListener(new MouseAdapter() {
        @Override
            public void mouseClicked(MouseEvent e){
            e.consume();
        }
        });

        this.setTitle("Game Over!");
        this.setSize(300,100);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.setVisible(false);
    }

    public void handleInputsGameOver(){
        if (isClickedGameOver[0]){
            this.setVisible(false);
            System.exit(0);
        }
        if (isClickedGameOver[1]){
            restartGame();
        }
    }

    public void restartGame(){
        dispose();
        Game.ballYPos = Game.SCREEN_HEIGHT_CENTER;
        Game.ballXPos = Game.SCREEN_WIDTH_CENTER;
        Game.ballXInc = 5;
        Game.ballYInc = 0;
        Game.scoreP1 = 0;
        Game.scoreP2 = 0;
        Game.isRestarted = true;
        isClickedGameOver[1] = false;
    }
}
