package br.com.mjv.noticias.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.mjv.noticias.model.Noticia;

public interface NoticiaDao  {

	List<Noticia> listarTodos();
	
	Page<Noticia> listarTodos(Pageable pageable);
	
}
