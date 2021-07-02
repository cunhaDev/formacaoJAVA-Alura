
public class TestaTributaveis {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguroDeVida = new SeguroDeVida();

		CalculadorDeImposto calculoImposto = new CalculadorDeImposto();
		calculoImposto.registra(cc);
		calculoImposto.registra(seguroDeVida);
		
		System.out.println(calculoImposto.getTotalImposto());
	}
}
