package com.springboot.app.models.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "autores")
@Data
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String nombre;
	
	@Column(nullable = false)
	private LocalDate fecha_nac;
	
	@Column(nullable = true)
	private String email;
	
	@Column(nullable = true)
	private String website;
	
	@ManyToOne
	@JoinColumn(name = "id_pais",nullable = false)
	private Pais nacionalidad;
	
}
