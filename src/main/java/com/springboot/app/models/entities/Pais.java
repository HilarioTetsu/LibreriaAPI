package com.springboot.app.models.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "paises")
@Data
public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short id;
	
	@Column(nullable = false)
	private String pais;
	
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "pais")
	private List<Editorial> listEditoriales;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "nacionalidad")
	private List<Autor> listAutores;
	
	
}
