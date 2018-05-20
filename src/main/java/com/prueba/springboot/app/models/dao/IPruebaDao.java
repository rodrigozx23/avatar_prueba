package com.prueba.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.prueba.springboot.app.models.entity.Prueba;;

public interface IPruebaDao extends CrudRepository<Prueba, Long>{

}
