package guiandswing;
import javax.swing.*;
import java.awt.event.KeyEvent;

public class Butao {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        JFrame f = new JFrame("Olá, Júlia");
        f.setSize(250,250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        JButton b1 = new JButton("OLá, gata");
        b1.setVerticalTextPosition(AbstractButton.CENTER);
        b1.setHorizontalTextPosition(AbstractButton.LEADING);
        b1.setMnemonic(KeyEvent.VK_D);

        JButton b2 = new JButton("OLá, gata 2");
        b2.setVerticalTextPosition(AbstractButton.BOTTOM);
        b2.setHorizontalTextPosition(AbstractButton.CENTER);
        b2.setMnemonic(KeyEvent.VK_E);

        JButton b3 = new JButton("Olá, gata 3");
        b3.setMnemonic(KeyEvent.VK_C);
        b3.setEnabled(true);
        f.add(b1);
        f.add(b2);
    }

}
