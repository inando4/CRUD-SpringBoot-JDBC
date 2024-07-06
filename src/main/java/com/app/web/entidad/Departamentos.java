package com.app.web.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamentos")
public class Departamentos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long iddpto;
	
	@Column(name = "nombre", nullable=false)
	private String nombre;
	
	@Column(name = "telefono", nullable=false)
	private String telefono;
	
	@Column(name = "fax", nullable=false)
	private String fax;
	
	public Departamentos(){
		
	}

	public Departamentos(Long iddpto, String nombre, String telefono, String fax) {
		super();
		this.iddpto = iddpto;
		this.nombre = nombre;
		this.telefono = telefono;
		this.fax = fax;
	}

	public Long getIddpto() {
		return iddpto;
	}

	public void setIddpto(Long iddpto) {
		this.iddpto = iddpto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Override
	public String toString() {
		return "Departamentos [iddpto=" + iddpto + ", nombre=" + nombre + ", telefono=" + telefono + ", fax=" + fax
				+ "]";
	}
	
}
