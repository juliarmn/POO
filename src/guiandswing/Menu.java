package guiandswing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class Menu {
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
        f.setSize(250, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu1 = new JMenu("Um menu");
        menu1.setMnemonic(KeyEvent.VK_A);
        menuBar.add(menu1);
        JMenuItem menuItem= new JMenuItem("Um texto apenas", KeyEvent.VK_T);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
        menu1.add(menuItem);
        menuItem = new JMenuItem("Texto e ícone");
        menuItem.setMnemonic(KeyEvent.VK_B);
        menu1.add(menuItem);
        menu1.addSeparator();

        ButtonGroup group = new ButtonGroup();

        JRadioButtonMenuItem rbMenuItem = new JRadioButtonMenuItem("A radio button meu item");
        rbMenuItem.setSelected(true);
        group.add(rbMenuItem);
        menu1.add(rbMenuItem);
        rbMenuItem = new JRadioButtonMenuItem("Another one");
        group.add(rbMenuItem);
        menu1.add(rbMenuItem);
        menu1.addSeparator();

        JCheckBoxMenuItem cbMenuItem = new JCheckBoxMenuItem("A check box menu Item");
        cbMenuItem.setMnemonic(KeyEvent.VK_C);

        JMenu subMenu = new JMenu("Um submenu");
        subMenu.setMnemonic(KeyEvent.VK_S);
        menuItem = new JMenuItem("Um item do submenu");
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
        subMenu.add(menuItem);
        menuItem = new JMenuItem("Outro item");
        subMenu.add(menuItem);
        menu1.add(subMenu);

        JMenu menu2 = new JMenu("Outro menu");
        menu2.setMnemonic(KeyEvent.VK_N);
        menuBar.add(menu2);
        f.setJMenuBar(menuBar);
    }
    }
