import java.awt.event.*;
import java.awt.event.KeyEvent;
public class Movement implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    public static class Player1KeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            Game.pressedKeys.add(e.getKeyCode());
        }
        @Override
        public void keyReleased(KeyEvent e){
            Game.pressedKeys.remove(e.getKeyCode());
        }
    }
    public static class Player2KeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            Game.pressedKeys.add(e.getKeyCode());
        }
        @Override
        public void keyReleased(KeyEvent e){
            Game.pressedKeys.remove(e.getKeyCode());
        }
    }
    public void movePlayers(){
        //Makes players move
        if (Game.pressedKeys.contains(KeyEvent.VK_W) && Game.player1Y > 0) {
            Game.player1Y -= 9;
        }
        if (Game.pressedKeys.contains(KeyEvent.VK_S) && Game.player1Y + 125 < Game.SCREEN_HEIGHT) {
            Game.player1Y += 9;
        }
        if (Game.pressedKeys.contains(KeyEvent.VK_UP) && Game.player2Y > 0) {
            Game.player2Y -= 9;
        }
        if (Game.pressedKeys.contains(KeyEvent.VK_DOWN) && Game.player2Y + 125 < Game.SCREEN_HEIGHT) {
            Game.player2Y += 9;
        }
        if(Game.pressedKeys.contains(KeyEvent.VK_ESCAPE)) {
            ShapeDrawer.menu.setVisible(true);
        }
    }


}