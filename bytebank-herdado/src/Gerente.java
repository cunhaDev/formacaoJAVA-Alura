
public class Gerente extends Funcionario implements Autenticavel{// extends = heran�a/herdar

	private int senha;

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
	
	public double getBonificacao() {// reescrita de metodo: mesma assinatura da classe super
		return getSalario(); // super: referencia que a variavel ou metodo que vem da super classe ou Classe Mae
							 //Que � a que esta sendo herdada
	}
}
