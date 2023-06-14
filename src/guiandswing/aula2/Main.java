package guiandswing.aula2;

import javax.swing.*;

import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Cores");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 250);
        frame.setVisible(true);

        addWindowListener(new EventosEmJanela());

//        MyPanel panel = new MyPanel();//       frame.add(panel);
//        JFrame frame = new JFrame("COLOR");
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        Pressionar panel = new Pressionar();
//        frame.add(panel);
//        frame.addKeyListener(panel);
//
//        frame.setSize(240, 240);
//        frame.setVisible(true);
    }
}
