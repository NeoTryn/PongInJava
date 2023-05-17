import javax.swing.*;
import java.awt.*;
import java.util.*;

/*
- Collision (Felix)
- Movement (Kornel) // DONE
- Score // DONE
- UI
- Screens (Game over, Start, Menu)
- Themes
- (Pick-Ups)
- Physics
 */

public class Game {

    public static final int SCREEN_WIDTH = 1280;
    public static final int SCREEN_HEIGHT = 720;

    public static int player1X = 20 ;
    public static int player1Y = 260;
    public static int player2X = 1215;
    public static int player2Y = 260;
    
    public static int scoreP1 = 0;
    public static int scoreP2 = 0;

    public static boolean isRunning = true;

    public static final Set<Integer> pressedKeys = new HashSet<>();

    private Window window = new Window();

    public Game() {

    }
}
