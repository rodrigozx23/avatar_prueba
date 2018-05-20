package com.prueba.springboot.app.controllers;

import java.util.ArrayList;
import java.util.Map;
//import java.util.Objects;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.prueba.springboot.app.models.entity.Prueba;
import com.prueba.springboot.app.models.service.IPruebaService;

@Controller
public class PruebaController {

	@Autowired
	private IPruebaService pruebaService;
	
	@RequestMapping(value="/index")
	public String view_formulario (Map<String,Object> model) {
		// item = new Item();
		//model.put("Item", item);		
		model.put("titulo","Formulario");
		model.put("clase", "Tabla");	
		return "layout/layout";
	}
	
	@RequestMapping(value="/persona", method=RequestMethod.POST)
	public ResponseEntity<String> guardar_prueba(@RequestBody Prueba prueba) {
		String mensaje = "";
		//long id = Long.parseLong(id_prueba);	
		if(Objects.isNull(prueba.getId()) || prueba.getId() == 0){
			pruebaService.save(prueba);	
			mensaje ="Se creo Exitosamente";
		}
		else {
			pruebaService.save(prueba);	
			mensaje ="Se modifico Exitosamente";
		}
			
		return new ResponseEntity<String>(mensaje,HttpStatus.CREATED);
	}

	@RequestMapping(value="/Lista", method=RequestMethod.POST)
	@ResponseBody
	public ArrayList<Prueba> listar() {
		ArrayList<Prueba> listPrueba = new ArrayList<Prueba>(pruebaService.findAll());
		return listPrueba;
	}
	
	@RequestMapping(value="/ObtenerPrueba", method=RequestMethod.POST)
	@ResponseBody
	public Prueba obtenerPrueba(@RequestBody String id_prueba) {	
		long id = Long.parseLong(id_prueba);		
		Prueba prueba = new Prueba();
		prueba = pruebaService.findOne(id);
		return prueba;		
	}
	
	@RequestMapping(value="/Eliminar", method=RequestMethod.POST)	
	@ResponseBody
	public ResponseEntity<String> eliminar(@RequestBody String id_prueba) {	
		String mensaje = "Se elimino exitosamente";
		long id = Long.parseLong(id_prueba);	
		pruebaService.delete(id);
		return new ResponseEntity<String>(mensaje,HttpStatus.OK);
	}
}
