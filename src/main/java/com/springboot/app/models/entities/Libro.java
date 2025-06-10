package com.springboot.app.models.entities;

import java.time.LocalDateTime;
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
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name = "libros")
public class Libro {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(nullable = false)
	private String titulo;
	
	@Column(nullable = false)
	private Short paginas;
	
	@Column(nullable = false)
	private String isbn;
	
	@Column(nullable = false,name = "año_publicacion")
	private Short añoPublicacion;
	
	@Column(nullable = false)
	private String descripcion;
	
	@Column(nullable = false)
	private Short stocK;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_idioma")
	private Idioma idioma;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_editorial",nullable = false)
	private Editorial editorial;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "libro")
	private List<LibroAutor> libroAutor;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "libro")
	private List<LibroGenero> libroGenero;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "libro")
	private List<Operacion> operaciones;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "libro")
	private List<Prestamo> prestamos;
	
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
