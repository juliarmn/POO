package exceçoes.lista.exercicio3;

import java.util.ArrayList;

public class ControleEstoque {
    ArrayList<ProdutoAbstrato> produtos = new ArrayList<>();
    void adicionarProduto(ProdutoAbstrato produto) {
        produtos.add(produto);
    }
    void removerProduto(String id) {
        produtos.removeIf(p -> p.getId().equals(id));
    }

    void listarProdutos() {
        for (ProdutoAbstrato p : produtos) {
            System.out.println("=================");
            System.out.println(p.toString());
            System.out.println(p.getNome());
            System.out.println(p.getId());
            System.out.println(p.getPreco());
            System.out.println(p.getQuantidade());
        }
    }
    ProdutoAbstrato buscarProduto(String id) {
        for (ProdutoAbstrato p : produtos) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    void aplicarDesconto(String id) {
        ProdutoAbstrato p = buscarProduto(id);
        System.out.println("Desconto de: " + p.calcularDesconto());
    }
}
