package com.cspring.demo.services;

import java.util.List;

import com.cspring.demo.entities.Cliente;

public interface ClienteService {

    List<Cliente> getAllClientes();

    Cliente getClienteById(Long id);

    Cliente createCliente(Cliente cliente);

    Cliente updateCliente(Long id, Cliente cliente);

    void deleteCliente(Long id);
}
