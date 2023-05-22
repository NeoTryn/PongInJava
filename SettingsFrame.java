import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SettingsFrame extends JFrame {

    public ModeSettingsFrame modesFrame = new ModeSettingsFrame();

    ThemeSettingsFrame themesFrame = new ThemeSettingsFrame();

    JButton modes = new JButton("Modes");

    JButton themes = new JButton("Theme");

    JButton back = new JButton("Back");

    boolean[] isClicked = {false,false,false};

    public SettingsFrame() {
        this.setLayout(new GridLayout());

        modes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                modesFrame.setVisible(true);
                isClicked[0] = true;
            }
        });

        themes.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                themesFrame.setVisible(true);
                isClicked[1] = true;
            }
        });

        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ShapeDrawer.mf.setVisible(true);
                isClicked[2] = true;
            }
        });

        this.add(modes);
        this.add(themes);
        this.add(back);

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
        else if(isClicked[1]) {
            this.setVisible(false);
            isClicked[1] = false;
        }
        else if(isClicked[2]) {
            this.setVisible(false);
            isClicked[2] = false;
        }
    }
}
