package com.restConcesionario;

public class Coche {

	private String modelo;
	private String marca;
	private String color;
	private String caballos;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getCaballos() {
		return caballos;
	}
	public void setCaballos(String caballos) {
		this.caballos = caballos;
	}
	@Override
	public String toString() {
		return "Coche [modelo=" + modelo + ", marca=" + marca + ", color=" + color + ", caballos=" + caballos + "]";
	}
	
	
	
	
	
}
