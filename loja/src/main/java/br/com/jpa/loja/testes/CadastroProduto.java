package br.com.jpa.loja.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.jpa.loja.modelo.Categoria;
import br.com.jpa.loja.modelo.Produto;
import br.com.jpa.loja.util.JpaUtil;
import br.com.jpa.lojaDAO.CategoriaDAO;
import br.com.jpa.lojaDAO.ProdutoDAO;

public class CadastroProduto {
	public static void main(String[] args) {
		CadastrarProduto();
		
		BuscandoPorId();
		
		ListandoProdutos();
	}

	private static void ListandoProdutos() {
		EntityManager manager = JpaUtil.getEntityManager();
		ProdutoDAO produtoDAO = new ProdutoDAO(manager);
		List<Produto> listaProdutos = produtoDAO.listar();
		listaProdutos.stream().forEach(produto -> {
			System.out.println(produto.getNome());
		});
	}

	private static void BuscandoPorId() {
		EntityManager manager = JpaUtil.getEntityManager();
		ProdutoDAO produtoDAO = new ProdutoDAO(manager);
		Produto p = produtoDAO.buscarPorId(1l);
		System.out.println(p.getNome());
	}

	private static void CadastrarProduto() {
		EntityManager manager = JpaUtil.getEntityManager();
		ProdutoDAO produtoDAO = new ProdutoDAO(manager);
		CategoriaDAO categoriaDAO = new CategoriaDAO(manager);
		
		Categoria celulares = new Categoria("Celulares");
		categoriaDAO.Cadastrar(celulares);
		
		Produto celular = new Produto("Samsumg A10", "Samsumg A10", new BigDecimal(800), celulares);
		
		manager.getTransaction().begin();
		categoriaDAO.Cadastrar(celulares);
		produtoDAO.Cadastrar(celular);
		manager.getTransaction().commit();
		manager.close();
	}
}
