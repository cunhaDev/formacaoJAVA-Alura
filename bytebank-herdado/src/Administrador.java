
public class Administrador extends Funcionario implements Autenticavel {// extends = herança/herdar

	private AutendicadorUtil util;
	
	public Administrador() {
		this.util = new AutendicadorUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}
	
	public double getBonificacao() {// reescrita de metodo: mesma assinatura da classe super
		return getSalario(); // super: referencia que a variavel ou metodo que vem da super classe ou Classe Mae
							 //Que é a que esta sendo herdada
	}
}
