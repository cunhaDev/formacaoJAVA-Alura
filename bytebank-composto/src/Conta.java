

public class Conta {
	double saldo;
	int agencia;
	int numero;
	Cliente titular;

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
	
	public boolean transferir(double valor, Conta destino){
		if(valor <= saldo) {
			this.saldo -= valor;
			destino.depositar(valor);
			System.out.println("Foi transferido " + valor + " reais ");
			return true;
		}
		return false;
	}
}
