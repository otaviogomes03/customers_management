package dev.java10x.customermanagement;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_customer")
public class CustomerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int idade;
    private String email;

    public CustomerModel() {
    }

    public CustomerModel(String name, int idade, String email) {
        this.name = name;
        this.idade = idade;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
