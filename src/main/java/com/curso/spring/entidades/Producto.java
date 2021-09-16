package com.curso.spring.entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;


@Entity
@Table(name = "productos")
public class Producto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Attr
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Size(min = 10, max = 50)
	@Column(name = "NOMBRE_PRODUCTO")
	private String nombre;
	
	@Size(min = 10, max = 250)
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	@DecimalMin("0.1")
	@Column(name = "PRECIO")
	private Double precio;
	
	@Min(1)
	@Column(name = "UNIDADES")
	private Integer unidadesStock;
	
	
	public Producto() {
		
	}



	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Double getPrecio() {
		return precio;
	}


	public void setPrecio(Double precio) {
		this.precio = precio;
	}


	public Integer getUnidadesStock() {
		return unidadesStock;
	}


	public void setUnidadesStock(Integer unidadesStock) {
		this.unidadesStock = unidadesStock;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio
				+ ", unidadesStock=" + unidadesStock + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(id, other.id);
	}

}
