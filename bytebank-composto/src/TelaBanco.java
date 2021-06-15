
public class TelaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "222.222.222.02";
		paulo.profissao = "Programador Java";
		
		Conta contaPaulo = new Conta();
		contaPaulo.depositar(200);
		contaPaulo.titular = paulo;
		
	}
}
