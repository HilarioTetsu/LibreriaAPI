package com.springboot.app.models.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "clientes")
@Data
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	
	@Column(nullable = false)
	private String nombre;
	
	@Column(nullable = false,name="apellido_paterno")
	private String apellidoPaterno;
	@Column(nullable = false,name="apellido_materno")
	private String apellidoMaterno;
	
	@Column(nullable = false)
	private LocalDate fechaNac;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String telefono;
	
	@Column(nullable = true)
	private String direccion;
	
	@Column(nullable = false,name="autorizacion_prestamo")
	private Boolean autorizacionPrestamo;
	
	@OneToMany(mappedBy = "cliente",fetch = FetchType.LAZY)
	private List<Operacion> operaciones;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "cliente")
	private List<Prestamo> prestamos;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "cliente")
	private List<Suscripcion> suscripciones;
	
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
