import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ThemeSettingsFrame extends JFrame {

    public static boolean isClicked[] = {false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false};
    public ThemeSettingsFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        // Create File menu
        JMenu backgroundMenu = new JMenu("Background");
        JMenu playerMenu = new JMenu("Player");
        JMenu netMenu = new JMenu("Net");
        JMenu ballMenu = new JMenu("Ball");

        JMenuItem redMenuItem1 = new JMenuItem("Red");
        JMenuItem greenMenuItem1 = new JMenuItem("Green");
        JMenuItem blueMenuItem1 = new JMenuItem("Blue");
        JMenuItem yellowMenuItem1 = new JMenuItem("Yellow");
        JMenuItem purpleMenuItem1 = new JMenuItem("Purple");
        JMenuItem blackMenuItem1 = new JMenuItem("Black");
        JMenuItem whiteMenuItem1 = new JMenuItem("White");

        JMenuItem redMenuItem2 = new JMenuItem("Red");
        JMenuItem greenMenuItem2 = new JMenuItem("Green");
        JMenuItem blueMenuItem2 = new JMenuItem("Blue");
        JMenuItem yellowMenuItem2 = new JMenuItem("Yellow");
        JMenuItem purpleMenuItem2 = new JMenuItem("Purple");
        JMenuItem blackMenuItem2 = new JMenuItem("Black");
        JMenuItem whiteMenuItem2 = new JMenuItem("White");

        JMenuItem redMenuItem3 = new JMenuItem("Red");
        JMenuItem greenMenuItem3 = new JMenuItem("Green");
        JMenuItem blueMenuItem3 = new JMenuItem("Blue");
        JMenuItem yellowMenuItem3 = new JMenuItem("Yellow");
        JMenuItem purpleMenuItem3 = new JMenuItem("Purple");
        JMenuItem blackMenuItem3 = new JMenuItem("Black");
        JMenuItem whiteMenuItem3 = new JMenuItem("White");

        JMenuItem redMenuItem4 = new JMenuItem("Red");
        JMenuItem greenMenuItem4 = new JMenuItem("Green");
        JMenuItem blueMenuItem4 = new JMenuItem("Blue");
        JMenuItem yellowMenuItem4 = new JMenuItem("Yellow");
        JMenuItem purpleMenuItem4 = new JMenuItem("Purple");
        JMenuItem blackMenuItem4 = new JMenuItem("Black");
        JMenuItem whiteMenuItem4 = new JMenuItem("White");

        redMenuItem1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[0] = true;
            }
        });

        redMenuItem2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[1] = true;
            }
        });

        redMenuItem3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[2] = true;
            }
        });

        redMenuItem4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[3] = true;
        }
    });

        greenMenuItem1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[4] = true;
            }
        });

        greenMenuItem2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[5] = true;
            }
        });

        greenMenuItem3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[6] = true;
            }
        });

        greenMenuItem4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[7] = true;
            }
        });

        blueMenuItem1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[8] = true;
            }
        });

        blueMenuItem2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[9] = true;
            }
        });

        blueMenuItem3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[10] = true;
            }
        });

        blueMenuItem4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[11] = true;
            }
        });

        yellowMenuItem1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[12] = true;
            }
        });

        yellowMenuItem2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[13] = true;
            }
        });

        yellowMenuItem3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[14] = true;
            }
        });

        yellowMenuItem4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[15] = true;
            }
        });

        purpleMenuItem1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[16] = true;
            }
        });

        purpleMenuItem2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[17] = true;
            }
        });

        purpleMenuItem3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[18] = true;
            }
        });

        purpleMenuItem4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[19] = true;
            }
        });

        blackMenuItem1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[20] = true;
            }
        });

        blackMenuItem2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[21] = true;
            }
        });

        blackMenuItem3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[22] = true;
            }
        });

        blackMenuItem4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[23] = true;
            }
        });

        whiteMenuItem1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[24] = true;
            }
        });

        whiteMenuItem2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[25] = true;
            }
        });

        whiteMenuItem3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[26] = true;
            }
        });

        whiteMenuItem4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                isClicked[27] = true;
            }
        });

        backgroundMenu.add(redMenuItem1);
        backgroundMenu.add(greenMenuItem1);
        backgroundMenu.add(blueMenuItem1);
        backgroundMenu.add(yellowMenuItem1);
        backgroundMenu.add(greenMenuItem1);
        backgroundMenu.add(purpleMenuItem1);
        backgroundMenu.add(blackMenuItem1);
        backgroundMenu.add(whiteMenuItem1);

        playerMenu.add(redMenuItem2);
        playerMenu.add(greenMenuItem2);
        playerMenu.add(blueMenuItem2);
        playerMenu.add(yellowMenuItem2);
        playerMenu.add(greenMenuItem2);
        playerMenu.add(purpleMenuItem2);
        playerMenu.add(blackMenuItem2);
        playerMenu.add(whiteMenuItem2);

        netMenu.add(redMenuItem3);
        netMenu.add(greenMenuItem3);
        netMenu.add(blueMenuItem3);
        netMenu.add(yellowMenuItem3);
        netMenu.add(greenMenuItem3);
        netMenu.add(purpleMenuItem3);
        netMenu.add(blackMenuItem3);
        netMenu.add(whiteMenuItem3);

        ballMenu.add(redMenuItem4);
        ballMenu.add(greenMenuItem4);
        ballMenu.add(blueMenuItem4);
        ballMenu.add(yellowMenuItem4);
        ballMenu.add(greenMenuItem4);
        ballMenu.add(purpleMenuItem4);
        ballMenu.add(blackMenuItem4);
        ballMenu.add(whiteMenuItem4);

        // Create Edi

        // Add menus to the menu bar
        menuBar.add(backgroundMenu);
        menuBar.add(playerMenu);
        menuBar.add(netMenu);
        menuBar.add(ballMenu);

        // Set the menu bar on the this
        this.setJMenuBar(menuBar);
        this.pack();
        this.setVisible(false);
        this.setSize(300,100);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(true);

        this.setVisible(false);
    }
}