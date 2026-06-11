package controleDeEstoque.repository;

import java.util.ArrayList;

import controleDeEstoque.entity.Produto;

public class ProdutoRepository {
	
	ArrayList<Produto> produtos = new ArrayList<>();
	
	public ProdutoRepository() {
		produtos = new ArrayList<Produto>();
	}

	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public ArrayList<Produto> listarProdutos() {
		return produtos;
	}
	
	public Produto encontrarProdutoPorID(String id) {
		for(int i = 0; i<produtos.size(); i++) {
			if(produtos.get(i).getId().equals(id)) {
				return produtos.get(i);
		}
	}
		
		return null;
}
	
	public void atualizarProdutoPorID(String id, Produto produtoNovo) {
		Produto produto = encontrarProdutoPorID(id);
		if(produto == null) {
			System.out.println("Produto não existe.");
			return;
		}
		
		if(produtoNovo.getNome() != null) {
			produto.setNome(produtoNovo.getNome());
		}
		
		if(produtoNovo.getCategoria() != null) {
			produto.setCategoria(produtoNovo.getCategoria());
		}
		
		if(produtoNovo.getQuantidade() != null) {
			produto.setQuantidade(produtoNovo.getQuantidade());
		}
		
		if(produtoNovo.getPreco() != null) {
			produto.setPreco(produtoNovo.getPreco());
		}
	}
	
	public boolean deletarProdutoPorID(String id) {
		Produto produto = encontrarProdutoPorID(id);
		if(produto == null) {
			System.out.println("Produto não existe.");
			return false;
		}
		
		produtos.remove(produto);
		return true;
	}
}
