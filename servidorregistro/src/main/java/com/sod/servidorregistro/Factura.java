package com.sod.servidorregistro;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "facturas")
public class Factura {
	private int id;
	
	@NotNull
	private String numero;
	
	@NotNull
	private String cliente;
	
	private LocalDateTime fecha;
	
	@NotNull
	private BigDecimal total;
	
	@Transient
	private String puertoServicioObtuvo;
	
	@Id
	@GeneratedValue
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
	
	public LocalDateTime getFecha(){
		return fecha;
	}
	
	public void setFecha(LocalDateTime fecha){
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
