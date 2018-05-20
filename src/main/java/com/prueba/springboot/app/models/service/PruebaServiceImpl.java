package com.prueba.springboot.app.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.springboot.app.models.dao.IPruebaDao;
import com.prueba.springboot.app.models.entity.Prueba;

@Service
public class PruebaServiceImpl implements IPruebaService{

	@Autowired
	private IPruebaDao pruebaDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Prueba> findAll() {
		// TODO Auto-generated method stub
		return (List<Prueba>) pruebaDao.findAll();
	}

	@Override
	@Transactional
	public void save(Prueba prueba) {
		// TODO Auto-generated method stub
		pruebaDao.save(prueba);
		
	}

	@Override
	@Transactional(readOnly = true)	
	public Prueba findOne(long id) {
		// TODO Auto-generated method stub
		return pruebaDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(long id) {
		// TODO Auto-generated method stub
		pruebaDao.deleteById(id);
	}

}
