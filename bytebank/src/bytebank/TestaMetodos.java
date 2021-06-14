package bytebank;

public class TestaMetodos {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.saldo = 1000;
		
		contaDoPaulo.depositar(10);
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.sacar(200);
		System.out.println(contaDoPaulo.saldo);
		
		contaDaMarcela.transferir(500, contaDoPaulo);
		System.out.println("Paulo " + contaDoPaulo.saldo);
		System.out.println("Marcela " + contaDaMarcela.saldo);
	}
}
