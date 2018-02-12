package com.sod.clientefacturacion;

import java.math.BigDecimal;

public class FacturaDTO {
	private int id;
	private String numero;
	private String cliente;
	private String fecha;
	private BigDecimal total;
	
	private String puertoServicioObtuvo;
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getNumero(){
		return numero;
	}
	
	public void setNumero(String numero){
		this.numero = numero;
	}
	
	public String getCliente(){
		return cliente;
	}
	
	public void setCliente(String cliente){
		this.cliente = cliente;
	}
	
	public String getFecha(){
		return fecha;
	}
	
	public void setFecha(String fecha){
		this.fecha = fecha;
	}
	
	public BigDecimal getTotal(){
		return total;
	}
	
	public void setTotal(BigDecimal total){
		this.total = total;
	}
	
	public String getPuertoServicioObtuvo(){
		return puertoServicioObtuvo;
	}
	
	public void setPuertoServicioObtuvo(String puertoServicioObtuvo){
		this.puertoServicioObtuvo = puertoServicioObtuvo;
	}
}
