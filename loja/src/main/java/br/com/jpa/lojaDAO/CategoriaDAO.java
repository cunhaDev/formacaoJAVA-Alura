package br.com.jpa.lojaDAO;

import javax.persistence.EntityManager;
import br.com.jpa.loja.modelo.Categoria;

public class CategoriaDAO {

	private EntityManager entityManager;

	public CategoriaDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public void Cadastrar(Categoria categoria) {
		this.entityManager.persist(categoria);
	}

}
