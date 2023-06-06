package aula_13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Foco  extends JPanel {

    private JButton yellowButton = new JButton("Yellow");
    private JButton redButton = new JButton("Red");
    private JButton blueButton = new JButton("Blue");

    class FocusListener extends FocusAdapter {
        public void focusGained(FocusEvent e) {
            Object source = e.getComponent();
            if(source == yellowButton) {
                setBackground(Color.YELLOW);
            } else if (source == redButton) {
                setBackground(Color.RED);
            } else {
                setBackground(Color.BLUE);
            }
        }

    }

    public Foco() {
        this.add(yellowButton);
        this.add(redButton);
        this.add(blueButton);

//        yellowButton.addActionListener(this);
//        redButton.addActionListener(this);
//        blueButton.addActionListener(this);

        yellowButton.addFocusListener(new FocusListener());
        redButton.addFocusListener(new FocusListener());
        blueButton.addFocusListener(new FocusListener());
    }

}
