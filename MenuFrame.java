import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuFrame extends JFrame {

    JButton Continue = new JButton("Continue");

    JButton Settings = new JButton("Settings");

    JButton Quit = new JButton("Quit");

    boolean[] isClicked = {false,false};

    public MenuFrame() {

        this.setLayout(new GridLayout());

        Continue.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[0] = true;
            }
        });

        Settings.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[1] = true;
            }
        });

        Quit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });

        this.add(Continue);
        this.add(Settings);
        this.add(Quit);

        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                e.consume();
            }
        });

        this.setSize(300,100);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);
        this.setVisible(false);
    }

    public void handleInputs() {
        if (isClicked[0]) {
            this.setVisible(false);
            isClicked[0] = false;
        }

        if(isClicked[1]) {
            this.setVisible(false);
            isClicked[1] = false;
        }

    }
}
