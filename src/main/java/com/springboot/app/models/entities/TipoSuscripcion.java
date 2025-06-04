package com.springboot.app.models.entities;

import java.math.BigDecimal;
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
@Table(name = "tipo_suscripcion")
public class TipoSuscripcion {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false,name="tipo_suscripcion")
	private String tipoSuscripcion;
	
	@Column(precision = 10, scale = 2, nullable = false)
	private BigDecimal costo;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "tipoSuscripcion")
	private List<Suscripcion> suscripciones;
	
}
