package telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {

	public JFrame telaLogin;
	private JPanel panel;
	private JTextField numConta;
	private JPasswordField senha;

	public Login() {
		inicializar();
	}

	public void inicializar() {

		telaLogin = new JFrame();
		telaLogin.setBounds(100, 100, 450, 300);
		telaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaLogin.setTitle("Banco Mobits");
		telaLogin.getContentPane().setLayout(null);

		panel = new JPanel();
		panel.setSize(450, 100);
		panel.setBackground(Color.LIGHT_GRAY);
		telaLogin.getContentPane().add(panel);

		JLabel label = new JLabel("Login");
		label.setFont(new Font("Times New Roman", Font.BOLD, 25));
		label.setBounds(185, 11, 151, 41);
		telaLogin.getContentPane().add(label);
		panel.add(label);

		numConta = new JTextField("Número da Conta");
		numConta.setBounds(160, 121, 110, 20);
		telaLogin.getContentPane().add(numConta);
		numConta.setColumns(4);

		senha = new JPasswordField("Senha");
		senha.setBounds(160, 161, 110, 20);
		telaLogin.getContentPane().add(senha);
		numConta.setColumns(5);

		JButton buttonLogIn = new JButton("Entrar");
		buttonLogIn.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String nmConta = numConta.getText();;
				String senhaConta = senha.getText();;

				int nmContaInt = Integer.parseInt(nmConta);
				if ((nmContaInt == EstruturaGUI.contaNormal.getNumConta() && 
						senhaConta.equals(EstruturaGUI.contaNormal.getSenha()))) {
					numConta.setText("");
					senha.setText("");
					telaLogin.setVisible(false);
					EstruturaGUI.menuNormal.setVisible(true);
				} else if ((nmContaInt == EstruturaGUI.contaVIP.getNumConta() && 
						senhaConta.equals(EstruturaGUI.contaVIP.getSenha()))) {
						numConta.setText("");
						senha.setText("");
						telaLogin.setVisible(false);
						EstruturaGUI.menuVIP.setVisible(true);
				}
			}
		});
		buttonLogIn.setBounds(185, 190, 89, 23);
		telaLogin.getContentPane().add(buttonLogIn);
	}
}
