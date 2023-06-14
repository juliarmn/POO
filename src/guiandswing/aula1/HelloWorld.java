package guiandswing.aula1;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
public class HelloWorld {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI(){
        JFrame f = new JFrame("Hello World");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(450,450);
        f.setVisible(true);
    }
}
