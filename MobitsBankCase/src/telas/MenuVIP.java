package telas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MenuVIP extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel menuPanel;

	public MenuVIP() {

		setTitle("Ol�!" + EstruturaGUI.contaVIP.getNomeCliente());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		menuPanel = new JPanel();
		setContentPane(menuPanel);
		menuPanel.setLayout(null);
		
		JLabel label = new JLabel("Cliente VIP");
		label.setFont(new Font("Times New Roman", Font.BOLD, 25));
		label.setBounds(185, 11, 151, 41);
		menuPanel.add(label);
		
		JButton buttonVisitaGerente = new JButton("Visita Gerente");
		buttonVisitaGerente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EstruturaGUI.contaVIP.sacar(50);
			}
		});
		buttonVisitaGerente.setBounds(160, 140, 150, 20);
		menuPanel.add(buttonVisitaGerente);
		
		JButton buttonSaque = new JButton("Saque");
		buttonSaque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EstruturaGUI.saqueVIP.setVisible(true);
			}
		});
		buttonSaque.setBounds(160, 165, 150, 20);
		menuPanel.add(buttonSaque);

		JButton buttonDepositar = new JButton("Dep�sito");
		buttonDepositar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EstruturaGUI.depositarVIP.setVisible(true);
			}
		});
		buttonDepositar.setBounds(160, 190, 150, 20);
		menuPanel.add(buttonDepositar);

		JButton buttonSaldo = new JButton("Saldo");
		buttonSaldo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(menuPanel.getComponent(0),
						"Seu saldo � R$" + EstruturaGUI.contaVIP.getSaldo());
			}
		});
		buttonSaldo.setBounds(160, 215, 150, 20);
		menuPanel.add(buttonSaldo);

		JButton buttonTrocarUsuario = new JButton("Trocar de Usu�rio");
		buttonTrocarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				EstruturaGUI.login.telaLogin.setVisible(true);
			}
		});
		
		buttonTrocarUsuario.setBounds(160, 240, 150, 20);
		menuPanel.add(buttonTrocarUsuario);
		
		JButton buttonTransferencia = new JButton("Transfer�ncia");
		buttonTransferencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EstruturaGUI.transferenciaVIP.setVisible(true);
			}
		});
		buttonTransferencia.setBounds(160, 265, 150, 20);
		menuPanel.add(buttonTransferencia);
	}
}
