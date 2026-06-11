package controleDeEstoque.entity;

import controleDeEstoque.repository.ProdutoRepository;
import controleDeEstoque.repository.enums.Categoria;

public class Main {

    public static void main(String[] args) {

        ProdutoRepository repository = new ProdutoRepository();

        Produto mouse = new Produto(
                "14ab",
                "Mouse",
                Categoria.ELETRONICOS,
                4,
                4.99
        );

        repository.adicionarProduto(mouse);

        System.out.println(repository.listarProdutos());
    }
}