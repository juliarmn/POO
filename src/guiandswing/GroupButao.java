package guiandswing;

import com.sun.source.util.Plugin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class GroupButao {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        JFrame f = new JFrame("Socorro");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(230, 230);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        JRadioButton mercurio = new JRadioButton("Mercúrio");
        mercurio.setMnemonic(KeyEvent.VK_M);
        JRadioButton venus = new JRadioButton("Venus");
        venus.setMnemonic(KeyEvent.VK_V);
        JRadioButton terra = new JRadioButton("Terra");
        terra.setMnemonic(KeyEvent.VK_T);
        JRadioButton marte = new JRadioButton("Marte");
        marte.setMnemonic(KeyEvent.VK_A);
        JRadioButton jupiter = new JRadioButton("Júpiter");
        jupiter.setMnemonic(KeyEvent.VK_J);
        JRadioButton saturno = new JRadioButton("Saturno");
        saturno.setMnemonic(KeyEvent.VK_S);
        JRadioButton urano = new JRadioButton("Urano");
        urano.setMnemonic(KeyEvent.VK_U);
        JRadioButton netuno = new JRadioButton("Netuno");
        netuno.setMnemonic(KeyEvent.VK_N);
        JRadioButton plutao = new JRadioButton("Plutão");
        plutao.setMnemonic(KeyEvent.VK_P);
        plutao.setSelected(true);

        ButtonGroup bg = new ButtonGroup();
        bg.add(mercurio);
        bg.add(venus);
        bg.add(terra);
        bg.add(marte);
        bg.add(saturno);
        bg.add(jupiter);
        bg.add(urano);
        bg.add(netuno);
        bg.add(plutao);

        JPanel radioPanel = new JPanel();
        radioPanel.add(mercurio);
        radioPanel.add(venus);
        radioPanel.add(terra);
        radioPanel.add(marte);
        radioPanel.add(saturno);
        radioPanel.add(jupiter);
        radioPanel.add(urano);
        radioPanel.add(netuno);
        radioPanel.add(plutao);

        f.add(radioPanel);
    }
}
