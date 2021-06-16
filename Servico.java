package curso.mj.poo;

public class Servico {
	private Cliente contratante;
	private Funcionario atendente;
	private String dataDeContrato;
	
	
	
	public Cliente getContratante() {
		return contratante;
	}
	public void setContratante(Cliente contratante) {
		this.contratante = contratante;
	}
	public Funcionario getAtendente() {
		return atendente;
	}
	public void setAtendente(Funcionario atendente) {
		this.atendente = atendente;
	}
	public String getDataDeContrato() {
		return dataDeContrato;
	}
	public void setDataDeContrato(String dataDeContrato) {
		this.dataDeContrato = dataDeContrato;
	}
	

}
