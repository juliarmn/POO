package guiandswing.aula1;

import javax.swing.*;
import java.awt.*;

public class TF {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGui();
            }
        });
    }

    private static void createAndShowGui() {
        JFrame f = new JFrame("Lista nomes");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(340, 340);
        f.setVisible(true);
        f.setLayout(new FlowLayout());

        JTextField t1 = new JTextField(10);
        JTextField t2 = new JTextField("Enter the text");
        JTextField t3 = new JTextField("Não editável", 21);
        t3.setEditable(false);
        f.add(t1); f.add(t2); f.add(t3);

        JPasswordField pass = new JPasswordField("escondido");
        f.add(pass);

        String name = t1.getText();
        char[] password = pass.getPassword();
        System.out.println(name);
        System.out.println(password);
        }
}
