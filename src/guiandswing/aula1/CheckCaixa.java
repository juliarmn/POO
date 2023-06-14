package guiandswing.aula1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class CheckCaixa {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI () {
        JFrame f = new JFrame("OLha ela lá");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(450, 450);
        f.setVisible(true);
        f.setLayout(new FlowLayout());

        JCheckBox pinkButton = new JCheckBox("Pink is the best collor");
        pinkButton.setMnemonic(KeyEvent.VK_P);
        pinkButton.setSelected(true);

        JCheckBox redButton = new JCheckBox("Red is the best collor");
        redButton.setMnemonic(KeyEvent.VK_R);
        redButton.setSelected(true);

        JCheckBox blueButton = new JCheckBox("Blue is the best collor");
        blueButton.setMnemonic(KeyEvent.VK_B);
        blueButton.setSelected(true);

        f.add(pinkButton);
        f.add(redButton);
        f.add(blueButton);
    }
}
