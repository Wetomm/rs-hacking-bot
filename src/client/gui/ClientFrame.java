
/**
Copyright (c) 2021-2021 Wetomm and rs-hacking foundation

Permission is hereby granted, free of charge, to any person obtaining
a copy of this software and associated documentation files (the
"Software"), to deal in the Software without restriction, including
without limitation the rights to use, copy, modify, merge, publish,
distribute, sublicense, and NOT sell copies of the Software, and to
permit persons to whom the Software is furnished to do so, subject to
the following conditions:

The above copyright notice and this permission notice shall be
included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

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
        JFrame jframe = new JFrame("RS-HACKING-COMMUNITY OSRS BOT");
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



