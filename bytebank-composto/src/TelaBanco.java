
public class TelaBanco {
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Silveira");
		paulo.setCpf("222.222.222.02");
		paulo.setProfissao("Programador Java");
		
		Conta contaPaulo = new Conta(002,55556);
		Conta contaw = new Conta(002,55555);
		contaPaulo.depositar(200);
		contaPaulo.titular = paulo;
		
	}
}
