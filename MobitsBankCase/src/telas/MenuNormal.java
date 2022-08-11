package telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MenuNormal extends JFrame {
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		private JPanel menuPanel;
		
		public MenuNormal() {

			setTitle("Olá!" + EstruturaGUI.contaNormal.getNomeCliente());
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 500, 350);
			menuPanel = new JPanel();
			setContentPane(menuPanel);
			menuPanel.setLayout(null);
			
			JLabel label = new JLabel("Cliente");
			label.setFont(new Font("Times New Roman", Font.BOLD, 25));
			label.setBounds(185, 11, 150, 41);
			menuPanel.add(label);
			
			JButton buttonExtrato = new JButton("Extrato");
			buttonExtrato.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					EstruturaGUI.extrato.setVisible(true);
				}
			});
			buttonExtrato.setBounds(160, 115, 150, 20);
			menuPanel.add(buttonExtrato);
			
			JButton buttonSaque = new JButton("Saque");
			buttonSaque.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					EstruturaGUI.saque.setVisible(true);
				}
			});
			buttonSaque.setBounds(160, 140, 150, 20);
			menuPanel.add(buttonSaque);
			
			JButton buttonDepositar = new JButton("Depósito");
			buttonDepositar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					EstruturaGUI.depositar.setVisible(true);
				}
			});
			buttonDepositar.setBounds(160, 165, 150, 20);
			menuPanel.add(buttonDepositar);
			
			JButton buttonSaldo = new JButton("Saldo");
			buttonSaldo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(menuPanel.getComponent(0), "Seu saldo é R$" 
				+ EstruturaGUI.contaNormal.getSaldo());
				}
			});
			buttonSaldo.setBounds(160, 190, 150, 20);
			menuPanel.add(buttonSaldo);
			
			JButton buttonTrocarUsuario = new JButton("Trocar de Usuário");
			buttonTrocarUsuario.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					EstruturaGUI.login.telaLogin.setVisible(true);
				}
			});
			buttonTrocarUsuario.setBounds(160, 215, 150, 20);
			menuPanel.add(buttonTrocarUsuario);
			
			JButton buttonTransferencia = new JButton("Transferência");
			buttonTransferencia.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					EstruturaGUI.transferencia.setVisible(true);
				}
			});
			buttonTransferencia.setBounds(160, 240, 150, 20);
			menuPanel.add(buttonTransferencia);
			
		}
}
