package br.com.jpa.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.jpa.loja.modelo.Categoria;
import br.com.jpa.loja.modelo.Produto;
import br.com.jpa.loja.util.JpaUtil;
import br.com.jpa.lojaDAO.ProdutoDAO;

public class CadastroProduto {
	public static void main(String[] args) {
		
		EntityManager manager = JpaUtil.getEntityManager();
		
		ProdutoDAO produtoDAO = new ProdutoDAO(manager);

		Produto celular = new Produto("Samsumg A10", "Samsumg A10", new BigDecimal(800), Categoria.CELULARES);
		
		manager.getTransaction().begin();
		produtoDAO.Cadastrar(celular);
		manager.getTransaction().commit();
		manager.close();
		
	}
}
