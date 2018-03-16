package com.sod.servidorregistro;

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
}
