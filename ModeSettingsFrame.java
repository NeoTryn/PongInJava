import javax.swing.*;
import javax.swing.text.*;

public class ModeSettingsFrame extends JFrame {

    JTextField input = new JTextField(10);

    public static int player1WinningScore = 0;

    public static int player2WinningScore = 0;


    public ModeSettingsFrame() {
        input.setDocument(new IntegerDocumentPlayer1());
        this.getContentPane().add(input);
        this.pack();
        this.setVisible(false);
        this.setSize(300,100);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.setVisible(false);
    }
    public static class IntegerDocumentPlayer1 extends PlainDocument {
        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            if (str == null)
                return;

            try {
                Integer.parseInt(str);
                super.insertString(offs, str, a);
            } catch (NumberFormatException e) {
                // Ignorieren, wenn keine Zahl eingegeben wurde

            }
            player1WinningScore = Integer.parseInt(str);
        }
    }

    public static class IntegerDocumentPlayer2 extends PlainDocument {
        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            if (str == null)
                return;

            try {
                Integer.parseInt(str);
                super.insertString(offs, str, a);
            } catch (NumberFormatException e) {
                // Ignorieren, wenn keine Zahl eingegeben wurde
            }
            player2WinningScore = Integer.parseInt(str);
        }
    }
}
