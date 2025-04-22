package servicos;

import java.time.LocalDate;

public class ConsultaVeterinaria extends Servico {
    public ConsultaVeterinaria(LocalDate dataAgendamento) {
        super("Consulta Veterinária", 80.0, dataAgendamento);
    }

    @Override
    public void executar() {
        System.out.println("Executando consulta veterinária.");
    }
}
