package com.sod.demo.repositorio;

import com.sod.demo.modelo.Factura;
import org.springframework.data.repository.CrudRepository;

public interface FacturaRepositorio extends CrudRepository<Factura, Integer> {
}
