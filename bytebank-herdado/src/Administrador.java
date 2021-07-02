
public class Administrador extends FuncionarioAutenticavel {// extends = herança/herdar

	public double getBonificacao() {// reescrita de metodo: mesma assinatura da classe super
		return getSalario(); // super: referencia que a variavel ou metodo que vem da super classe ou Classe Mae
							 //Que é a que esta sendo herdada
	}
}
