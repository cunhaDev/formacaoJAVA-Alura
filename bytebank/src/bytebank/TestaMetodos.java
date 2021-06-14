package bytebank;

public class TestaMetodos {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		
		contaDoPaulo.depositar(10);
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.sacar(200);
		System.out.println(contaDoPaulo.saldo);
	}
}
