package com.springboot.app.models.entities;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "operaciones")
public class Operacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
		
	@Column(nullable = false)
	private Integer cantidad;
	
	@Column(precision = 10, scale = 2, nullable = false)
	private BigDecimal monto;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_cliente")
	private Cliente cliente;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_tipo_operacion",nullable = false)
	private TipoOperacion tipoOperacion;
	
	
	@ManyToOne
	@JoinColumn(name = "id_libro",nullable = false)
	private Libro libro;
}
