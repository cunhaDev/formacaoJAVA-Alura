package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;

	void depositar(double valor) {
		this.saldo += valor;
		System.out.println("Voce depositou " + valor + " Reais");
	}

	public boolean sacar(double valor){
		if(valor <= saldo) {
			this.saldo -= valor;
			return true;
		}
		System.out.println("Sem saldo");
		return false;
	}
}
