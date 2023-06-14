package guiandswing.aula1;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Labels {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Labels::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(230, 230);
        f.setVisible(true);

        // Crie um JPanel para adicionar os JLabels
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1)); // Use um GridLayout para posicionar os componentes

        JLabel l1, l2, l3;
        ImageIcon icon = createImageIconFromURL("https://i.pinimg.com/736x/02/8f/ac/028fac670a4101695f0d9ccecd42fed6.jpg");
        l1 = new JLabel("Era pra ter uma imagem tbm carai", icon, JLabel.CENTER);
        l1.setVerticalTextPosition(JLabel.BOTTOM);
        l1.setHorizontalTextPosition(JLabel.CENTER);

        l2 = new JLabel("Só texto");

        l3 = new JLabel(icon);
        l3.setVerticalTextPosition(JLabel.EAST);

        // Adicione os JLabels ao JPanel
        panel.add(l1);
        panel.add(l2);
        panel.add(l3);

        // Adicione o JPanel ao JFrame
        f.add(panel);
    }

    private static ImageIcon createImageIconFromURL(String imageUrl) {
        try {
            URL url = new URL(imageUrl);
            Image image = Toolkit.getDefaultToolkit().getImage(url);
            return new ImageIcon(image);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
