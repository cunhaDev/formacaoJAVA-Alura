
public class Administrador extends FuncionarioAutenticavel {// extends = heran�a/herdar

	public double getBonificacao() {// reescrita de metodo: mesma assinatura da classe super
		return getSalario(); // super: referencia que a variavel ou metodo que vem da super classe ou Classe Mae
							 //Que � a que esta sendo herdada
	}
}
