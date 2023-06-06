package guiandswing;

import javax.swing.*;
import java.awt.*;

public class Listinha {
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

        DefaultListModel listModel = new DefaultListModel();
        listModel.addElement("Amanda");
        listModel.addElement("Júlia");
        listModel.addElement("Daphne");
        listModel.addElement("Luiza");

        JList lista = new JList(listModel);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lista.setLayoutOrientation(JList.VERTICAL_WRAP);

        f.add(lista);

        JScrollPane s = new JScrollPane(lista);
        f.add(s);

        int index = lista.getSelectedIndex();
        listModel.remove(index);

        System.out.println("Tamanho da lista " +listModel.getSize());

    }
    }
