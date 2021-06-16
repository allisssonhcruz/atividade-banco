package curso.mj.poo;

public class ContaPoupanca extends Conta {
	private int diaDoAniversario;
	
	ContaPoupanca(Cliente cliente, int dia){
		super(cliente);
		this.diaDoAniversario = dia;
	}

	public int getDiaDoAniversario() {
		return diaDoAniversario;
	}
	@Override
	public void imprimeExtratoCompleto() {
		 System.out.println("Extrato da conta poupança:");
		 System.out.println("Saldo "+ this.saldoAtual());
		 System.out.println("Aniversario "+ this.getDiaDoAniversario());
		 System.out.println("Juros " + (this.saldoAtual() * 0.5) * this.saldoAtual());
		 System.out.println("Extrato da conta poupança:");
		 
	}	
}
