
public class TestaSaqueNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta(0001, 5528714);
		conta.depositar(100);
		System.out.println(conta.sacar(500));
		
		System.out.println(conta.pegaSaldo());
	}
}
