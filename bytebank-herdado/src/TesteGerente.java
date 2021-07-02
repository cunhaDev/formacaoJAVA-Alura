
public class TesteGerente {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Nic Gerente");
		g1.setCpf("0006546352411-52");
		g1.setSalario(10000.00);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
//		g1.setSenha(1111);
//		boolean autenticou = g1.autentica(1111);
//		System.out.println(autenticou);
	}
}
