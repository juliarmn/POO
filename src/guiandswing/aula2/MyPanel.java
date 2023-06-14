package guiandswing.aula2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel  extends JPanel implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source == yellowButton) {
            setBackground(Color.YELLOW);
        } else if (source == redButton) {
            setBackground(Color.RED);
        } else {
            setBackground(Color.BLUE);
        }
    }

    private JButton yellowButton = new JButton("Yellow");
    private JButton redButton = new JButton("Red");
    private JButton blueButton = new JButton("Blue");

    public MyPanel() {
        this.add(yellowButton);
        this.add(redButton);
        this.add(blueButton);

        yellowButton.addActionListener(this);
        redButton.addActionListener(this);
        blueButton.addActionListener(this);

//        yellowButton.addActionListener(new FocusListener());
//        redButton.addActionListener(new FocusListener());
//        blueButton.addActionListener(new FocusListener());
    }
}
