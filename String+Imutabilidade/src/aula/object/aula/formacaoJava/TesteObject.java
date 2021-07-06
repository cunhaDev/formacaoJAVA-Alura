package aula.object.aula.formacaoJava;

public class TesteObject {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("a");
		System.out.println(2);
		println("");
		println(2);
		println();
	
	}
	
	//Object : toString, hashcode() e equals()
	
	//Sobrecarga: mesmo nome do metodo com parametros diferentes
	static void println() {}
	static void println(int a) {}
	static void println(boolean bool) {}
	
	// Object : tipo Referencia do Java, classe Mae do Java
	static void println(Object obj) {}
}
