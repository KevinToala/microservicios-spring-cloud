package com.sod.clientes.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {
	@Id @GeneratedValue
	private int id;
	private String nombres;
	private String apellidos;
	private String identificacion;
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getNombres(){
		return nombres;
	}
	
	public void setNombres(String nombres){
		this.nombres = nombres;
	}
	
	public String getApellidos(){
		return apellidos;
	}
	
	public void setApellidos(String apellidos){
		this.apellidos = apellidos;
	}
	
	public String getIdentificacion(){
		return identificacion;
	}
	
	public void setIdentificacion(String identificacion){
		this.identificacion = identificacion;
	}
}
