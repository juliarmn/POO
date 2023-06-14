package guiandswing.aula2;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyBoard extends JPanel {
    private JButton yellowButton = new JButton("Yellow");
    private JButton redButton = new JButton("Red");
    private JButton blueButton = new JButton("Blue");

    public KeyBoard() {
        this.add(yellowButton);
        this.add(redButton);
        this.add(blueButton);

        yellowButton.addActionListener((ActionListener) this);
        redButton.addActionListener((ActionListener) this);
        blueButton.addActionListener((ActionListener) this);
    }

    class KeyBoardListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_R)
                System.out.println("Oi, Nina");
        }
    }

}
