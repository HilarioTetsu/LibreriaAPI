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
@Data
@Table(name = "tipo_operaciones")
public class TipoOperacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short id;
	
	@Column(nullable = false,name = "tipo_operacion")
	private String tipoOperacion;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "tipoOperacion")
	private List<Operacion> operaciones;

}
