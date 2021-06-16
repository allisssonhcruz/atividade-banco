package curso.mj.poo;

public class Teste {
	public static void main(String args[]) {
		Cliente cli = new Cliente();
		cli.setNome("Manoel Jailton");
		
		ContaPoupanca cp = new ContaPoupanca(cli,30);
		cp.deposita(100);
		Conta cc = new ContaCorrente(cli,12);
		
		cp.imprimeExtratoCompleto();
		
		System.out.println("--------------------");
		cc.imprimeExtratoCompleto();
	}	
}
