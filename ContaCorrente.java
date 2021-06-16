package curso.mj.poo;

public class ContaCorrente extends Conta{
	
	private int diasUsado;
	private double limite;
	
	ContaCorrente(Cliente cliente, double limite){
		super(cliente);
		this.limite = limite;
	}

	public int getDiasUsado() {
		return diasUsado;
	}

	public void setDiasUsado(int diasUsado) {
		this.diasUsado = diasUsado;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void imprimeExtratoCompleto() {
		 System.out.println("Extrato da conta corrente:");
		 System.out.println("Saldo "+ this.saldoAtual());
		 System.out.println("limite"+ this.getLimite());
		 System.out.println("Juros " + this.saldoAtual() * ( this.getDiasUsado()*0.8));
		 System.out.println("Saldo disponivel: " + this.saldoAtual()+ this.getLimite());
	}

}
