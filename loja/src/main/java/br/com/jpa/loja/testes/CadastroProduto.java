package br.com.jpa.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.jpa.loja.modelo.Produto;

public class CadastroProduto {
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
		EntityManager manager = factory.createEntityManager();

		Produto celular = new Produto();
		celular.setNome("Samsumg A10");
		celular.setDescricao("Ultima geração");
		celular.setPreco(new BigDecimal(800));
		
		manager.getTransaction().begin();
		manager.persist(celular);
		manager.getTransaction().commit();
		manager.close();
		
	}
}
