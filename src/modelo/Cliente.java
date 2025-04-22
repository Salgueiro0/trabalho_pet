package modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private List<Pet> pets;

    public Cliente(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.pets = new ArrayList<>();
    }

    public void adicionarPet(Pet pet) {
        pets.add(pet);
    }

    public void removerPet(Pet pet) {
        pets.remove(pet);
    }

    public List<Pet> getPets() {
        return pets;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
}
