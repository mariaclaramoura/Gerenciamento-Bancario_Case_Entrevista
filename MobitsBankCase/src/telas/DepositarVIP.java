package telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DepositarVIP extends JFrame{
	
	private JPanel deposito;
	private JTextField caixaDeposito;
	private JButton confirmarDeposito;
	
	public DepositarVIP() {
		setTitle("Depositar");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		deposito = new JPanel();
		setBackground(Color.DARK_GRAY);
		setContentPane(deposito);
		deposito.setLayout(null);
		
		caixaDeposito = new JTextField();
		caixaDeposito.setBounds(160, 121, 110, 20);
		deposito.add(caixaDeposito);
		
		JButton confirmarDeposito = new JButton("Depositar");
		confirmarDeposito.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String valorDepositoString = caixaDeposito.getText();
				double valorDepositoDouble = Double.parseDouble(valorDepositoString);
				EstruturaGUI.contaVIP.depositar(valorDepositoDouble);
				caixaDeposito.setText("");
				setVisible(false);
				}
		});
		confirmarDeposito.setBounds(185, 190, 89, 23);
		deposito.add(confirmarDeposito);
	}
}
