package com.sod.clientefacturacion;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClienteFacturaControlador {
	@Autowired
	@LoadBalanced
	protected RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "errorFactura")
	@RequestMapping(value = "/facturas", method = RequestMethod.GET, produces = "application/json; charset=UTF-8")
	public String obtenerFacturas(){
		return restTemplate.getForObject("http://SERVICIO-FACTURACION/facturas", String.class);
	}
	
	public String errorFactura(){
		return "No se pudo obtener las facturas. Por favor, intentelo mas tarde.";
	}
}
