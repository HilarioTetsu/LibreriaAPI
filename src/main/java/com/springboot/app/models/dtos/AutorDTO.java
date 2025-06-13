package com.springboot.app.models.dtos;

import java.time.LocalDate;

import org.hibernate.validator.constraints.URL;

import com.springboot.app.models.entities.Autor;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class AutorDTO {

	private Integer id;
	@NotBlank
	private String nombre;
	@NotNull
	private LocalDate fechaNac;
	@Email
	private String email;
	@URL
	private String website;
	@NotNull
	private Short idPais;
	private Short status;
	
    public AutorDTO(Autor autor) {
        this.id = autor.getId();
        this.nombre = autor.getNombre();
        this.email = autor.getEmail();
        this.website = autor.getWebsite();
        this.fechaNac = autor.getFecha_nac(); 
        this.idPais = autor.getNacionalidad().getId();
        this.status=autor.getStatus();
    }
	
}
