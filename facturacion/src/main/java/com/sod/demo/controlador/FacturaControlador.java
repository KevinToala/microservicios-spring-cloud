package com.sod.demo.controlador;

import com.sod.demo.RuntimeUtil;
import com.sod.demo.modelo.Factura;
import com.sod.demo.modelo.WrapRespuesta;
import com.sod.demo.repositorio.FacturaRepositorio;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
@Api(value="Facturas", description="Creación y obtención de facturas")
public class FacturaControlador {
	@Autowired
	private FacturaRepositorio facturaRepositorio;
	
	@GetMapping(value = "/facturas", produces = "application/json; charset=UTF-8")
	@ApiOperation(value = "Permite obtener el listado de facturas generadas", response = List.class)
	public WrapRespuesta<List<Factura>> obtenerFacturas(){
		ArrayList<Factura> facturas = new ArrayList<>();
		facturaRepositorio.findAll().forEach(factura -> {
			facturas.add(factura);
		});
		return new WrapRespuesta<>(RuntimeUtil.getPort(), facturas);
	}
	
	@PostMapping("/facturas")
	public WrapRespuesta<Factura> crearFactura(@RequestBody Factura factura){
		factura.setFecha(LocalDateTime.now());
		
		if(StringUtils.trimToNull(factura.getCliente()) == null)
			factura.setCliente("Consumidor Final");
		
		Factura facturaGuarda = facturaRepositorio.save(factura);
		
		return new WrapRespuesta<>(RuntimeUtil.getPort(), facturaGuarda);
	}
}
