package br.com.stefanini.maratonadev.model;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @CPF
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cpf;

    @Column
    @Size(min = 3, max = 100)
    private String nome;

    @OneToOne
    @JoinColumn(name = "carroFk")
    private Carro carro;

    @OneToOne
    private Endereco endereco;

    @Column
    @Email
    private String email;

    @Column
    private String contato;

    public Cliente(){};

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
}
