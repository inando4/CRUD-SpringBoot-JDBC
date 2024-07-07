package com.app.web.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Departamentos")
public class Departamentos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iddpto;
	
	@Column(name = "Nombre", nullable=false)
	private String nombre;
	
	@Column(name = "Telefono", nullable=true)
	private String telefono;
	
	@Column(name = "Fax", nullable=true)
	private String fax;
	
	public Departamentos(){
		
	}

	public Departamentos(Integer iddpto, String nombre, String telefono, String fax) {
		super();
		this.iddpto = iddpto;
		this.nombre = nombre;
		this.telefono = telefono;
		this.fax = fax;
	}
	
	public Departamentos(String nombre, String telefono, String fax) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.fax = fax;
	}

	public Integer getIddpto() {
		return iddpto;
	}

	public void setIddpto(Integer iddpto) {
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
