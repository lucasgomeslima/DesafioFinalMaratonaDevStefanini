package br.com.stefanini.maratonadev.dao;

import br.com.stefanini.maratonadev.model.Cliente;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.client.Client;

@RequestScoped
public class ClienteDao implements PanacheRepository<Cliente> {
}
