
public class TesteReferncia {
	public static void main(String[] args) {
		//Polimorfismo é poder fazer a mesma coisa de formas diferente
		Funcionario g1 = new Gerente();
		Gerente g2 = new Gerente();
		
		g1.setNome("Marcos");
		String nome = g1.getNome();
		System.out.println(nome);
		
		g2.setNome("Marcos 2");
		String nome2 = g2.getNome();
		System.out.println(nome2);
	}
}
