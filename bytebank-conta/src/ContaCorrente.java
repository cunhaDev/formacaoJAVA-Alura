
public class ContaCorrente extends Conta implements Tributavel{

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override //Override para Sobrescrever um metodo
	public boolean saca(double valor) {
		return super.saca(valor + 0.2);
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}

}
