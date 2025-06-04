package com.springboot.app.models.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "editoriales")
@Data
public class Editorial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String nombre;
	
	@Column(nullable = false)
	private String direccion_fisica;
	
	@Column(nullable = false)
	private String telefono;
	
	@Column(nullable = false)
	private String email;

	@Column(nullable = true)
	private String website;

	@ManyToOne
	@JoinColumn(name = "id_pais", nullable = false)
	private Pais pais;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "editorial")
	private List<Libro> libros;

}
