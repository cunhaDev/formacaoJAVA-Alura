package br.com.jpa.lojaDAO;

import java.util.List;

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

	public void atualizar(Produto produto) {
		this.entityManager.merge(produto);
	}

	public void remover(Produto produto) {
		produto = entityManager.merge(produto);
		this.entityManager.remove(produto);
	}
	
	public Produto buscarPorId(Long id) {
		return entityManager.find(Produto.class, id);
	}
	
	public List<Produto> listar(){
		String JPQL = "SELECT p FROM Produto p";
		return entityManager.createQuery(JPQL, Produto.class).getResultList();
	}

}
