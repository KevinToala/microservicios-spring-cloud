package com.sod.clientefacturacion;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClienteFacturaControlador {
	public static final String HTTP_SERVICIO_FACTURACION = "http://SERVICIO-FACTURACION/facturas";
	@Autowired
	@LoadBalanced
	protected RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "errorFactura")
	@GetMapping(value = "/facturas", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public FacturaDTO[] obtenerFacturas(){
		return restTemplate.getForObject(HTTP_SERVICIO_FACTURACION, FacturaDTO[].class);
	}
	
	public FacturaDTO[] errorFactura(){
		throw new RuntimeException("No se pudo obtener las facturas. Por favor, intentelo mas tarde.");
	}
	
	@PostMapping(value = "/facturas", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public FacturaDTO crearFactura(@RequestBody FacturaDTO factura){
		return restTemplate.postForObject(HTTP_SERVICIO_FACTURACION, factura, FacturaDTO.class);
	}
}
