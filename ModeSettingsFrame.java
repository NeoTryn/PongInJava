import javax.swing.*;
import javax.swing.text.*;
import java.awt.*;
 master
import java.util.Objects;

 main

public class ModeSettingsFrame extends JFrame {

    JTextField inputPlayer1 = new JTextField(10);

    JTextField inputPlayer2 = new JTextField(10);
 master


    JPanel textfieldPanel = new JPanel();
    
    public static int player1WinningScore = 0;
 main

    JLabel textPlayer1 = new JLabel("Player 1 Winning score:");

    JLabel textPlayer2 = new JLabel("Player 2 Winning score:");

    public int player1WinningScore = 0;

    public int player2WinningScore = 0;


    public ModeSettingsFrame() {
 master
        this.setLayout(new GridLayout(2,2));
        inputPlayer1.setDocument(new IntegerDocumentPlayer1());
        inputPlayer2.setDocument(new IntegerDocumentPlayer2());
        this.add(textPlayer1);
        this.add(textPlayer2);
        this.add(inputPlayer1);
        this.add(inputPlayer2);

        textfieldPanel.setLayout(new FlowLayout());
        inputPlayer1.setDocument(new IntegerDocumentPlayer1());
        inputPlayer2.setDocument(new IntegerDocumentPlayer2());
        textfieldPanel.add(inputPlayer1);
        textfieldPanel.add(inputPlayer2);
        this.getContentPane().add(textfieldPanel);
 main
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
        }
    }

    public void getInts() {
        if (!Objects.equals(inputPlayer1.getText(), "")) {
            try {
                player1WinningScore = Integer.parseInt(inputPlayer1.getText());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
        if (!Objects.equals(inputPlayer2.getText(), "")) {
            try {
                player2WinningScore = Integer.parseInt(inputPlayer2.getText());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }
}