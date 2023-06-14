package guiandswing.aula2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class LoginScreen extends JFrame {
    private JPanel panel = new JPanel();
    private JLabel usuario = new JLabel("Usuário");
    private JLabel senha = new JLabel("Senha");
    private JTextField usuarioTF = new JTextField(10);
    private JPasswordField senhaTF = new JPasswordField(10);
    private JButton login;

    public LoginScreen(){
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200, 200);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        login = new JButton("login");

        panel.add(usuario);
        panel.add(usuarioTF);
        panel.add(senha);
        panel.add(senhaTF);
        panel.add(new JLabel());

        add(panel);
        login.addActionListener(new LoginListener());
        senhaTF.addKeyListener(new loginKeyListener());
        panel.add(login, BorderLayout.SOUTH);
    }

    class LoginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String usuarioNome = usuarioTF.getText();
            char[] pass = senhaTF.getPassword();
            StringBuilder sen = new StringBuilder();
            for (char a : pass)
                sen.append(a);
            if (usuarioNome.equals("Julia") && sen.toString().equals("123"))
                JOptionPane.showMessageDialog(new LoginScreen(), "Logou", "Sucesso", JOptionPane.NO_OPTION);
            else
                JOptionPane.showMessageDialog(new LoginScreen(), "Erro menssagem", "Título", JOptionPane.WARNING_MESSAGE);
        }
    }

    class loginKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                String usuarioNome = usuarioTF.getText();
                char[] pass = senhaTF.getPassword();
                StringBuilder sen = new StringBuilder();
                for (char a : pass)
                    sen.append(a);
                if (usuarioNome.equals("Julia") && sen.toString().equals("123"))
                    System.out.println("Usuario Logado");
                else
                    System.out.println("Erro ao logar");
            }
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginScreen().setVisible(true);
            }
        });
    }
}
