package com.sod.demo.controlador;

import com.sod.demo.RuntimeUtil;
import com.sod.demo.modelo.Factura;
import com.sod.demo.repositorio.FacturaRepositorio;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@Api(value="Facturas", description="Creación y obtención de facturas")
public class FacturaControlador {
	@Autowired
	private FacturaRepositorio facturaRepositorio;
	
	@RequestMapping(value = "/facturas", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	@ApiOperation(value = "Permite obtener el listado de facturas generadas", response = List.class)
	public List<Factura> obtenerFacturas(HttpServletResponse response){
		ArrayList<Factura> facturas = new ArrayList<>();
		facturaRepositorio.findAll().forEach(factura -> {
			factura.setPuertoServicioObtuvo(String.valueOf(RuntimeUtil.getPort()));
			facturas.add(factura);
		});
		return facturas;
	}
}
