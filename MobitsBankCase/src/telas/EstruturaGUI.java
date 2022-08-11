package telas;

import classes.ContaBancaria;
import classes.ContaBancariaVIP;

public class EstruturaGUI {

	public static Login login = new Login();
	public static ContaBancaria contaNormal = new ContaBancaria();
	public static ContaBancariaVIP contaVIP = new ContaBancariaVIP();
	public static MenuNormal menuNormal = new MenuNormal();
	public static MenuVIP menuVIP = new MenuVIP();
	public static Depositar depositar = new Depositar();
	public static DepositarVIP depositarVIP = new DepositarVIP();
	public static Transferencia transferencia = new Transferencia();
	public static TransferenciaVIP transferenciaVIP = new TransferenciaVIP();
	public static Saque saque = new Saque();
	public static SaqueVIP saqueVIP = new SaqueVIP();
	public static Extrato extrato = new Extrato();
}
