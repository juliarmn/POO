package guiandswing;

import javax.swing.*;
import java.awt.*;

public class CaixaDeCombo {
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

        String[] pets = {"Passarito", "Cachurros", "Gatin", "Porquitu", "Peixin glup"};

        JComboBox petCombo = new JComboBox(pets);
        petCombo.setSelectedIndex(2);

        f.add(petCombo);

        String petName = (String)petCombo.getSelectedItem();
    }


}
