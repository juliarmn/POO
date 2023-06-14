package guiandswing.aula2;

import javax.swing.*;
import java.awt.*;

public class FirstFrame extends JFrame {
    public FirstFrame() {
        setTitle("Oi");
        setSize(230, 230);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container contentPane = getContentPane();
        contentPane.add(new MyPanel());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FirstFrame().setVisible(true);
            }
        });
    }
}
