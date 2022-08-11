package classes;

import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

public class ContaBancariaVIP extends ContaBancaria {
	
	Timer timer = new Timer();

	public ContaBancariaVIP() {
		this.nomeCliente = "Brian de Souza";
		this.numConta = 22200;
		this.saldo = 20000;
		this.tipoCliente = "VIP";
		this.senha = "4321";
	}

	public void transferencia(ContaBancaria outraConta, double valorTransferencia) {
		saldo = saldo - valorTransferencia - 0.008*valorTransferencia;
		outraConta.setSaldo(outraConta.getSaldo() + valorTransferencia);
		extratoLista.add("Transferência feita no valor de R$" + valorTransferencia + "| " + LocalDateTime.now());
		
	}
	
	public double sacar(double saque) {
		if (saque > 0) {
			saldo = saldo - saque;
			extratoLista.add("Saque feito no valor de R$" + saque + "| " + LocalDateTime.now());
			
			if(saldo < 0) {
				TimerTask tarefa = new TimerTask() {
					public void run() {
						try {
							saldo = saldo - saldo*0.001;
						} catch (Exception e){
							e.printStackTrace();
						}
					}
				};
				timer.scheduleAtFixedRate(tarefa, 60000, 60000);
			}
			
			return saque;
		}
		
		return 0;
	}
	
}
