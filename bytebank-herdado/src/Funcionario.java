//nao pode instansciar esta classe, apenas herdar
public abstract class Funcionario {

	private String nome;
	private String cpf;
	//protected double salario;// protected deixa publico para os filhos
	private double salario;
	
	//metodo sem scopo na super apenas nas sub classes
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
