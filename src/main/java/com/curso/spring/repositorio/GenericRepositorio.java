package com.curso.spring.repositorio;

import java.util.List;

public interface GenericRepositorio <E, K> { 
//Yo llamo aqui a los metodos y este los recoge de los Repositories 
	//Producto E integer K
	E get(K id);
	E create(E entidad);
	E update(E entidad);
	void delete(K id);
	List<E> getAll();
		
}
