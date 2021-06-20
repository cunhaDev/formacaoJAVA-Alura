
public class TesteFuncionario {
	public static void main(String[] args) {
		Funcionario mateus = new Funcionario();
		
		mateus.setNome("Mateus Cunha");
		mateus.setCpf("0001101055-05");
		mateus.setSalario(3000.00);
		
		System.out.println(mateus.getNome());
		System.out.println(mateus.getBonificacao());
	}
}
