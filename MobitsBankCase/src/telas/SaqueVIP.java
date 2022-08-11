package telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SaqueVIP extends JFrame {
	
	private JPanel saque;
	private JTextField caixaSaque;
	private JButton confirmarSaque;
	
	public SaqueVIP() {
		
		setTitle("Sacar (VIP)");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		saque = new JPanel();
		setBackground(Color.DARK_GRAY);
		setContentPane(saque);
		saque.setLayout(null);
		
		caixaSaque = new JTextField();
		caixaSaque.setBounds(160, 121, 110, 20);
		saque.add(caixaSaque);
		
		JButton confirmarSaque = new JButton("Saque");
		confirmarSaque.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String valorSaqueString = caixaSaque.getText();
				double valorSaqueDouble = Double.parseDouble(valorSaqueString);
				EstruturaGUI.contaVIP.sacar(valorSaqueDouble);
				caixaSaque.setText("");
				setVisible(false);
				}
		});
		confirmarSaque.setBounds(185, 190, 89, 23);
		saque.add(confirmarSaque);
	}

}
