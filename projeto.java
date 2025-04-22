import java.time.LocalDate;
import modelo.Cliente;
import modelo.Pet;
import servicos.BanhoETosa;

public class Main {
    public static void main(String[] args) {
        // Criando o cliente
        Cliente cliente = new Cliente("João", "11999999999", "joao@email.com");

        // Criando o pet
        Pet pet = new Pet("Rex", "Cachorro", "Labrador", 3, 25.0);
        cliente.adicionarPet(pet);

        // Criando a data de agendamento (hoje)
        LocalDate dataAgendamento = LocalDate.now();

        // Criando o serviço de Banho e Tosa, passando a data de agendamento
        BanhoETosa servico = new BanhoETosa(dataAgendamento);

        // Executando o serviço
        servico.executar();

        // Exibindo todas as informações detalhadas
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Email: " + cliente.getEmail());
        
        System.out.println("\nPet: " + cliente.getPets().get(0).getNome());
        System.out.println("Espécie: " + cliente.getPets().get(0).getEspecie());
        System.out.println("Raça: " + cliente.getPets().get(0).getRaca());
        System.out.println("Idade: " + cliente.getPets().get(0).getIdade());
        System.out.println("Peso: " + cliente.getPets().get(0).getPeso());
        
        System.out.println("Preço: R$ " + servico.getPreco());
        System.out.println("Data agendada: " + servico.getDataAgendamento());
    }
}
