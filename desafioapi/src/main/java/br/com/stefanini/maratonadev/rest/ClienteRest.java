package br.com.stefanini.maratonadev.rest;

import br.com.stefanini.maratonadev.model.Cliente;
import br.com.stefanini.maratonadev.service.ClienteService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;

@Path("cliente")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ClienteRest {

    @Inject
    ClienteService clienteService;

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public Response cadastrar(Cliente cliente, @Context UriInfo uriInfo){
        long cpf = clienteService.cadastrar(cliente);
        UriBuilder uriBuilder = uriInfo.getAbsolutePathBuilder();
        uriBuilder.path(Long.toString(cpf));
        return Response.created(uriBuilder.build()).build();
    }
}
