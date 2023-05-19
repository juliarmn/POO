package interfaceaula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Supermercado {
    public static void main(String[] args) {
        Biscoito b1 = new Biscoito("Oreo", 12, 5);
        Biscoito b2 = new Biscoito("Negresco", 11, 7);

        Shampoo s1 = new Shampoo("Seda", 30, 7);
        Shampoo s2 = new Shampoo("Vichy", 70, 1);

        Leite l1 = new Leite("Parmalat", 10, 2);
        Leite l2 = new Leite("sei lá", 7, 4);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(s1);
        produtos.add(s2);
        produtos.add(b1);
        produtos.add(b2);
        produtos.add(l1);
        produtos.add(l2);

        Collections.sort(produtos);

        // Exibindo os produtos ordenados
        System.out.println("Produtos ordenados por custo-benefício:");
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - Preço: R$" + produto.getPreco());
        }
    }
}
