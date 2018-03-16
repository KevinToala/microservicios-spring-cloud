package com.sod.demo.modelo;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "facturas")
public class Factura {
	@ApiModelProperty(required = false, readOnly = true)
	private int id;
	
	@NotNull
	@ApiModelProperty(notes = "Numero de la factura con el formato 000-000-000000000", required = true)
	private String numero;
	
	@NotNull
	@ApiModelProperty(notes = "Nombres y apellidos del cliente. Si es para consumidor final dejar vacio", required = false)
	private String cliente;
	
	@ApiModelProperty(notes = "Fecha de creación de la factura", required = false)
	private LocalDateTime fecha;
	
	@NotNull
	@ApiModelProperty(notes = "Total de la factura", required = true)
	private BigDecimal total;
	
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
}
