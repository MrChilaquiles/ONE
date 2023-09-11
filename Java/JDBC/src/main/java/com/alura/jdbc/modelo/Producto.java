package com.alura.jdbc.modelo;

public class Producto {

	private Integer Id;
	private String nombre;
	private String descripcion;
	private Integer cantidad;

	public Producto(String nombre, String descripcion, Integer cantidad) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}

	public Producto(int Id, String nombre, String descripcion, int cantidad) {
		this.Id = Id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}

	public Integer getId() {
		return this.Id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	@Override
	public String toString() {
		return String.format("Id: %s, nombre: %s, descripcion: %s, cantidad: %d", this.Id, this.nombre,
				this.descripcion, this.cantidad);
	}

}
