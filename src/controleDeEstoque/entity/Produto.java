package controleDeEstoque.entity;

import controleDeEstoque.repository.enums.Categoria;

public class Produto {
	private String id;
	private String nome;
	private Categoria categoria;
	private Integer quantidade;
	private Double preco;
	
	public Produto(String id, String nome, Categoria categoria, Integer quantidade, Double preco) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Integer getQuantidade() {
		return quantidade;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Double getPreco() {
		return preco;
	}
	
	@Override
	public String toString() {
		return "Produto [id=" + id +
				", nome=" + nome +
				", categoria=" + categoria +
				", quantidade=" + quantidade +
				", preco=" + preco + "]";
	}
}
