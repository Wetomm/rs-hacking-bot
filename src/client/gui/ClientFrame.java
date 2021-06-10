package gui;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;

public class ClientFrame extends JFrame {
    Applet frame;

    JLabel playLabel = new JLabel(new ImageIcon("./play.png"));

    public static void main(String[] args) {
        JMenu menu, menu1, menu2;
        JMenuBar mb = new JMenuBar();
        menu = new JMenu("Start");
        menu1 = new JMenu("Pause");
        menu2 = new JMenu("Stop");
        mb.add(menu);
        mb.add(menu1);
        mb.add(menu2);
        JFrame jframe = new JFrame("WetomBot");
        jframe.setPreferredSize(new Dimension(800, 600));
        jframe.setJMenuBar(mb);
        jframe.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jframe.pack();
        Icon icon = new ImageIcon("C:\\Users\\User\\Desktop\\rs-hacking-bot-07\\resources");
        jframe.setVisible(true);
    }

    Applet applet;
    JPanel panel;

    public ClientFrame(Applet applet) {
        this.applet = applet;
    }

    public void init() {
        applet.setSize(new Dimension(800, 600));

        panel = new JPanel();
        panel.add(applet);
        this.add(panel);

        this.pack();
        this.setVisible(true);
    }
}



