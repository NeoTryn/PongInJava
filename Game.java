import java.util.*;

/*
- Collision // Done
- Movement // Done
- Score // Done
- UI // In progress
- Screens (Game over, Start, Menu) //Menu in Progress
- Themes
- (Pick-Ups)
- Physics // in progress
 */

public class Game {
    public static final int SCREEN_WIDTH = 1280;
    public static final int SCREEN_WIDTH_CENTER = 640;
    public static final int SCREEN_HEIGHT = 720;
    public static final int SCREEN_HEIGHT_CENTER = 360;

    public static int player1X = 20;
    public static int player1Y = 260;
    public static int player2X = 1215;
    public static int player2Y = 260;

    public static int ballXPos = SCREEN_WIDTH/2 - 12;
    public static int ballYPos = SCREEN_HEIGHT / 2 - 40;
    public static int ballXInc = 5;
    static Random ballYIncRan1 = new Random();
    public static int ballYInc = ballYIncRan1.nextInt(1, 3);


    public static int scoreP1 = 0;
    public static int scoreP2 = 0;

    public static boolean isRunning = true;

    public static final Set<Integer> pressedKeys = new HashSet<>();
    public static Window window = new Window();
}
