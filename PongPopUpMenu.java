import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PongPopUpMenu extends JPopupMenu {
    public final JButton Continue = new JButton("continue");
    public final JButton Settings = new JButton("settings");
    public final JButton Quit = new JButton("quit");

    public boolean[] buttonsClicked = {false,false};

    public PongPopUpMenu() {
        // Add MouseListener to the Close button
        Continue.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                buttonsClicked[0] = true;
            }
        });

        // Add MouseListener to the Exit button
        Quit.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.exit(0);
            }
        });
        Settings.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                buttonsClicked[1] = true;
            }
        });

        // Add buttons to the popup menu
        this.add(Continue);
        this.add(Settings);
        this.add(Quit);

        // Add MouseListener to the popup menu itself
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // Consume the event to prevent the popup menu from closing
                e.consume();
            }
        });
    }
}
