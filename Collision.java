import java.awt.event.KeyEvent;
import java.util.Random;

public class Collision extends Game{
    boolean ballSpawnLeft = false;
    Random ballYIncRan2 = new Random();
    public void checkCollision(){
        //checks if ball touches upper border
        if (ballYPos < 0){
            ballYInc *= -1;
        }
        //checks if ball touches lower border
        //prenk
        if (ballYPos > SCREEN_HEIGHT){
            ballYInc *= -1;
        }
        //checks if ball touches right border
        if (ballXPos > SCREEN_WIDTH){
            scoreP1++;
            ballSpawnLeft = true;
            resetBall();
        }
        //checks if ball touches left border
        if (ballXPos < 0){
            scoreP2++;
            resetBall();
        }
        //checks if ball touches player 1 or player 2
        for (int i = 0; i < 120; i++) {
            for (int j = 0; j < 25; j++) {
                if (ballXPos == player1X + j && ballYPos == player1Y + i){
                    if (ballXInc < 0){
                        ballXInc -= 1;
                    }
                    else{
                        ballXInc += 1;
                    }
                    ballXInc *= -1;
                    ballYInc = ballYIncRan2.nextInt(1, 10);
                }
                if (ballXPos == player2X + j && ballYPos == player2Y + i){
                    if (ballXInc < 0){
                        ballXInc -= 1;
                    }
                    else{
                        ballXInc += 1;
                    }
                    ballXInc *= -1;
                    ballYInc = ballYIncRan2.nextInt(1, 10);
                }
            }
        }
    }
    public void resetBall(){
        ballXPos = SCREEN_WIDTH_CENTER - 12;
        ballYPos = SCREEN_HEIGHT_CENTER - 40;
        ballYInc = ballYIncRan2.nextInt(1, 5);
        ballXInc = 5;
        if (ballSpawnLeft){
            ballXInc *= -1;
            ballSpawnLeft = false;
        }
    }
}
