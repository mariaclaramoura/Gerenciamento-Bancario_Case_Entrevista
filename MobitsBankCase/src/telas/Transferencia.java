package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Transferencia extends JFrame {

	// *classe de transferencia da conta normal

	private JPanel transferencia;
	private JTextField caixaContaNum;
	private JTextField caixaValorTransf;
	private JButton confirmarTransf;

	public Transferencia() {

		setTitle("Transferência");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		transferencia = new JPanel();
		setContentPane(transferencia);
		transferencia.setLayout(null);

		caixaContaNum = new JTextField("Numero da conta");
		caixaContaNum.setBounds(160, 95, 110, 20);
		transferencia.add(caixaContaNum);

		caixaValorTransf = new JTextField("Valor da transferência");
		caixaValorTransf.setBounds(160, 125, 110, 20);
		transferencia.add(caixaValorTransf);

		confirmarTransf = new JButton("Transferir");
		confirmarTransf.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {

				String numConta = caixaContaNum.getText();
				int numContaInt = Integer.parseInt(numConta);
				
				String valorTransferString = caixaValorTransf.getText();
				double valorTransferDouble = Double.parseDouble(valorTransferString);
				if (numContaInt == EstruturaGUI.contaVIP.getNumConta()) {
					EstruturaGUI.contaNormal.transferencia(EstruturaGUI.contaVIP, valorTransferDouble);
					caixaValorTransf.setText("");
					caixaContaNum.setText("");
				} else {
					JOptionPane.showMessageDialog(transferencia.getComponent(0), 
							"Conta não existe ou digitou errado ou está transferindo para você mesmo");
				}
			}
		});
		confirmarTransf.setBounds(185, 190, 89, 23);
		transferencia.add(confirmarTransf);
	}
}
