package servicos;

import java.time.LocalDate;

public class Hospedagem extends Servico {
    public Hospedagem(LocalDate dataAgendamento) {
        super("Hospedagem", 100.0, dataAgendamento);
    }

    @Override
    public void executar() {
        System.out.println("Hospedagem iniciada.");
    }
}
