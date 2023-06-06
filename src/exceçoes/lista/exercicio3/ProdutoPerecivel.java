package exceçoes.lista.exercicio3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;

public class ProdutoPerecivel extends ProdutoAbstrato{
    LocalDateTime dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String id, LocalDate dataValidade) {
        super(nome, preco, quantidade, id);
        this.dataValidade = dataValidade.atStartOfDay();
    }

    public boolean produtoVencido() {
        LocalDate dataAtual = LocalDate.now();
        return dataAtual.isAfter(ChronoLocalDate.from(this.dataValidade));
    }

    @Override
    public double calcularDesconto() {
        if (produtoVencido()) {
            return 0.0; // Produto vencido não possui desconto
        }

        LocalDate dataAtual = LocalDate.now();
        LocalDate dataLimite = LocalDate.from(dataValidade.minusDays(30));

        if (dataAtual.isAfter(dataLimite)) {
            // Calcula o desconto com base na proximidade da data de validade
            long diasRestantes = dataLimite.until(dataAtual).getDays();
            return (30 - diasRestantes) / 30.0 * 100.0;
        } else {
            return 0.0; // Produto ainda está dentro do prazo, sem desconto
        }
    }
    @Override
    public String toString() {
        return "Perecível";
    }

}
