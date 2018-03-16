package com.sod.clientes.modelo;

import java.util.List;

public class WrapRespuesta<T> {
	private int puertoObtuvo;
	private List<T> data;
	
	public WrapRespuesta(){
	}
	
	public WrapRespuesta(int puertoObtuvo, List<T> data){
		this.puertoObtuvo = puertoObtuvo;
		this.data = data;
	}
	
	public int getPuertoObtuvo(){
		return puertoObtuvo;
	}
	
	public void setPuertoObtuvo(int puertoObtuvo){
		this.puertoObtuvo = puertoObtuvo;
	}
	
	public List<T> getData(){
		return data;
	}
	
	public void setData(List<T> data){
		this.data = data;
	}
}
