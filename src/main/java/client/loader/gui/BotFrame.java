package client.loader.gui;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

/**
 * BonBom
 * Date: 4.2.2018
 * Time: 16.25
 */

public class BotFrame extends JFrame {
    Applet applet;
    JPanel panel;

    public BotFrame(Applet applet) {
        super("RS-HACKING OSRS BOT");
        this.applet = applet;
    }


    public void init() {
        this.setSize(new Dimension(800, 600));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon("./snake.png").getImage());
        JMenu menu, menu1, menu2, menu3;
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Start");
        menu1 = new JMenu("Pause");
        menu2 = new JMenu("Stop");
        menu3 = new JMenu("Debug");
        mb.add(menu);
        mb.add(menu1);
        mb.add(menu2);
        mb.add(menu3);

        this.setJMenuBar(mb);
        this.getIconImage();

        applet.setSize(new Dimension(800, 600));

        panel = new JPanel();
        panel.add(applet);
        this.add(panel);

        this.pack();
        this.setVisible(true);
    }

}
