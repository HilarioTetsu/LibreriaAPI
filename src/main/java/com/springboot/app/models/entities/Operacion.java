package com.springboot.app.models.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
	
	@Column(name = "fecha_creacion")
	@NotNull
	private LocalDateTime  fechaCreacion;

	@Column(length = 20, name = "usuario_creacion")
	@NotBlank
	@Size(max = 20)
	private String usuarioCreacion;

	
	@Column(name = "fecha_modificacion", nullable = true)
	private LocalDateTime  fechaModificacion;

	@Column(length = 20, nullable = true, name = "usuario_modificacion")
	@Size(max = 20)
	private String usuarioModificacion;

	@NotNull
	private Short status;
	
	@PrePersist
    public void prePersist() {
        this.fechaCreacion = LocalDateTime.now();       
    }

    @PreUpdate
    public void preUpdate() {
        this.fechaModificacion = LocalDateTime.now();        
    }
}
