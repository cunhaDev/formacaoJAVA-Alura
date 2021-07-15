package br.com.jpa.lojaDAO;

import javax.persistence.EntityManager;

import br.com.jpa.loja.modelo.Produto;

public class ProdutoDAO {

	private EntityManager entityManager;

	public ProdutoDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public void Cadastrar(Produto produto) {
		this.entityManager.persist(produto);
	}

}
