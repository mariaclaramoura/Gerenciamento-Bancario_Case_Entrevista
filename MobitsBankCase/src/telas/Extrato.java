package telas;

import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import classes.ContaBancaria;

public class Extrato extends JFrame {

	private JPanel extrato;
	

	public Extrato() {
		setTitle("Extrato");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 649, 474);
		extrato = new JPanel();
		setContentPane(extrato);
		extrato.setLayout(null);
		
		
	}
}
