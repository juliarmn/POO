package exceçoes.lista.exercicio3;

import java.util.Objects;

public class ProdutoNaoPerecivel extends ProdutoAbstrato{
    String categoria;

    public ProdutoNaoPerecivel(String nome, double preco, int quantidade, String id, String categoria) {
        super(nome, preco, quantidade, id);
        this.categoria = categoria;
    }

    boolean categoriaEspecial() {
        return Objects.equals(this.categoria, "para júlia");
    }

    @Override
    double calcularDesconto() {
        if (categoriaEspecial()) return super.getPreco() + 0.05;
        return 0;
    }
    @Override
    public String toString() {
        return "Não perecível";
    }
}
