package br.com.jpa.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.jpa.loja.modelo.Produto;
import br.com.jpa.loja.util.JpaUtil;
import br.com.jpa.lojaDAO.ProdutoDAO;

public class CadastroProduto {
	public static void main(String[] args) {
		
		EntityManager manager = JpaUtil.getEntityManager();
		
		ProdutoDAO produtoDAO = new ProdutoDAO(manager);

		Produto celular = new Produto();
		celular.setNome("Samsumg A10");
		celular.setDescricao("Ultima geração");
		celular.setPreco(new BigDecimal(800));
		
		manager.getTransaction().begin();
		produtoDAO.Cadastrar(celular);
		manager.getTransaction().commit();
		manager.close();
		
	}
}
