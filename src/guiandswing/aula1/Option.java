package guiandswing.aula1;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;

public class Option {
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

       JOptionPane.showMessageDialog(f, "Meio errado isso aí");
       JOptionPane.showMessageDialog(f, "Erro menssagem", "Título", JOptionPane.WARNING_MESSAGE);
       JOptionPane.showMessageDialog(f, "Mensagem de erro", "Erro título", JOptionPane.ERROR_MESSAGE);
       JOptionPane.showMessageDialog(f, "Mensagem de erro", "Erro título", JOptionPane.PLAIN_MESSAGE);

       int opt = JOptionPane.showConfirmDialog(f, "Você entende?", "Por favor responda", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

       String [] options = {"Not sure", "Maybe", "What"};
       int op = JOptionPane.showOptionDialog(f, "Do u understand", "Please, answer", JOptionPane.YES_NO_CANCEL_OPTION,
               JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

//       Object[] possibilities = {"ham", "spam", "yam"};
//       String s = (String) JOptionPane.showInputDialog(f, "Complete the sentenceee", "Dialogo", JOptionPane.PLAIN_MESSAGE, icon,
//               possibilities, "ham");
    }
}
