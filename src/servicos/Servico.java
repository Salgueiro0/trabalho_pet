package servicos;

import java.time.LocalDate;

public abstract class Servico {
    protected String descricao;
    protected double preco;
    protected LocalDate dataAgendamento;

    public Servico(String descricao, double preco, LocalDate dataAgendamento) {
        this.descricao = descricao;
        this.preco = preco;
        this.dataAgendamento = dataAgendamento;
    }

    public abstract void executar();

    // Getters e Setters
    public double getPreco() {
        return preco;  // Retorna o preço do serviço
    }

    public LocalDate getDataAgendamento() {
        return dataAgendamento;  // Retorna a data de agendamento
    }
}
