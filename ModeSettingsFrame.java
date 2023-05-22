import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;

public class ModeSettingsFrame extends JFrame {

    JTextField inputPlayer1 = new JTextField(10);

    JTextField inputPlayer2 = new JTextField(10);

    JPanel textfieldPanel = new JPanel();
    
    public static int player1WinningScore = 0;

    public static int player2WinningScore = 0;


    public ModeSettingsFrame() {
        textfieldPanel.setLayout(new FlowLayout());
        inputPlayer1.setDocument(new IntegerDocumentPlayer1());
        inputPlayer2.setDocument(new IntegerDocumentPlayer2());
        textfieldPanel.add(inputPlayer1);
        textfieldPanel.add(inputPlayer2);
        this.getContentPane().add(textfieldPanel);
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
