import java.awt.event.*;

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
}
