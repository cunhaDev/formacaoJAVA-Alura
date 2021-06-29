
public class ContaCorrente extends Conta{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override //Override para Sobrescrever um metodo
	public boolean saca(double valor) {
		return super.saca(valor + 0.2);
	}

}
