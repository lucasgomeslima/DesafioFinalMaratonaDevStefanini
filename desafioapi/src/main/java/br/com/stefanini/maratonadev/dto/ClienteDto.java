package br.com.stefanini.maratonadev.dto;

public class ClienteDto {

    private long cpf;
    private String nome;

    private CarroDto carro;

    private EnderecoDto enderecoDto;

    private String email;

    private String contato;

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

    public CarroDto getCarro() {
        return carro;
    }

    public void setCarro(CarroDto carro) {
        this.carro = carro;
    }

    public EnderecoDto getEnderecoDto() {
        return enderecoDto;
    }

    public void setEnderecoDto(EnderecoDto enderecoDto) {
        this.enderecoDto = enderecoDto;
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
