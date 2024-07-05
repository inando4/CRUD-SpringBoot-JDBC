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
	
	
	

}
