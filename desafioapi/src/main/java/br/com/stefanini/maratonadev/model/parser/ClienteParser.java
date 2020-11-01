package br.com.stefanini.maratonadev.model.parser;

import br.com.stefanini.maratonadev.dto.ClienteDto;
import br.com.stefanini.maratonadev.dto.EnderecoDto;
import br.com.stefanini.maratonadev.model.Cliente;

public class ClienteParser {

    public static ClienteParser get(){
        return  new ClienteParser();
    }

    public ClienteDto dto(Cliente entidade){
        ClienteDto dto = new ClienteDto();
        EnderecoDto enderecoDto = new EnderecoDto();

        dto.setNome(entidade.getNome());
        dto.setContato(entidade.getContato());
        dto.setCpf(entidade.getCpf());
        dto.setEmail(entidade.getEmail());

        enderecoDto.setBairro(entidade.getEndereco().getBairro());
        enderecoDto.setCep(entidade.getEndereco().getCep());
        enderecoDto.setCidade(entidade.getEndereco().getCidade());
        enderecoDto.setLogradouro(entidade.getEndereco().getLogradouro());
        enderecoDto.setUf(entidade.getEndereco().getUf());
        enderecoDto.setComplemento(enderecoDto.getComplemento());
        enderecoDto.setId(enderecoDto.getId());

        dto.setEnderecoDto(enderecoDto);

        return dto;
    }
}
