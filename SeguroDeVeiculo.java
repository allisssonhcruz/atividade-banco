package curso.mj.poo;

public class SeguroDeVeiculo extends Servico{
	private String veiculo;
	private double valorDoSeguroDoVeiculo;
	private double franquia;
	
	
	public String getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}
	public double getValorDoSeguroDoVeiculo() {
		return valorDoSeguroDoVeiculo;
	}
	public void setValorDoSeguroDoVeiculo(double valorDoSeguroDoVeiculo) {
		this.valorDoSeguroDoVeiculo = valorDoSeguroDoVeiculo;
	}
	public double getFranquia() {
		return franquia;
	}
	public void setFranquia(double franquia) {
		this.franquia = franquia;
	}
	

}
