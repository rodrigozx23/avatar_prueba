package com.prueba.springboot.app.models.service;

import java.util.List;

import com.prueba.springboot.app.models.entity.Prueba;

public interface IPruebaService {
	
	public List<Prueba> findAll();
	
	public void save(Prueba prueba);
	
	public Prueba findOne(long id);
	
	public void delete(long id);
	
}
