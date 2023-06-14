package guiandswing.aula2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mouse extends JFrame{
    private JLabel position;
    public Mouse() {
        setTitle("OI, Nina");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        position = new JLabel("Position: ");
        add(position, BorderLayout.SOUTH);

        addMouseListener(new MouseListener());
        addMouseListener((java.awt.event.MouseListener) new MouseMotionListener());
        setSize(350, 350);

    }

    static class MouseListener extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            int count = e.getClickCount();
            int button = e.getButton();
            System.out.println(x);
            System.out.println(y);
            System.out.println(count);
        }
    }

    static class MouseMotionListener extends MouseMotionAdapter {
        public void mouseMoved(MouseEvent e) {
            int x  = e.getX();
            int y  = e.getY();
            System.out.println(x + " " + y);
        }
    }
}
