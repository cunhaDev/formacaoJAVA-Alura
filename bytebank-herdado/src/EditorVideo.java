
public class EditorVideo extends Funcionario{// extends = heran�a/herdar

	public double getBonificacao() {// reescrita de metodo: mesma assinatura da classe super
		return super.getBonificacao() + 100; // super: referencia que a variavel ou metodo que vem da super classe ou Classe Mae
							 //Que � a que esta sendo herdada
	}
}
