package guiandswing.aula1;

import javax.swing.*;
import java.awt.*;

public class Painel {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGui();
            }
        });
    }

    private static void createAndShowGui() {
        JFrame f = new JFrame("Combo box dos animais");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(340, 340);
        f.setVisible(true);
        f.setLayout(new FlowLayout());

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();

        p1.setBackground(Color.pink);p1.setPreferredSize(new Dimension(100, 100));

        p2.setBackground(Color.MAGENTA);p2.setPreferredSize(new Dimension(200, 200));

        p2.setBorder(BorderFactory.createTitledBorder("Olá"));

        f.add(p1); f.add(p2);
    }
}
