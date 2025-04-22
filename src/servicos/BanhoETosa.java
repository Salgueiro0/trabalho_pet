package servicos;

import java.time.LocalDate;

public class BanhoETosa extends Servico {

    public BanhoETosa(LocalDate dataAgendamento) {
        super("Banho e Tosa", 50.0, dataAgendamento);
    }

    @Override
    public void executar() {
        System.out.println("Executando serviço de banho e tosa.");
    }

	public String getDescricao() {
		// TODO Auto-generated method stub
		return null;
	}
}
