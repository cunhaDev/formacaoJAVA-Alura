
public class TesteReferncia {
	public static void main(String[] args) {
		Funcionario g1 = new Gerente();
		Funcionario f = new Funcionario();
		Funcionario ev = new EditorVideo();
		
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
		ev.setSalario(2500.0);
		f.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f);
		controle.registra(ev);
		
		System.out.println(controle.getSoma());
	}
}
