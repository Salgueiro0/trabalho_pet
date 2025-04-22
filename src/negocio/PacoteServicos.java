package negocio;

import java.util.ArrayList;
import java.util.List;

import servicos.Servico;

public class PacoteServicos {
    private List<Servico> servicos;
    private double desconto;

    public PacoteServicos(double desconto) {
        this.servicos = new ArrayList<>();
        this.desconto = desconto;
    }

    public void adicionarServico(Servico servico) {
        servicos.add(servico);
    }

    public double calcularPrecoTotal() {
        double total = 0.0;
        for (Servico s : servicos) {
            total += s.getPreco();  // Acessando o preço do serviço diretamente
        }
        return total * (1 - desconto);  // Aplica o desconto
    }

    public List<Servico> getServicos() {
        return servicos;
    }
}
