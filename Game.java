import javax.swing.*;
import java.awt.*;
import java.util.*;

/*
- Collision (Felix)
- Movement (Kornel) // in Progress
- Score
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

    public static boolean isRunning = true;

    public static final Set<Integer> pressedKeys = new HashSet<>();

    private Window window = new Window();

    public Game() {

    }
}
