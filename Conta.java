package curso.mj.poo;

// Atributos sempre tem que ser privados. Caso deseja modifica-los é necessario usar metodos

abstract class Conta {
	protected int numConta;
	protected double saldo;
	protected Agencia agencia;
	protected Cliente titular;

	Conta(Cliente cliente) {
		this.titular = cliente;
		this.saldo = 0;

	}

	protected void setNumero(int num) {
		this.numConta = num;
	}

	protected int getNumero() {
		return this.numConta;
	}

	protected void setAgencia(Agencia agen) {
		this.agencia = agen;
	}

	protected Agencia getAgencia() {
		return this.agencia;
	}

	protected void setTitular(Cliente til) {
		this.titular = til;
	}

	protected Cliente getTitular() {
		return this.titular;
	}

	protected void deposita(double valor) {
		this.saldo += valor;
	}

	protected boolean saca(double valor) {
		if (this.saldo < valor) {
			return false;

		} else {
			this.saldo += valor;
			return true;
		}

	}

	double saldoAtual() {

		return this.saldo;
	}

	public boolean transferir(Conta destino, double valor) {
		boolean sacou = this.saca(valor);
		if (sacou == false) {
			return false;
		} else {
			destino.deposita(valor);
			return true;
		}

	}

	public abstract void imprimeExtratoCompleto() {
		// TODO Auto-generated method stub
		
	}
}
