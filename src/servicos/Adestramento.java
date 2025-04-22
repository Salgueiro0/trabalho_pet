package servicos;

import java.time.LocalDate;

public class Adestramento extends Servico {
    public Adestramento(LocalDate dataAgendamento) {
        super("Adestramento", 120.0, dataAgendamento);
    }

    @Override
    public void executar() {
        System.out.println("Sessão de adestramento realizada.");
    }
}
