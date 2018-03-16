package com.sod.clientes.controladores;

import com.sod.clientes.RuntimeUtil;
import com.sod.clientes.modelo.Cliente;
import com.sod.clientes.modelo.WrapRespuesta;
import com.sod.clientes.repositorios.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ClienteControlador {
	
	@Autowired
	private ClienteRepositorio clienteRepositorio;
	
	@GetMapping(value = "/clientes", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public WrapRespuesta<Cliente> obtenerClientes(){
		ArrayList<Cliente> clientes = new ArrayList<>();
		clienteRepositorio.findAll().forEach(cliente -> {
			clientes.add(cliente);
		});
		return new WrapRespuesta<>(RuntimeUtil.getPort(), clientes);
	}
}
