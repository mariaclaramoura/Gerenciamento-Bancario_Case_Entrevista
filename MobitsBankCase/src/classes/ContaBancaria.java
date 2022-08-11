package classes;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class ContaBancaria {

	protected String nomeCliente;
	protected int numConta;
	protected double saldo;
	protected String senha;
	protected String tipoCliente;
	public List<String> extratoLista = new ArrayList<String>();

	public ContaBancaria() {
		this.nomeCliente = "Maria da Silvinha";
		this.numConta = 11100;
		this.saldo = 5000;
		this.tipoCliente = "Normal";
		this.senha = "1234";
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double depositar(double deposito) {
		if (deposito > 0) {
			saldo = saldo + deposito;
			extratoLista.add("Depósito feito no valor de R$" + deposito + "| " + LocalDateTime.now());
			return deposito;
		}
		return 0;
	}

	public double sacar(double saque) {
		if (saque > 0 && saque <= saldo) {
			saldo = saldo - saque;
			extratoLista.add("Saque feito no valor de R$" + saque + "| " + LocalDateTime.now());
			return saque;
		}
		return 0;
	}

	public void transferencia(ContaBancaria outraConta, double valorTransferencia) {
		if (valorTransferencia <= 1000) {
			saldo = saldo - valorTransferencia - 8;
			outraConta.setSaldo(outraConta.getSaldo() + valorTransferencia);
			extratoLista.add("Transferência feita no valor de R$" + valorTransferencia + "| " + LocalDateTime.now());
		}
	}

	public List<String> getExtratoLista() {
		return extratoLista;
	}

	public void setExtratoLista(List<String> extratoLista) {
		this.extratoLista = extratoLista;
	}

	public int tamanhoLista() {
		return extratoLista.size();
	}

}
