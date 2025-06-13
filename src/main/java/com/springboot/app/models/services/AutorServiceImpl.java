package com.springboot.app.models.services;

import java.util.List;

import java.util.Optional;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.app.models.dao.IAutorDao;
import com.springboot.app.models.dao.IPaisDao;
import com.springboot.app.models.dtos.AutorDTO;
import com.springboot.app.models.entities.Autor;
import com.springboot.app.models.entities.Pais;

@Service
public class AutorServiceImpl implements IAutorService{

    private final IAutorDao autorDao;
    private final IPaisDao paisDao;


 

	public AutorServiceImpl(IAutorDao autorDao, IPaisDao paisDao) {		
		this.autorDao = autorDao;
		this.paisDao = paisDao;
	}


	@Override
	public Optional<AutorDTO> findById(Integer id) {

		Optional<Autor> autor = autorDao.findById(id);
		
		if (autor.isEmpty()) {
			return Optional.empty();
		}
		
		return Optional.of(new AutorDTO(autor.get()));
	}


	@Override
	@Transactional(readOnly = true)
	public List<AutorDTO> findByStatus(Short status) {
		
		return autorDao.findByStatus(status).stream().map(autor -> new AutorDTO(autor)).toList();
	}

	@Override
	@Transactional
	public Autor save(Autor autor) {
		
		return autorDao.save(autor);
	}

	@Override
	@Transactional
	public Autor save(AutorDTO autorDTO) {
		
		Optional<Pais> paisNac =  paisDao.findById(autorDTO.getIdPais());
		
		
		
	    if (paisNac.isEmpty()) {
	        throw new IllegalArgumentException("País no encontrado");
	    }

	    Autor autor = new Autor();
	    autor.setNombre(autorDTO.getNombre());
	    autor.setFecha_nac(autorDTO.getFechaNac());
	    autor.setEmail(autorDTO.getEmail());
	    autor.setWebsite(autorDTO.getWebsite());
	    autor.setNacionalidad(paisNac.get());

	    return autorDao.save(autor);
	}


	@Override
	@Transactional(readOnly = true)
	public List<AutorDTO> getAll() {
	    return autorDao.findAll()
	        .stream()
	        .map(autor -> new AutorDTO(autor))
	        .toList();
	}


	@Override
	@Transactional(readOnly = true)
	public Optional<AutorDTO> findByNombre(String nombre) {
		
		Optional<Autor> autor = autorDao.findByNombre(nombre);
		
		if (autor.isPresent()) {
			
			
			
			return Optional.of(new AutorDTO(autor.get()));
			
		}
		
		
		return Optional.empty();
	}

	

	@Override
	@Transactional
	public Optional<AutorDTO> update(AutorDTO autorDTO) {
		
		if (autorDao.existsById(autorDTO.getId())) {
			
			Optional<Pais> paisNac =  paisDao.findById(autorDTO.getIdPais());
			
			
			
		    if (paisNac.isEmpty()) {
		        throw new IllegalArgumentException("País no encontrado");
		    }
			
			
			Autor autor = autorDao.findById(autorDTO.getId()).get();
			
			autor.setNombre(autorDTO.getNombre());
			autor.setFecha_nac(autorDTO.getFechaNac());
			autor.setEmail(autorDTO.getEmail());
			autor.setWebsite(autorDTO.getWebsite());
			autor.setNacionalidad(paisNac.get());
			autor.setStatus(autorDTO.getStatus());
			
			
			
			return Optional.of(new AutorDTO(autorDao.save(autor)));
		}
		
		return Optional.empty();
	}

}
