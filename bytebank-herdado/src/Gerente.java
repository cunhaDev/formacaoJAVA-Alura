
public class Gerente extends Funcionario{// extends = heran�a/herdar

	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha ==  senha) {
			return true;
		} else {
			return false;
		}
	}

	public double getBonificacao() {// reescrita de metodo: mesma assinatura da classe super
		return super.salario; // super: referencia que a variavel vem da super classe ou Classe Mae
							 //Que � a que esta sendo herdada
	}
}
