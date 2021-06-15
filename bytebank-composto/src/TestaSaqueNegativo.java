
public class TestaSaqueNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.depositar(100);
		System.out.println(conta.sacar(500));
		
		System.out.println(conta.pegaSaldo());
	}
}
