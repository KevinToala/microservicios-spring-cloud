package com.sod.clientes.repositorios;

import com.sod.clientes.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepositorio extends CrudRepository<Cliente, Integer> {
}
