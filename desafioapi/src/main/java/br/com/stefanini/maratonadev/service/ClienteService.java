package br.com.stefanini.maratonadev.service;

import br.com.stefanini.maratonadev.dao.ClienteDao;
import br.com.stefanini.maratonadev.model.Cliente;


import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;


@RequestScoped
public class ClienteService {

    @Inject
    ClienteDao clienteDao;

    public long cadastrar(Cliente cliente){
        clienteDao.persist(cliente);
        clienteDao.flush();
        return cliente.getCpf();
    };
}
