package com.sod.demo.modelo;

public class WrapRespuesta<T> {
	private int puertoObtuvo;
	private T data;
	
	public WrapRespuesta(){
	}
	
	public WrapRespuesta(int puertoObtuvo, T data){
		this.puertoObtuvo = puertoObtuvo;
		this.data = data;
	}
	
	public int getPuertoObtuvo(){
		return puertoObtuvo;
	}
	
	public void setPuertoObtuvo(int puertoObtuvo){
		this.puertoObtuvo = puertoObtuvo;
	}
	
	public T getData(){
		return data;
	}
	
	public void setData(T data){
		this.data = data;
	}
}
