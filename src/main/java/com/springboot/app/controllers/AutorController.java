package com.springboot.app.controllers;

import java.util.Optional;


import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.app.models.dtos.AutorDTO;

import com.springboot.app.models.services.IAutorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/libreriaAPI/v1/autor")
public class AutorController {

	private final IAutorService autorService;

	public AutorController(IAutorService autorService) {
		this.autorService = autorService;
	}

	@PostMapping()
	public ResponseEntity<?> saveAutor(@RequestBody @Valid AutorDTO autorDTO) {

		try {

			autorService.save(autorDTO);

			return new ResponseEntity<Object>("Autor creado", HttpStatus.CREATED);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Object>("Error al crear autor", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/all")
	public ResponseEntity<?> getAllAutor() {

		try {

			return new ResponseEntity<Object>(autorService.getAll(), HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<Object>("Error al obtener la informacion", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping()
	public ResponseEntity<?> getAutor(@RequestParam(required = false) Integer id,
			@RequestParam(required = false) String nombre) {

		try {

			if (id != null) {

				Optional<AutorDTO> autorDTO = autorService.findById(id);

				if (autorDTO.isPresent()) {
					return new ResponseEntity<Object>(autorDTO, HttpStatus.OK);
				}

				return ResponseEntity.notFound().build();

			} else if (nombre != null) {

				Optional<AutorDTO> autorDTO = autorService.findByNombre(nombre);

				if (autorDTO.isPresent()) {
					return new ResponseEntity<Object>(autorDTO, HttpStatus.OK);
				}

				return ResponseEntity.notFound().build();
			}

			return ResponseEntity.badRequest().build();
		} catch (Exception e) {
			return new ResponseEntity<Object>("Error al obtener la informacion", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
	@PatchMapping
	public ResponseEntity<?> updateAutor(@RequestBody @Valid AutorDTO autorDTO){
		
		try {
			
			if (autorDTO.getId()!=null) {
				
				
				Optional<AutorDTO> autor = autorService.update(autorDTO);
				
				
				if(autor.isPresent()) return new ResponseEntity<Object>(autor, HttpStatus.OK);
				
			}
			
			
			
			return new ResponseEntity<Object>("Autor no encontrado", HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<Object>("Error al actualizar la informacion", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
