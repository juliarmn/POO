package guiandswing.aula1;

import javax.swing.*;
import java.awt.*;

public class Tabela {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGui();
            }
        });
    }

    private static void createAndShowGui() {
        JFrame f2 = new JFrame("Dois  frames");
        f2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f2.setSize(340, 340);
        f2.setVisible(true);
        f2.setLayout(new FlowLayout());

        String[] colNames = {"Nome", "Cor", "Animal", "Idade"};
        Object[][] data = {
                {"Amanda", "roxo", "gato", (Integer)19},
                {"Júlia", "rosa", "passarito", 21}};

        JTable table = new JTable(data, colNames);
        table.setPreferredScrollableViewportSize(new Dimension(450, 450));
        table.setFillsViewportHeight(true);

        JScrollPane scroll = new JScrollPane(table);
        f2.add(scroll);
    }
}
