import java.awt.event.*;

public class Movement implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {


    }
    public static class MyKeyAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            switch (e.getKeyCode()){
                case KeyEvent.VK_W -> {
                    if (Game.player1Y > 0){
                        Game.player1Y -= 15;
                    }
                }
                case KeyEvent.VK_S -> {
                    if (Game.player1Y + 170 < Game.SCREEN_HEIGHT){
                        Game.player1Y += 15;
                    }
                }
                case KeyEvent.VK_UP -> {
                    if (Game.player2Y > 0){
                        Game.player2Y -= 15;
                    }
                }
                case KeyEvent.VK_DOWN -> {
                    if (Game.player2Y + 170 < Game.SCREEN_HEIGHT){
                        Game.player2Y += 15;
                    }
                }
            }
        }
    }
}
