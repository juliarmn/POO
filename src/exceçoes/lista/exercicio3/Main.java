package exceçoes.lista.exercicio3;


import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {
            ControleEstoque estoque = new ControleEstoque();

            // Adicionar produtos
            ProdutoAbstrato produtoPerecivel = new ProdutoPerecivel("Leite", 3.5, 10, "001", LocalDate.of(2023, 5, 31));
            estoque.adicionarProduto(produtoPerecivel);

            ProdutoAbstrato produtoNaoPerecivel = new ProdutoNaoPerecivel("Bolacha", 2.0, 20, "002", "Alimentos");
            estoque.adicionarProduto(produtoNaoPerecivel);

            // Listar produtos
            estoque.listarProdutos();

            // Remover produto
            estoque.removerProduto("001");

            // Listar produtos novamente
            estoque.listarProdutos();
            System.out.println("Preco de 002 " + produtoNaoPerecivel.getPreco());
            // Aplicar desconto
            estoque.aplicarDesconto("002");

            ProdutoAbstrato p = estoque.buscarProduto("002");
            if(p != null) {
                System.out.println("O produto é " + p.getNome());
                System.out.println("Com desconto: " + p.getPreco());
            } else {
                System.out.println("Não achou");
            }

        }

}
