package guiandswing;

import javax.swing.*;
import java.awt.*;

public class Layout {
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

        FlowLayout flow = new FlowLayout();
        flow.setAlignment(FlowLayout.RIGHT);
        f.setLayout(flow);

        JButton leftButton = new JButton("Left");
        JButton centerButton = new JButton("Center");
        JButton rightButton = new JButton("Right");

        f.add(leftButton);
        f.add(centerButton);
        f.add(rightButton);

        BorderLayout b = new BorderLayout(4,4);
        f.setLayout(b);
        String[] names = {"North", "South"
        , "East", "West", "Center"};
        JButton[] buttons = new JButton[names.length];

        for (int count = 0; count < names.length; count ++) {
            buttons[count] = new JButton(names[count]);
        }

        f.add(buttons[0], BorderLayout.NORTH);
        f.add(buttons[1], BorderLayout.SOUTH);
        f.add(buttons[2], BorderLayout.EAST);
        f.add(buttons[3], BorderLayout.WEST);
        f.add(buttons[4], BorderLayout.CENTER);
    }
}
