package guiandswing.aula2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Pressionar extends JPanel implements KeyListener {
//    JButton botao = new JButton("Cores");

//    public Pressionar() {
//        botao.addKeyLispublic Pressionar() {
//        botao.addKeyListener(this);
//        this.add(botao);
//    }tener(this);
//        this.add(botao);
//    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == KeyEvent.VK_R) {
            this.setBackground(Color.red);
        } else if (e.getKeyCode() == KeyEvent.VK_B) {
            this.setBackground(Color.BLUE);
        } else  if (e.getKeyCode() == KeyEvent.VK_Y){
            this.setBackground(Color.YELLOW);
        }else  if (e.getKeyCode() == KeyEvent.VK_P){
            this.setBackground(Color.PINK);
        }else  if (e.getKeyCode() == KeyEvent.VK_M){
            this.setBackground(Color.MAGENTA);
        }else  if (e.getKeyCode() == KeyEvent.VK_G){
            this.setBackground(Color.GREEN);
        }else  if (e.getKeyCode() == KeyEvent.VK_O){
            this.setBackground(Color.ORANGE);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
